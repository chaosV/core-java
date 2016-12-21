package com.qk;

import java.util.*;

import com.qk19.Dog;

public class Account {
	String id;
	String name;
	int balance=0;
	public Account(String id,String name){
		this.id=id;
		this.name=name;
	}
	
	public Account(String id,String name,int balance){
		this.id=id;
		this.name=name;
		this.balance=balance;
	}
	
	public String getId() {
		return id;
	}
	
	public String getName() {
		return id;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public int credit(int amount){
		return balance=balance+amount;
	}
	
	public int debit(int amount){
		if(amount<=balance){
			return balance-amount;
		} else {
			System.out.print("Amount exceeded balance");
		}return balance;
	}
	
	public int transferTo(int Account,int amount,int balance){
		if(amount<=balance){
			Account=Account+amount;
		}else {
			System.out.print("Amount exceeded balance");
		}return balance;
	}
	
	public String toString(){
		return "Account[id="+id+",name="+name+"balance="+balance+"]";
	}
	
	public int hashCode(){
		String aa=name+id;
		return aa.hashCode();
	}
	
	public boolean equals(Object o) {
		if (o instanceof Account) {
			Account d = (Account) o;
			if (d.name == this.name && d.id == this.id) {
				return true;
			} else
				return false;
		} else {

			return false;
		}
	}
	
	public static void main(String[] args){
		Account a1=new Account("zzz","ccc");
		Account a2=new Account("zzz","ccc");
		System.out.println(a1.equals(a2));
		
		Set set=new HashSet();
		set.add(a1);
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		

	}
}
