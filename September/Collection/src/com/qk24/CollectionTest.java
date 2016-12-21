package com.qk24;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> box;
		box =new ArrayList<String>();
		box.add("a");
		box.add("b");
		box.add("c");
		System.out.println(box);
		System.out.println(box.size());
		System.out.println(box.contains("d"));
		box.remove("c");
		System.out.println(box.size());


		for(String s:box){
			System.out.println(s);
		}
		
		
		Iterator<String> it=box.iterator();
		while(it.hasNext()){
			String s=it.next();
			System.out.println(s);
		}
	}

}


