package xuepa;

import java.io.InputStream;
import java.util.Scanner;

public class PaConsole {
	private static Scanner scanner;
	
	static {
		scanner=new Scanner(System.in);
	}
	
	private PaConsole(InputStream is){
		scanner=new Scanner(is);
	}
	
	public static String new_line="\n";
	
	public static void print(String line){
		System.out.println(line);
	}
	
	public static void println(Object object){
		System.out.println(object);
	}
	
	public static void println(String line){
		System.out.println(line);
	}
	
	public static String askUserInput(String promt) {
		while(true){
			System.out.println(promt);
			String input=scanner.nextLine().trim();
			
			if(!"".equals(input)){
				return input;
			}
			System.out.println("Invalid input.Empty value is not allowed!");
		}
	}
}
