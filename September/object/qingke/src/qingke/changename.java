package qingke;

public class changename {

	public static void main(String[] args) {
		String first="张三";
		String second="李四";
		System.out.println("转换前：first "+first+" second  "+second);
		String temp=first;
		first=second;
		second=temp;
		System.out.println("转换后：first "+first+" second  "+second);
	}

}
