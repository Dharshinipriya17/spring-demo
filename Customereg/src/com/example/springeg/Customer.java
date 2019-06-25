package com.example.springeg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:Customer.properties")

public class Customer implements Human{
	@Value("${custid}")
	private String custid;
	@Value("${custname}")
	private String custname;


	private Address custaddress;
	public Customer() {
		super();
	}
	@Autowired
	public Customer(@Qualifier("officeAddress") Address custaddress) {
		super();
		this.custaddress=custaddress;
	}
@Override
	public String getHuman() {

	return custid+" "+custname+" "+custaddress.getMyAddress();
	}
	
	
}