package qk8;

import java.util.Random;
import java.util.Scanner;

public class Qk05 {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int a=sc.nextInt();
		Random r=new Random();
		int[] b = new int[a];
		int[] c = new int[a];
		int[] d = new int[a];
		for(int i=0;i<a;i++){
			b[i]=r.nextInt(100);
			int k=(int)Math.sqrt(b[i])+1;
			for(int j=2;j<=k;j++){
				if(b[i]%j==0){
					System.out.println("非素数"+b[i]);
				}else{
					System.out.println("素数"+b[i]);
				}
			}
		}
		
		
	}


}
