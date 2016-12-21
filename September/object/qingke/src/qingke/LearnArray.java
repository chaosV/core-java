package qingke;
import java.util.Scanner;
public class LearnArray {

	public static void main(String[] args) {

		// scores(); //排序
		// Fanz(); //反转
		// Sum(); //最大值最小值
		ZiF(); // 字符串
	}

	public static void scores() {
		int[] scores = { 12, 32, 11, 55, 98, 71, 62 };
		for (int a = 0; a < scores.length; a++) {
			for (int b = a + 1; b < scores.length; b++) {
				if (scores[a] > scores[b]) {
					int temp = scores[a];
					scores[a] = scores[b];
					scores[b] = temp;
				}
			}
			System.out.println(scores[a]);
		}
	}

	public static void Fanz() {
		int[] Fanz = { 1, 2, 3 };
		for (int a = Fanz.length - 1; a >= 0; a--) {
			System.out.println(Fanz[a]);
		}

	}

	public static void Sum() {
		int[] scores = { 12, 32, 11, 55, 98, 71, 62 };
		int max = scores[0], min = scores[0], z;
		for (int a = 0; a < scores.length; a++) {
			if (scores[a] > max) {
				z = a;
				max = scores[a];
			}
		}
		for (int x = 0; x < scores.length; x++) {
			if (scores[x] < min) {
				z = x;
				min = scores[x];

			}

		}
		System.out.println(max);
		System.out.println(min);
	}

	public static void ZiF() {

		String[] c = { "hello", "world", "bye" };
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
//		for(String s:c){
//			System.out.println(s);
//		}
	}
	
}