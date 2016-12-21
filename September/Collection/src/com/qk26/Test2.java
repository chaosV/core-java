package com.qk26;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一整数n，表示字符串长度为(1<=n<=30): ");
		int n = sc.nextInt();
		// if (n > 30) {
		// System.out.println("超出输入范围！");
		// }
		if (n == 1) {
			a = 3;
			System.out.println(a);
		} else if (n == 2) {
			a = 9;
			System.out.println(a);
		} else {
			long S = 3, D = 6, s, d;
			for (int k = 3; k <= n; k++) {
				s = S;
				d = D;
				S = s + d;
				D = 2 * s + d;
			}
			a = S + D;
			System.out.println(a);
		}

	}

}
