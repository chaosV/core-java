package qingke;
import java.util.Scanner;
public class LearnBrance {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("������һ������");
//		int num=sc.nextInt();
//		if(num<=100){
//			System.out.println("����!");
//		}else if(num>100){
//			System.out.println("һ��!");
//		}
//		sc.close();
//		
		//printmonth(1);
		num();
		
	}
	public static void printmonth(int month){
		switch(month){
		case 1:System.out.println("һ��");
		break;
		case 2:System.out.println("����");
		break;
		case 3:System.out.println("����");
		break;
		case 4:System.out.println("����");
		break;
		case 5:System.out.println("����");
		break;
		case 6:System.out.println("����");
		break;
		default:System.out.println("�������");
		break;
		}
	}
	public static void num(){
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ������");
		int num=sc.nextInt();
		if(num<=100){
			System.out.println("����!");
		}else if(num>100){
			System.out.println("һ��!");
		}
		sc.close();
		
	}
}
