package zc;

import java.util.Arrays;

public class Aa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StringBuilder a=new StringBuilder("abcd");
//		StringBuffer b=new StringBuffer("qwer");
//		System.out.println(a.reverse());
//		System.out.println(b.reverse());
//		String c="qqq";
//		String d="www";
//		a.append(c);
//		System.out.println(a);
//		b.insert(0, c);
//		System.out.println(b);
		
		int[] a={4,3,2,1,0};
		int[] b=new int[5];
		b[0]=0;
		b[1]=1;
		b[2]=2;
		b[3]=3;
		b[4]=4;
		System.out.println(Arrays.equals(a,b));
		Arrays.sort(a);
		System.out.print(a[0]);
		System.out.print(a[1]);
		System.out.print(a[2]);
		System.out.print(a[3]);
		System.out.print(a[4]);
		
	}

}
