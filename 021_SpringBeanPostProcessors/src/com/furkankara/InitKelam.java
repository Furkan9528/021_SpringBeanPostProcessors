package com.furkankara;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitKelam implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanAdi) throws BeansException {
		System.out.println("Kelam Baslatmadan sonrasi :"+beanAdi);
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanAdi) throws BeansException {
		System.out.println("Kelam Baslatmadan oncesi :" + beanAdi);
		return bean;
				
	}

	
	
}
