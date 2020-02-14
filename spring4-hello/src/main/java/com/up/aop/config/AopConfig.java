package com.up.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 *
 EnableAspectJAutoProxy
 开启aspect拦截

 proxyTargetClass= false 接口使用jdk 非接口使用cglib
 proxyTargetClass=true 强制使用jdk
 *
 * @author xu.qiang
 * @date 20/2/7
 */
@Configuration
@ComponentScan("com.up.aop")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AopConfig {
}
