package qk8;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Qk04 {

	public static void main(String[] args) throws IOException {
		
		File file=new File("E:\\lx\\result.txt");
		if(!file.exists()){
			file.createNewFile();
		}
		BufferedWriter bw=new BufferedWriter(new FileWriter(file));
		Scanner sc = new Scanner(System.in);
		System.out.println("�������������������Զ��Ÿ�������");
		
		String a = sc.nextLine();
		bw.write("�������������������Զ��Ÿ�������"+a);
		bw.newLine();
		String[] b = a.split(",");

		int i = b.length;
		int[] c = new int[i];
		for (int j = 0; j < i; j++) {
			c[j] = Integer.parseInt(b[j]);

		}
		Arrays.sort(c);

		System.out.println("��ѡ�������ǽ���   1.����   2.����");
		int num = sc.nextInt();
		bw.write("��ѡ�������ǽ���   1.����   2.����"+num);
		bw.newLine();
		System.out.println("���������");
		bw.write("���������");
		bw.newLine();
		String result="";
		if (num==1) {
			for (int j = 0; j < i; j++) {

				result=result+c[j]+" ";
			}
		} else if (num==2) {
			for (int j = i - 1; j >= 0; j--) {

				result=result+c[j]+" ";
			}
			System.out.println(result);
			bw.write(result);
			bw.newLine();
		}
		System.out.println("�ɹ�д���ļ���");
		bw.write("�ɹ�д���ļ���");
		
		sc.close();
		bw.flush();
		bw.close();

		

	}





}
