package com.up.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author xu.qiang
 * @date 20/2/8
 */
public class MyEvent extends ApplicationEvent {


    private String msg ;
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public MyEvent(Object source) {
        super(source);
    }

    public MyEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }


    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
