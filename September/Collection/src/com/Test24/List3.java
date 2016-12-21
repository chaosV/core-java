package com.Test24;

import java.util.LinkedList;
import java.util.List;

public class List3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=new LinkedList<Integer>();
		for(int i=0;i<list.size()-1;i++){
			for(int j=i;j<list.size()-i-1;j++){
				if(list.get(i).equals(list.get(j))){
					list.remove(j);
				}
			}
		}System.out.println(list.iterator());
	}

}
