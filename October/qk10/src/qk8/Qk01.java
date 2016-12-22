package qk8;

import java.util.Arrays;
import java.util.Random;

public class Qk01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[10];
		Random r=new Random();
		a[0]=r.nextInt(100);
		a[1]=r.nextInt(100);
		a[2]=r.nextInt(100);
		a[3]=r.nextInt(100);
		a[4]=r.nextInt(100);
		a[5]=r.nextInt(100);
		a[6]=r.nextInt(100);
		a[7]=r.nextInt(100);
		a[8]=r.nextInt(100);
		a[9]=r.nextInt(100);
		Arrays.sort(a);
		
		double sum=0;
		for(int i=0;i<10;i++){
			sum=sum+a[i];
		}
		double temp=sum/10;
		System.out.println("最大值："+a[9]);
		System.out.println("平均值："+temp);
		System.out.println("和值："+sum);
		
	}

}
