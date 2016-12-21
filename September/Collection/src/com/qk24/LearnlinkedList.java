package com.qk24;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LearnlinkedList {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arraylist=new ArrayList<Integer>();
		List<Integer> linkedlist=new LinkedList<Integer>();
		
		dotiming("ArrayList",arraylist);
		dotiming ("LinkedList",linkedlist);
	}
	private static void dotiming(String type,List<Integer> list){
		for (int i=0;i<1E5;i++){
			list.add(i);
		}
		long start =System.currentTimeMillis();
		long end=System.currentTimeMillis();
		System.out.println(end-start);
		
	}
}
