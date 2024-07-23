package org.example.springdoa.dbexample.aspect;

import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@Aspect
@Log4j2


public class LoggingAspect {


    @Before("execution(* org.example.springdoa.dbexample.AccountDAOImpl.findByAccountId(..))")
    public  void before(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        System.out.println("(Before Advice)Input to method: "
                +joinPoint.getSignature().getName() + " with args: " +args[0]);
        log.info("Input to Method :{} with args :{}", joinPoint.getSignature().getName(), args[0]);
    }

    @After("execution(* org.example.springdoa.dbexample.AccountDAOImpl.findByAccountId(..))")
    public  void after(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        System.out.println("(After Advice )Input to method: "+joinPoint.getSignature().getName() + " with args: " +args[0]);
    }

    @AfterReturning(pointcut = "execution(* org.example.springdoa.dbexample.AccountDAOImpl.findByAccountID(..))",returning = "object")
    public void logAfterReturning(JoinPoint joinPoint ,Object object){
        log.info("Method:{} joinPoint.getSignature.getName with return value: {object}");
        System.out.println("(After Returning  )Input to method: "+
                joinPoint.getSignature().getName() + " with object: " +object);

    }


}
