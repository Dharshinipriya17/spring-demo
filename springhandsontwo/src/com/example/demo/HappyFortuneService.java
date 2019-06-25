package com.example.demo;

import java.io.BufferedReader;
import java.io.FileReader;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements Fortune {
	String[] AllFortune;
	
	@PostConstruct
	public void setAllFortune() {
		String strcurrLine;
		int index=0;
		AllFortune=new String[4];
		try {
			BufferedReader obj=new BufferedReader(new FileReader("serviceeg"));
			while((strcurrLine=obj.readLine()) != null) {
				AllFortune[index++]=strcurrLine;
			}
			obj.close();
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
	}
	@Override
public String getDailyFortune() {
		String ret=AllFortune[(int) (Math.random()*AllFortune.length)];
	return ret;
}



}
