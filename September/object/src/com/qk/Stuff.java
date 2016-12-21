package com.qk;

public class Stuff extends Person {
	public String school;
	double pay;
	
	public Stuff(String name,String address,String school,double pay){
		this.name=name;
		this.address=address;
		this.school=school;
		this.pay=pay;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}
	
	
	public String toString(){
		return ("Person[name=" + name + " ,address=" + address + " ]"+" ,school="+school+" ,pay="+pay);
	}
}
