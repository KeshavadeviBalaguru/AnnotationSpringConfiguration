package com.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
	ApplicationContext cxt=new AnnotationConfigApplicationContext(AppliConfig.class);
	Samsung sob=cxt.getBean(Samsung.class);
	sob.MobileConfi();

	}

}
