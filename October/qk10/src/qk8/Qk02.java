package qk8;

import java.util.Scanner;

public class Qk02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("����һ������������5λ����");
		String a=sc.nextLine();
		sc.close();
		System.out.println("ǧλ��"+a.substring(0, 1));
		System.out.println("��λ��"+a.substring(1,2));
		System.out.println("ʮλ��"+a.substring(2,3));
		System.out.println("��λ��"+a.substring(3,4));
	}

}
