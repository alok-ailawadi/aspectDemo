package com.alok.aspect;

import com.alok.EncryptionService.service.EncryptionService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * Created by Alok on 1/24/2017.
 */
@Aspect
@Component
public class EncryptionAspect {

    @Autowired
    EncryptionService encryptionService;

    @Pointcut("@annotation(com.alok.annotations.Encrypt)")
    public void encryptPointCutDefinition(){
    }

    @Pointcut("@annotation(com.alok.annotations.Decrypt)")
    public void decryptPointCutDefinition(){
    }

    //Defines a pointcut that we can use in the @Before,@After, @AfterThrowing, @AfterReturning,@Around specifications
    //The pointcut is a catch all pointcut with the scope of execution
    @Pointcut("execution(* *(..))")
    public void atExecution(){}


    @Around("encryptPointCutDefinition() && atExecution()")
    public void encrypt(ProceedingJoinPoint point)
    {
        Object[] args = point.getArgs();
        if(args[0]!=null && args[0] instanceof String)
        {
           args[0] = encryptionService.encrypt((String) args[0]) ;
        }


        try {
            point.proceed(args);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

    }
}
