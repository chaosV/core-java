package com.qk22;

import java.util.Random;

public abstract class Actor {
	public String name;
	public int dspeed;
	public int pspeed;
	public double dday;
	public double pday;
	
	
	public void go(City city){
		Random a=new Random();
		dspeed=a.nextInt(5)+3;
		System.out.println(city.citydis());
		dday=city.distance%dspeed;
		
	}

}
