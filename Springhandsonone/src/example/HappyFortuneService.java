package example;

import java.util.Random;

public class HappyFortuneService implements FortuneService{
	public String getFortune() {
	String arr[]= {"Golf object is defined","service objects"};
   // String ret=arr[(int) (Math.random()*arr.length)];
    Random rn=new Random();
    int r=rn.nextInt(arr.length);
    return arr[r];

}
	}