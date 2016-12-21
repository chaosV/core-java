package com.qk21;

public class TestSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton s=Singleton.getInstance();
		s.daka();
		s.daka();
		Singleton s2=Singleton.getInstance();
		s2.daka();
	}

}
