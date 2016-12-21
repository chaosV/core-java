package com.qk25;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

class Container<K,V>{
	private K key;
	private V value;
	
	public Container(K k,V v){ 
		this.key=k;
		this.value=v;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}
	
	
}
//泛型接口
interface Generator<T>{
	public T next();
}

class AnimalGenerator implements Generator<String>{
	private String[] animals=new String[]{"dog","cat","fish"};
	
	public String next(){
		Random rand=new Random();
		return animals[rand.nextInt(3)];
	}
}



public class GenericTest {
	
	public static <T> void  out(T t){                 //泛型方法
		System.out.println(t);
	}
	public static <T> void out1(T...args){
		for(T t:args){
			System.out.println(t);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list =new ArrayList();      //泛型
		list.add("dog");
		list.add("cat");
		list.add("pig");
		list.add("fish");
		
		String animal=(String)list.get(0);  //强制转换
		//System.out.println(animal);
		
		ArrayList<String> string=new ArrayList<String>();
		string.add("dog");
		string.add("cat");
		string.add("pig");
		
		
		String animal2=(String)list.get(0);
		//System.out.println(animal2);
		
		HashMap<String,String> map=new HashMap<String,String>();
		ArrayList<String> arraylist=new ArrayList<>();     //类型转换
		ArrayList<List<String>> list2=new ArrayList<>();
		
		Container c1=new Container("aa","bb");
		Container c2=new Container("aa",123);
		Container c3=new Container("aa",new Date());
//		
//		System.out.println(c1.getKey()+"="+c1.getValue());
//		System.out.println(c2.getKey()+"="+c2.getValue());
//		System.out.println(c3.getKey()+"="+c3.getValue());
		
		AnimalGenerator animals=new AnimalGenerator();  //泛型接口
		System.out.println(animals.next());
		System.out.println(animals.next());
		System.out.println(animals.next());
		
		
		//泛型方法
		out("aaa");
		out(111);
		out(1.21);
		out(new Date());
		
		
		out1("bbb",1,1.21,new Date());
		
		
		
		
	}

}
