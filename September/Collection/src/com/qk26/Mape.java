package com.qk26;

import java.util.HashMap;

public class Mape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> map=new HashMap<String,String>();
		map.put("������", "1930 1950");
		map.put("�����", "1934 1938 1982 2006");
		map.put("�¹�", "1954 1974 1990");
		map.put("����", "1958 1962 1970 1994 2002");
		map.put("Ӣ����", "1966 ");
		map.put("����͢", "1978 1986  ");
		if(map.containsKey("�����")){
			System.out.println(map.get("����"));
			
		}else {
			System.out.println("δ������籭��");
		}
	}

}
