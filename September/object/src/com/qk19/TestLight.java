package com.qk19;

public class TestLight {
	public void Light(TrafficLight traffic){
		System.out.println(traffic);
		
		if(traffic==TrafficLight.green){
			System.out.println("ÂÌµÆÐÐ£¡");
		}else if(traffic==TrafficLight.red){
			System.out.println("ºìµÆÍ££¡");
		}else if(traffic==TrafficLight.yellow){
			System.out.println("»ÆµÆµÈÒ»µÈ£¡");
		}
	}
	public static void main(String[] args) {
		TestLight tl=new TestLight();
		tl.Light(TrafficLight.green);
		tl.Light(TrafficLight.red);
		tl.Light(TrafficLight.yellow);
	}

}
