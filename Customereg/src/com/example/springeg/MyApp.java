package com.example.springeg;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyApp {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Customer cust=context.getBean("customer",Customer.class);
		System.out.println(cust.getHuman());
		context.close();

}
}
