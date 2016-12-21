package com.qk26;

public class Test1 {

	public static void main(String[] args) {
		int a=1209,b=123001;
		int a1,b1,num1=0,num2=0,sum;
		a1=String.valueOf(a).length();
		b1=String.valueOf(b).length();
		
		for(int i=0;i<a1;i++){
			num1=num1*10+a%10;
			a=a/10;
			System.out.println(num1);
		}
		
		for(int i=0;i<b1;i++){
			num2=num2*10+b%10;
			b=b/10;
			System.out.println(num2);
		}
		sum=num1+num2;
		System.out.println(sum);
	}

}
