package com.up.scope.bean;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author xu.qiang
 * @date 20/2/8
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BeanB {


    public BeanB() {

        System.out.println("-->>> 构造器-" + this.getClass().getName());
    }
}
