package com.Test24;

import java.util.ArrayList;
import java.util.List;

public class MyList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		System.out.println(list.isEmpty());
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		list.remove("a");
		System.out.println(list.contains("a"));
		System.out.println(list.size());

		for(String s:list){
			System.out.println(s);
		}
		  list.clear();
		  System.out.println(list);
	}

}
