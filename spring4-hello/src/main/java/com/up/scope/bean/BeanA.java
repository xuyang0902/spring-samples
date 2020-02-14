package com.up.scope.bean;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author xu.qiang
 * @date 20/2/8
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BeanA {


    public BeanA() {

        System.out.println("-->>> 构造器-" + this.getClass().getName());
    }
}
