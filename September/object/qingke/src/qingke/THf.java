package qingke;

import java.util.Scanner;

public class THf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������ ");
		int i = sc.nextInt();
		{
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("����");
			} else if (i % 5 == 0) {
				System.out.println("С��");
			} else if (i % 3 == 0) {
				System.out.println("С��");
			} else
				System.out.println("Null");
		}
		sc.close();
	}

}
