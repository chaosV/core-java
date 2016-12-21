package com.qk24;

import java.util.HashMap;

public class LearnhashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hashmap=new HashMap<Integer,String>();
		
		hashmap.put(0, "zero");
		hashmap.put(1, "one");
		hashmap.put(2, "two");
		hashmap.put(3, "three");
		hashmap.put(4, "four");
		hashmap.put(5, "five");
		  
		hashmap.get(1);
		System.out.println(hashmap.get(1));
		hashmap.put(1, "first");
		System.out.println(hashmap.get(1));
		
	

		
		
		
	}

}
