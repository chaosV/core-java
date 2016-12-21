package com.qk22;

import java.util.Random;

public abstract class AbstractVehicle implements Vehicle {

	
 
	public static String getValue(){
		int a=0;
		Random r=new Random();
		a=r.nextInt(10)+1;
		if(a==9||a==10){
			return plane;
		}else if(a>=5&&a<8){
			return train;
		}else {
			return toula
		}
	}
	
}
