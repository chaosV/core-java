package beSuperDao;

import java.io.InputStream;
import java.util.Scanner;

public class BeSuperConsole{
	
	private BeSuperConsole(){
		
	}
	
	public static String NEW_LINE="\n";
	
	private static Scanner sc;
	
	static{
		sc=new Scanner(System.in);
	}
	
	private BeSuperConsole(InputStream is){
		sc=new Scanner(is);
	}
	
	public static void println(String str){
		System.out.println(str);
	}
	
	public static void println(Object obj){
		System.out.println(obj);
	}
	
	public static String askUserInput(String prompt){
		
		String input=null;
		
		while(true){
			System.out.print(prompt+">");
			input=sc.nextLine();
			if(!input.trim().equals("")){
				break;
			}
			println("请输入一个非空命令！");
		}
		
		return input;
		
	}
	
	public static int askUserInputInt(String prompt){
		int result= -1;
		while(true){
			String out=askUserInput(prompt);
			
			try{
				result=Integer.parseInt(out);
			}catch(Exception e){
				println("请输入合法的命令！");
			}
			if(result != -1){
				break;
			}
		}
		return result;
	}
}