package com.Test24;

import java.util.ArrayList;
import java.util.List;


public class List2 {


	public static void main(String[] args){
		List<Integer> list=new ArrayList<Integer>();
		for(int i=1;i<=10;i++){
			list.add(i);
		}
		int n=4;
		System.out.println(list);
	    list.remove(n-1);
	    System.out.println(list);
	 
	}

}
