package com.Test24;

import java.util.HashMap;
import java.util.Scanner;

public class Mape9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hashMape=new HashMap<Integer,String>();
		hashMape.put(1930, "������");
		hashMape.put(1934, "�����");
		hashMape.put(1938, "�����");
		hashMape.put(1950, "������");
		hashMape.put(1954, "�¹�");
		hashMape.put(1958, "����");
		hashMape.put(1962, "����");
		hashMape.put(1966, "Ӣ����");
		hashMape.put(1970, "����");
		hashMape.put(1974, "�¹�");
		hashMape.put(1978, "����͢");
		hashMape.put(1982, "�����");
		hashMape.put(1986, "����͢");
		hashMape.put(1990, "�¹�");
		hashMape.put(1994, "����");
		hashMape.put(1998, "����");
		hashMape.put(2002, "����");
		hashMape.put(2006, "�����");
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ����ݣ�");
		int a=sc.nextInt();
		if(hashMape.containsKey(a)){
			System.out.println(hashMape.get(a));
		}else {
			System.out.println("����δ�ٰ����籭��");
			sc.close();
		}
	}  
	
}
