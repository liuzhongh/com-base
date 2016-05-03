package com.batch;

import com.rest.service.resteasy.NettyServer;
import com.rest.service.security.AnonPermission;
import com.rest.service.security.SecurePermission;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

/**
 * Created by qianjia on 2016/3/21.
 */
public class RestGeneralMain {
    public static void main(String[] args) throws Exception {

        com.rest.service.main.Main.main(args);
    }
}
