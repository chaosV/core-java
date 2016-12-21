package com.qk24;

import java.util.ArrayList;
import java.util.List;

public class LearnArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");

		System.out.println(list);
		for(String s:list){
			System.out.println(s);
		}
	}

}
