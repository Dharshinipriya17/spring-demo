package com.example.springeg;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:OfficeAddress.properties")

public class OfficeAddress implements Address{
	@Value("${city}")
	private String city;

	public String getMyAddress() {
		return "city";
	}
}
