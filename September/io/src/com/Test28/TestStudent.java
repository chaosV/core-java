package com.Test28;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TestStudent {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println("������ѧ��������math�ɼ���English�ɼ���chinese�ɼ�����,����");
			Scanner sc = new Scanner(System.in);
			String s = sc.nextLine();
			String[] ts = s.split(",");

			Student student = new Student(ts[0], Integer.parseInt(ts[1]), Integer.parseInt(ts[2]),
					Integer.parseInt(ts[3]),
					(Integer.parseInt(ts[1]) + Integer.parseInt(ts[2]) + Integer.parseInt(ts[3])));
			Set<Student> st = new TreeSet<>();
			st.add(student);
			
			
			

		}
		
	}
}
