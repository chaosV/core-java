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
		System.out.println("请输入任意多个整数（以逗号隔开）：");
		
		String a = sc.nextLine();
		bw.write("请输入任意多个整数（以逗号隔开）："+a);
		bw.newLine();
		String[] b = a.split(",");

		int i = b.length;
		int[] c = new int[i];
		for (int j = 0; j < i; j++) {
			c[j] = Integer.parseInt(b[j]);

		}
		Arrays.sort(c);

		System.out.println("请选择升序还是降序   1.升序   2.降序：");
		int num = sc.nextInt();
		bw.write("请选择升序还是降序   1.升序   2.降序："+num);
		bw.newLine();
		System.out.println("操作结果：");
		bw.write("操作结果：");
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
		System.out.println("成功写入文件！");
		bw.write("成功写入文件！");
		
		sc.close();
		bw.flush();
		bw.close();

		

	}





}
