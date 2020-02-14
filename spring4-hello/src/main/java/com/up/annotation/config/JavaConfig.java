package com.up.annotation.config;

import com.up.annotation.factorybean.MyFactoryBean;
import com.up.annotation.imports.ImportBean;
import com.up.annotation.imports.MyImportBeanDefinitionRegistrar;
import com.up.annotation.imports.MyImportSelector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.util.HashMap;

/**
 * @author xu.qiang
 * @date 20/2/7
 */
@ComponentScan("com.up.annotation")
@Configuration //是一个配置类的意思，相当于一个xml
@Import({ImportBean.class, MyImportSelector.class, MyImportBeanDefinitionRegistrar.class})
public class JavaConfig {


    //相当于xml文件中定义bean
    @Bean
    public HashMap<String,String> myMap(){

        HashMap<String, String> map = new HashMap<>();
        map.put("name","yuren");
        map.put("age","18");
        return map;
    }

    @Bean
    public MyFactoryBean myFactoryBean(){
        return new MyFactoryBean();
    }

}
