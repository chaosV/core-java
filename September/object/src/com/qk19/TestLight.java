package com.qk19;

public class TestLight {
	public void Light(TrafficLight traffic){
		System.out.println(traffic);
		
		if(traffic==TrafficLight.green){
			System.out.println("�̵��У�");
		}else if(traffic==TrafficLight.red){
			System.out.println("���ͣ��");
		}else if(traffic==TrafficLight.yellow){
			System.out.println("�ƵƵ�һ�ȣ�");
		}
	}
	public static void main(String[] args) {
		TestLight tl=new TestLight();
		tl.Light(TrafficLight.green);
		tl.Light(TrafficLight.red);
		tl.Light(TrafficLight.yellow);
	}

}
