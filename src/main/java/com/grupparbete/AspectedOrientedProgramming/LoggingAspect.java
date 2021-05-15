package com.grupparbete.AspectedOrientedProgramming;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;


@Configuration
@Aspect
public class LoggingAspect {

    Logger logger = LoggerFactory.getLogger(LoggingAspect.class);


  @Before (value = "execution(* com.grupparbete.controllers.*.*(..))")
  public void beforeAdvice (JoinPoint joinPoint){
      logger.info("Incoming request to:"+
              joinPoint.getSignature().getDeclaringTypeName() +" -" +
              joinPoint.getSignature().getName());

  }

}
