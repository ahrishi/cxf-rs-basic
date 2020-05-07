package com.example.spring5di;

import com.example.spring5di.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring5DiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Spring5DiApplication.class, args);

		I18nController i18nController = (I18nController)ctx.getBean("i18nController");
		System.out.println("i18nController "+i18nController.getQuote());

		MyController myController = (MyController)ctx.getBean("myController");
		System.out.println("myController "+myController.getQuote());

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController)ctx.getBean("propertyInjectedController");
		System.out.println("propertyInjectedController " +propertyInjectedController.getQuote());

		SetterInjectedController setterInjectedController = (SetterInjectedController)ctx.getBean("setterInjectedController");
		System.out.println("setterInjectedController " +setterInjectedController.getQuote());

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController)ctx.getBean("constructorInjectedController");
		System.out.println("constructorInjectedController " +constructorInjectedController.getQuote());


	}

}
