package com.example.myapp.di;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@Configurable
@ComponentScan(basePackages= {"com.example.myapp.di"})
public class AppConfig {
	@Bean
	IHelloService helloService() {
		return new HelloService();
	}
}
