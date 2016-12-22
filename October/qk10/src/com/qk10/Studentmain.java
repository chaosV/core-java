package com.qk10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Studentmain {

	public static void main(String[] args) {
		
		try {
			Student stu=new Student();
			stu.setAge(11);
			stu.setName("zc");
			stu.setId(111);
			
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("Student.output"));
			oos.writeObject(stu);
			oos.close();
			
			ObjectInputStream ooi=new ObjectInputStream(new FileInputStream("Student.output"));
			try {
				Student newStu=(Student)ooi.readObject();
				System.out.println(newStu);
				System.out.println(stu);
				System.out.println(newStu==stu);
				ooi.close();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
