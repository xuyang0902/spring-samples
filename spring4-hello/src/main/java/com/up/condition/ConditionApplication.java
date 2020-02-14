package com.up.condition;

import com.up.condition.service.IService;
import com.up.scope.ScopeApplication;
import com.up.scope.bean.BeanA;
import com.up.scope.bean.BeanB;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author xu.qiang
 * @date 20/2/8
 */
@ComponentScan("com.up.condition")
public class ConditionApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConditionApplication.class);


        IService bean = applicationContext.getBean(IService.class);


        System.out.println(bean.getClass().getName());
    }
}
