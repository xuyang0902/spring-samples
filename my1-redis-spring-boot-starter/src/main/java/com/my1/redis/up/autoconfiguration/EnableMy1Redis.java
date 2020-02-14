package com.my1.redis.up.autoconfiguration;

import com.my1.redis.up.My1RedisAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * 使用Enable的方式 使springbootstarter生效
 * @author xu.qiang
 * @date 20/2/14
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import({My1RedisAutoConfiguration.class})
public @interface EnableMy1Redis {

}
