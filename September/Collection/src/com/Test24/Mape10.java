package com.Test24;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Mape10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> hashmap = new HashMap<String, String>();
		hashmap.put("Tom", "CoreJava");
		hashmap.put("John", "Oracle");
		hashmap.put("Susan", "Oricle");
		hashmap.put("Jerry", "JDBC");
		hashmap.put("Jim", "Unix");
		hashmap.put("Kevin", "JSP");
		hashmap.put("Lucy", "JSP");
//		System.out.println(hashmap.get("Tom"));
//		hashmap.put("ALLen", "JDBC");
//		System.out.println(hashmap);
//		hashmap.put("Lucy", "CoreJava");
//		System.out.println(hashmap);

		
		//遍历
		Iterator it = hashmap.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, String> entry = (Entry<String, String>) it.next();
			String key = entry.getKey();
			String value = entry.getValue();
//			System.out.println(key + ":" + value);
//			System.out.println("-----------");

		}
		// 输出有相同value的值的hashmap

		Set<String> set = hashmap.keySet();
		for (Object obj : set) {
			System.out.println(hashmap.get((String) obj));

		}
		for (String str : set) {
			if (hashmap.get(str).equals("JSP")) {
				System.out.println("教JSP的老师有：" + str);

			}

		}
	}

}
