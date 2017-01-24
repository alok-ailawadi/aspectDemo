package com.alok;

import com.alok.aspect.EncryptionAspect;
import com.alok.rest.BankAccoutnFlow;
import org.aspectj.lang.Aspects;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.alok")
public class AspectDemoApplication {

	/*
	http://stackoverflow.com/questions/37613133/spring-boot-aspect-autowiring
	 */
	@Bean
	EncryptionAspect encryptionAspect()
	{
		final EncryptionAspect aspect = Aspects.aspectOf(EncryptionAspect.class);
		return aspect;
	}
	public static void main(String[] args) {
		SpringApplication.run(AspectDemoApplication.class, args);
	}
}
