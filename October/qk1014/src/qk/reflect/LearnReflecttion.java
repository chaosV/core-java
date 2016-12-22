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
		System.out.println("1.��ð���������=======");
		Class c=d.getClass();
		System.out.println("������"+c.getName());
		System.out.println("������"+c.getPackage().getName());
	}
	
	public static void getClassInstance(){
		System.out.println("2.�����ʵ����3�ַ���=====");
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
		System.out.println("3.�����ĸ�����Ϣ�����������������캯�������࣬�ӿڵ�=====");
		Class<Dog> dc=Dog.class;
		
		//��ӡ���й�������
		Method[] methods=dc.getMethods();
		System.out.println("getMethods�������£�");
		for (Method m : methods) {
			System.out.println(m.getName());
		}
		//��ӡ�ඨ��ķ���
		Method[] methods2=dc.getDeclaredMethods();
		System.out.println("getDeclaredMethods�������£�");
		for (Method m : methods2) {
			System.out.println(m.getName());
		}
		
		
	}
	
	public static void getObjectInstance(){
		System.out.println("4.��������ʵ��=====");
		Class<Dog> dc=Dog.class;
		try {
			Object o=dc.newInstance();   //����Dog�Ŀչ��캯��
			System.out.println("�����Ķ����ǣ�"+o);
			
			//����2
			//Constructor����һ�����飬������Ĳ���      
			Constructor c=dc.getConstructor(new Class[]{String.class,int.class});
			Dog o2=(Dog)c.newInstance(new Object[]{"����",2});
			System.out.println("�����Ķ����ǣ�"+o2.name);
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
		System.out.println("5.������Ա����=======");
		Class<Dog> dc=Dog.class;
		try {
			Object o=dc.newInstance();
			System.out.println("�����Ķ����ǣ�"+o);
			
			Field[] fields=dc.getFields();  
			for(Field f:fields){
				System.out.println(f.getName());
			}
			Field f=dc.getField("name");
			f.set(o,"����");
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
		System.out.println("6.���ó�Ա������========");
		Class<Dog> dc=Dog.class;
		try {
			Object o=dc.newInstance();
			System.out.println("�����Ķ����ǣ�"+o);
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
