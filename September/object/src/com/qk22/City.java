package com.qk22;

public enum City {
	Busan(999), Seoul(888),Inchon(777);
	
	public int distance;
	private City(int distance){
		this.distance=distance;
	}
	
	public String citydis(){
		return (this.name()+distance);
	}
}
