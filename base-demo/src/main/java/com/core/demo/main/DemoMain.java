package com.core.demo.main;

import com.core.batch.listener.BatchManagerListener;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by liuzh on 16-4-14.
 */
public class DemoMain {
    public static void main(String[] strs)
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-core.xml");

        BatchManagerListener.main(strs);

    }
}
