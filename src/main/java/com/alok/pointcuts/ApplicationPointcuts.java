package com.alok.pointcuts;

import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by Alok on 1/24/2017.
 */
public class ApplicationPointcuts {

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

}
