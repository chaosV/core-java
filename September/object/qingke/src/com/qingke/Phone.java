package com.qingke;

public class Phone {
	public String model;
	public String brand;
	int price;
	String owner;

//	public Phone(String string, String string2) {
//		// TODO Auto-generated constructor stub
//	}

	public Boolean call(String phoneNo) {
		System.out.println("正在给" + phoneNo + "打电话");
		if (phoneNo.length() == 0) {
			System.out.println("打电话ok");
			return true;
		} else {
			System.out.println("打电话wrong");
			return false;
		}
	}

	public void text(String phoneNo, String msg) {
		System.out.println(msg + phoneNo);
	}

//	public static void main(String[] args) {
//		Phone z = new Phone(brand, brand);
//		z.text("22222", "zc");
//		z.call("1z1");
//		z.brand = ("aa");
//		System.out.println(z.brand);
//	}
	
	public Phone(String brand, String model ){
		this.brand=brand;
		this.model=model;
	}
	
	
}
