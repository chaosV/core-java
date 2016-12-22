package qk8;

import java.util.Random;

public class Qk03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[10][5];
		double[] b = new double[10];
		double[] c = new double[10];
		Random r = new Random();

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 5; j++) {
				a[i][j] = r.nextInt(100);
			}

		}

		System.out.println("java C++  Ruby  OC  C#");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(a[i][j] + " | ");
				b[i] = b[i] + a[i][j];
			}
			System.out.println("\n");
		}

		System.out.println("总分：");
		for (int i = 0; i < 10; i++) {
			System.out.print(b[i] + " ");
		}

		System.out.println("\n"+"平均分：");
		for (int i = 0; i < 10; i++) {
			c[i] = b[i] / 10;
			System.out.print(c[i] + " ");
		}
	}

}
