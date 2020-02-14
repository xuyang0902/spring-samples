package com.up.condition.config;

import com.up.condition.MacCondition;
import com.up.condition.WindowsCondition;
import com.up.condition.service.IService;
import com.up.condition.service.MacS;
import com.up.condition.service.WindowsS;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author xu.qiang
 * @date 20/2/8
 */
@Configuration
public class ConditionConfig {

    @Bean
    @Conditional(MacCondition.class)
    public IService macS(){
        return new MacS();
    }

    @Bean
    @Conditional(WindowsCondition.class)
    public IService windosS(){
        return new WindowsS();
    }
}
