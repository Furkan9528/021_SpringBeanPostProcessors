package com.furkankara;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SelamApp {

	public static void main(String[] args) {
			
		ApplicationContext context= new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		
		Selam selamNesnesi = context.getBean("selam",Selam.class);
		selamNesnesi.goster();
	
			
		
		((AbstractApplicationContext) context).registerShutdownHook();
		
		
		
	}

}
