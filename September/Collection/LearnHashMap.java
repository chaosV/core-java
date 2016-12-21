package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class LearnHashMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>(); 
		
		//增加一个Map元素
		hashMap.put(1, "one");
		hashMap.put(4, "four");
		hashMap.put(2, "two");
		hashMap.put(5, "five");
		hashMap.put(3, "three");
		
		hashMap.put(3, "THREE");//后面的value回覆盖前面的value
		
		//根据key获取value
		String s = hashMap.get(3);
		System.out.println(s);
		
		//遍历Map
		System.out.println("===========for-each遍历==============");
		/*
		 * 注：
		 * Map.Entry<Integer, String>的意思是一个泛型，
		 * 表示Entry里装了一个Integer类型的整数和一个String类型的字符串，
		 * 分别是hashMap的key和value
		 */
		for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + ":" + value);
		}
		
		System.out.println("===========迭代器遍历==============");
		Iterator it = hashMap.entrySet().iterator();
		while (it.hasNext()) {
//			@SuppressWarnings("unchecked")
			Map.Entry<Integer, String> entry = (Entry<Integer, String>) it.next();
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + ":" + value);
		}
	}

}
