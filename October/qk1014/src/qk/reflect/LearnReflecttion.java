package qk.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;



public class LearnReflecttion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d =new Dog();
//		getClassFullName(d);
//		getClassInstance();
		
		//getClassInfo();
		
		//getObjectInstance();
		
		changeVariables();
		
		//invokeMethod();
	}
	public static void getClassFullName(Dog d){
		System.out.println("1.获得包名和类名=======");
		Class c=d.getClass();
		System.out.println("类名："+c.getName());
		System.out.println("包名："+c.getPackage().getName());
	}
	
	public static void getClassInstance(){
		System.out.println("2.获得类实例的3种方法=====");
		String className="qk.reflect.Dog";
		try {
			Class c=Class.forName(className);
			System.out.println("mathod 2:"+c.getName());
			
			Class d=Dog.class;
			System.out.println("mathod 3:"+c.getName());
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void getClassInfo(){
		System.out.println("3.获得类的各种信息：方法，变量，构造函数，父类，接口等=====");
		Class<Dog> dc=Dog.class;
		
		//打印所有公共方法
		Method[] methods=dc.getMethods();
		System.out.println("getMethods方法如下：");
		for (Method m : methods) {
			System.out.println(m.getName());
		}
		//打印类定义的方法
		Method[] methods2=dc.getDeclaredMethods();
		System.out.println("getDeclaredMethods方法如下：");
		for (Method m : methods2) {
			System.out.println(m.getName());
		}
		
		
	}
	
	public static void getObjectInstance(){
		System.out.println("4.创建对象实例=====");
		Class<Dog> dc=Dog.class;
		try {
			Object o=dc.newInstance();   //调用Dog的空构造函数
			System.out.println("创建的对象是："+o);
			
			//方法2
			//Constructor接受一个数组，数组里的参数      
			Constructor c=dc.getConstructor(new Class[]{String.class,int.class});
			Dog o2=(Dog)c.newInstance(new Object[]{"旺财",2});
			System.out.println("创建的对象是："+o2.name);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void changeVariables(){
		System.out.println("5.操作成员变量=======");
		Class<Dog> dc=Dog.class;
		try {
			Object o=dc.newInstance();
			System.out.println("创建的对象是："+o);
			
			Field[] fields=dc.getFields();  
			for(Field f:fields){
				System.out.println(f.getName());
			}
			Field f=dc.getField("name");
			f.set(o,"哮天");
			f.get(o);
			
			
			Field f2=dc.getDeclaredField("owner");
			f2.setAccessible(true);
			f2.set(o, "zc");
			f2.get(o);
			
			System.out.println("Dog:"+f.get(o));
			System.out.println("owner:"+f2.get(o));
			
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void invokeMethod(){
		System.out.println("6.调用成员方法：========");
		Class<Dog> dc=Dog.class;
		try {
			Object o=dc.newInstance();
			System.out.println("创建的对象是："+o);
			Method m=dc.getMethod("bark", new Class[]{});
			m.invoke(o, new Object[]{});
			
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
