package com.up.aop;

import com.up.aop.config.AopConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author xu.qiang
 * @date 20/2/7
 */
public class AopApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext application = new AnnotationConfigApplicationContext(AopConfig.class);

        DoService bean = application.getBean(DoService.class);

        bean.doService();
    }
}
