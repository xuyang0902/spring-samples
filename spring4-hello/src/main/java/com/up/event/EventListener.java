package com.up.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author xu.qiang
 * @date 20/2/8
 */
@Component
public class EventListener implements ApplicationListener<MyEvent> {
    @Override
    public void onApplicationEvent(MyEvent event) {

        System.out.println("-->>>listen->" + event.getMsg());
    }
}
