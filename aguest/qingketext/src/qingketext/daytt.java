package qingketext;

import java.util.*;

public class daytt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int a = rand.nextInt(100);
		System.out.println(a);
		Scanner sc = new Scanner(System.in);
		System.out.println("���һ������");
		for (int i = 0; i < 100; i++) {
			int b = sc.nextInt();
			if (a < b) {
				System.out.println("����");
				System.out.println("���ٲ�һ������");
				continue;
			} else if (a > b) {
				System.out.println("С��");
				System.out.println("���ٲ�һ������");
				continue;
			}
			if (a == b) {
				System.out.println("����");
				break;
			}
		}
		sc.close();
		
		/*int num = sc.nextInt();
		while (num != a) {
			if (num < a) {
				System.out.println("С��");
				System.out.println("���ٲ�һ������");
			} else if (num > a) {
				System.out.println("����");
				System.out.println("���ٲ�һ������");
			}
			num = sc.nextInt();
		}
		System.out.println("���������" + num);
		sc.close();*/

	}

}
