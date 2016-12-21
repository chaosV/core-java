package qingke;

import java.util.Scanner;

public class THf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数： ");
		int i = sc.nextInt();
		{
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("三五");
			} else if (i % 5 == 0) {
				System.out.println("小五");
			} else if (i % 3 == 0) {
				System.out.println("小五");
			} else
				System.out.println("Null");
		}
		sc.close();
	}

}
