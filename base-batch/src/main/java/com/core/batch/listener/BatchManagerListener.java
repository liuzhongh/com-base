package com.core.batch.listener;

import com.core.batch.manager.BatchManager;
import com.shangkang.core.exception.ServiceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 起动任务线管理池管理器
 * Jan 6, 2010
 * Liuzh
 */
public class BatchManagerListener
{
	/**
	 * serial no
	 */
	private static final long serialVersionUID = 1L;

	private static Logger log				= LoggerFactory.getLogger(BatchManagerListener.class);

	/**
	 * Initialize the root web application context.
	 */
	public static void main(String strs[])
	{		
		try {

			log.info("后台批量定时任务开始启动.");

			BatchManager.start();

//			CycleTimeManger.getInstance().startCycleTimeServer();
		}
		catch (Exception e) {
			log.error(e.getMessage(), e);
		}

		log.info("后台批量定时任务已成功启动.");

		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				try {
					BatchManager.stop();
					StringBuilder flag = new StringBuilder(".");

					while (BatchManager.isServerAlive()) {
                        try {
                            Thread.sleep(1000 * 1);
                            log.info("业务线程还没处理完, 请等待" + flag.toString());
							flag.append(".");
                        } catch (InterruptedException e) {
							log.error(e.getMessage(), e);
                        }
                    }
				} catch (Exception e) {
					log.error(e.getMessage(), e);
				}
				log.info("业务线程执行完毕, JVM退出");
			}
		});

	}

}
