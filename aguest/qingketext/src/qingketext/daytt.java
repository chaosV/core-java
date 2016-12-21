package qingketext;

import java.util.*;

public class daytt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int a = rand.nextInt(100);
		System.out.println(a);
		Scanner sc = new Scanner(System.in);
		System.out.println("请猜一个数：");
		for (int i = 0; i < 100; i++) {
			int b = sc.nextInt();
			if (a < b) {
				System.out.println("大了");
				System.out.println("请再猜一个数：");
				continue;
			} else if (a > b) {
				System.out.println("小了");
				System.out.println("请再猜一个数：");
				continue;
			}
			if (a == b) {
				System.out.println("对了");
				break;
			}
		}
		sc.close();
		
		/*int num = sc.nextInt();
		while (num != a) {
			if (num < a) {
				System.out.println("小了");
				System.out.println("请再猜一个数：");
			} else if (num > a) {
				System.out.println("大了");
				System.out.println("请再猜一个数：");
			}
			num = sc.nextInt();
		}
		System.out.println("随机数等于" + num);
		sc.close();*/

	}

}
