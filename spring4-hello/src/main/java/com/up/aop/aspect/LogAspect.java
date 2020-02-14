package com.up.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author xu.qiang
 * @date 20/2/7
 */
@Component
@Aspect
public class LogAspect {

    @Pointcut("@annotation(com.up.aop.annotation.DoAction)")
    public void pointcut(){

    }


    @Around("pointcut()")
    public Object doAroud(ProceedingJoinPoint joinPoint) throws Throwable {


        System.out.println(" before do...");
        Object proceed = joinPoint.proceed();
        System.out.println(" after do...");


        return proceed;
    }
}
