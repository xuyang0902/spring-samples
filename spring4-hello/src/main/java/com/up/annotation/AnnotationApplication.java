package com.up.annotation;

import com.up.annotation.config.JavaConfig;
import com.up.annotation.factorybean.MyFactoryBean;
import com.up.annotation.service.PersonService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**

 @Component
 @Service
 @Configuration
 @Autowired
 @ComponentScan

 */

public class AnnotationApplication {


    public static void main( String[] args ) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);

        PersonService bean = applicationContext.getBean(PersonService.class);

        bean.eat();


        HashMap<String,String> myMap = (HashMap<String, String>) applicationContext.getBean("myMap");

        Set<Map.Entry<String, String>> entries = myMap.entrySet();

        for (Map.Entry<String, String> entry : entries) {

            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }

        System.out.println("---->>>");

        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String definitionName : definitionNames) {
            System.out.println(definitionName);
        }


        System.out.println("#######");
        Object myFactoryBean = applicationContext.getBean("myFactoryBean");
        System.out.println(myFactoryBean.getClass());

    }
}
