package com.pkt.springcloud.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class LoggingAspect {
    private Logger logger= LoggerFactory.getLogger(getClass());

    @Around("execution(* org.pkt.*.*(..))")
    public Object log(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        logger.info("Begin execution of "+proceedingJoinPoint.getSignature());
        Object result=proceedingJoinPoint.proceed(proceedingJoinPoint.getArgs());
        logger.info("End Execution of "+proceedingJoinPoint.getSignature());
        return result;
    }
}
