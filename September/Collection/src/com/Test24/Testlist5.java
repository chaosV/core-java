package com.Test24;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Testlist5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Worker> list = new LinkedList<Worker>();
		Worker w = new Worker("张三  ", 18 , 3000);
		Worker w1 = new Worker("李四  ", 25 , 3500);
		Worker w2 = new Worker("王五  ", 22 , 3200);
		Worker w3 = new Worker("赵六  ", 24 , 3300);
		list.add(w);
		list.add(w1);
		list.add(w2);
		System.out.println(list);
		list.add(1,w3);
		System.out.println(list);
		list.remove(3);
		System.out.println(list);
		
		for(Worker s:list){
			System.out.println(s);
		}
		Iterator<Worker> it=list.iterator();
		while(it.hasNext()){
			Worker s=it.next();
			s.work();
		}
		
	}

}
