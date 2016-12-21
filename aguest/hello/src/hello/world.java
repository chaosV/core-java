package hello;
import java.util.Scanner;  //java工具类
public class world {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("这是我的第一个java程序，你叫什么名字？");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		System.out.println("你好，" + name);
		sc.close();
	}

}
