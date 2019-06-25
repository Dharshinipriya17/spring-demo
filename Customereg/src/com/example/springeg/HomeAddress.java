package com.example.springeg;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:HomeAdress.properties")
public class HomeAddress implements Address {
@Value("${streetname}")
private String streetname;
@Value("${apartment}")
private String apartment;
@Override
public String getMyAddress() {
	return streetname+""+apartment;
}


	
	
	
	
}




