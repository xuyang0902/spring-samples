package com.my1.redis.up;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.Jedis;

/**
 * @author xu.qiang
 * @date 20/2/14
 */
@Configuration//配置文件
@ConditionalOnClass(Jedis.class)//必须要有Jedis的类才加载
@EnableConfigurationProperties({My1RedisProperties.class}) //redis配置类需要生效
public class My1RedisAutoConfiguration {


    /**
     * 构建Jedis Client 假如没有这个对象的话
     * @param my1RedisProperties
     * @return
     */
    @Bean
    @ConditionalOnMissingBean
    public Jedis jedis(My1RedisProperties my1RedisProperties){
        return new Jedis(my1RedisProperties.getHost(), my1RedisProperties.getPort());
    }


}
