package qk8;

import java.util.Scanner;

public class Qk02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("输入一个整数（少于5位）：");
		String a=sc.nextLine();
		sc.close();
		System.out.println("千位："+a.substring(0, 1));
		System.out.println("百位："+a.substring(1,2));
		System.out.println("十位："+a.substring(2,3));
		System.out.println("个位："+a.substring(3,4));
	}

}
