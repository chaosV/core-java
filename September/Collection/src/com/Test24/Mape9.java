package com.Test24;

import java.util.HashMap;
import java.util.Scanner;

public class Mape9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hashMape=new HashMap<Integer,String>();
		hashMape.put(1930, "乌拉圭");
		hashMape.put(1934, "意大利");
		hashMape.put(1938, "意大利");
		hashMape.put(1950, "乌拉圭");
		hashMape.put(1954, "德国");
		hashMape.put(1958, "巴西");
		hashMape.put(1962, "巴西");
		hashMape.put(1966, "英格兰");
		hashMape.put(1970, "巴西");
		hashMape.put(1974, "德国");
		hashMape.put(1978, "阿根廷");
		hashMape.put(1982, "意大利");
		hashMape.put(1986, "阿根廷");
		hashMape.put(1990, "德国");
		hashMape.put(1994, "巴西");
		hashMape.put(1998, "法国");
		hashMape.put(2002, "巴西");
		hashMape.put(2006, "意大利");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个年份：");
		int a=sc.nextInt();
		if(hashMape.containsKey(a)){
			System.out.println(hashMape.get(a));
		}else {
			System.out.println("该年未举办世界杯！");
			sc.close();
		}
	}  
	
}
