package com.up.annotation.imports;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author xu.qiang
 * @date 20/2/13
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {


        BeanDefinition beanDefinition = new RootBeanDefinition(LBean.class);
        beanDefinition.setLazyInit(false);

        registry.registerBeanDefinition("lBean",beanDefinition);
    }
}
