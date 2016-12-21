package qingke;
import java.util.Scanner;
public class LearnBrance {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("请输入一个数：");
//		int num=sc.nextInt();
//		if(num<=100){
//			System.out.println("不错!");
//		}else if(num>100){
//			System.out.println("一般!");
//		}
//		sc.close();
//		
		//printmonth(1);
		num();
		
	}
	public static void printmonth(int month){
		switch(month){
		case 1:System.out.println("一月");
		break;
		case 2:System.out.println("二月");
		break;
		case 3:System.out.println("三月");
		break;
		case 4:System.out.println("四月");
		break;
		case 5:System.out.println("五月");
		break;
		case 6:System.out.println("六月");
		break;
		default:System.out.println("输入错误");
		break;
		}
	}
	public static void num(){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个数：");
		int num=sc.nextInt();
		if(num<=100){
			System.out.println("不错!");
		}else if(num>100){
			System.out.println("一般!");
		}
		sc.close();
		
	}
}
