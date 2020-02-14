package com.up.scope;

import com.up.scope.bean.BeanA;
import com.up.scope.bean.BeanB;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author xu.qiang
 * @date 20/2/8
 */
@ComponentScan(basePackages = "com.up.scope")
public class ScopeApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ScopeApplication.class);

        BeanA bean = applicationContext.getBean(BeanA.class);
        BeanA bean1 = applicationContext.getBean(BeanA.class);

        System.out.println(bean == bean1);
        BeanB bean2 = applicationContext.getBean(BeanB.class);
        BeanB bean3 = applicationContext.getBean(BeanB.class);
        System.out.println(bean3 == bean2);

    }
}
