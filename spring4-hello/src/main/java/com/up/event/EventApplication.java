package com.up.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author xu.qiang
 * @date 20/2/8
 */
@ComponentScan("com.up.event")
public class EventApplication {

    public static void main(String[] args) throws InterruptedException {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(EventApplication.class);

        MyEventPublish bean = applicationContext.getBean(MyEventPublish.class);
        bean.publish("发布一个事件");

        Thread.sleep(1000);

        applicationContext.close();
    }
}
