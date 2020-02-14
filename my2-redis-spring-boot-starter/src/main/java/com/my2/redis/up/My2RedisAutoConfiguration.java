package com.my2.redis.up;

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
@EnableConfigurationProperties({My2RedisProperties.class}) //redis配置类需要生效
public class My2RedisAutoConfiguration {


    /**
     * 构建Jedis Client 假如没有这个对象的话
     * @param my2RedisProperties
     * @return
     */
    @Bean
    @ConditionalOnMissingBean
    public Jedis jedis(My2RedisProperties my2RedisProperties){
        return new Jedis(my2RedisProperties.getHost(), my2RedisProperties.getPort());
    }


}
