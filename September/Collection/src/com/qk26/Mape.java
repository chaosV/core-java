package com.qk26;

import java.util.HashMap;

public class Mape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> map=new HashMap<String,String>();
		map.put("乌拉圭", "1930 1950");
		map.put("意大利", "1934 1938 1982 2006");
		map.put("德国", "1954 1974 1990");
		map.put("巴西", "1958 1962 1970 1994 2002");
		map.put("英格兰", "1966 ");
		map.put("阿根廷", "1978 1986  ");
		if(map.containsKey("意大利")){
			System.out.println(map.get("巴西"));
			
		}else {
			System.out.println("未获得世界杯！");
		}
	}

}
