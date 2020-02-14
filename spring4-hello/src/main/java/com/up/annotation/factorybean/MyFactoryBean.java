package com.up.annotation.factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author xu.qiang
 * @date 20/2/13
 */
public class MyFactoryBean implements FactoryBean<RealBean>{
    @Override
    public RealBean getObject() throws Exception {
        return new RealBean();
    }

    @Override
    public Class<?> getObjectType() {
        return RealBean.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
