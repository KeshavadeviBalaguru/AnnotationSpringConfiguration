package com.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppliConfig {
	
	@Bean
	public Samsung getsamsung()
	{
		return new Samsung();
		
	}
	@Bean
	public MobileProcessor getmobileprocessor()
	{
		return new SnapDragon();
	}

}
