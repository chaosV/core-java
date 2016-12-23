import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test1 {

	/**
	 * 1.对于String对象，可以使用“=”赋值，也可以使用new关键字赋值，两种方法有什么区别？
	 * =赋值是只有真正赋值时才在内存中开辟一个空间去储存数据，声明时不占用内存空间。
	 * new是在声明时就在内存中分配了一个空间，不管有没有占用都一直存在。 2.String类和StringBuffer类有什么区别?\
	 * String是字符串常量，使用String类等于每次都生成一个新的String类。 StringBuffer类是线程安全
	 * 。每次操作都是对本身进行操作。 3.for循环中的break语句和continue语句的使用。 break语句是跳出本循环，执行下一个语句。
	 * continue是继续执行本循环。 4.使用代码，创建一个长度为5的String型数组，并使用增强for循环迭代数组打印出数组中的元素。
	 * String[] a=new String[5]; a[0]="a"; a[1]="b"; a[2]="c"; a[3]="d";
	 * a[4]="e";
	 * 
	 * for(String b:a){ System.out.println(b); }
	 * 
	 * } 5.说明Arrays类的作用，并举例。 Arrays类是数组的工具类，包含大量静态方法 int[] a=new
	 * int[]{5,3,8,0,1,8,3,5,8}; Arrays.sort(a); for(int b:a){
	 * System.out.println(b); }
	 * 
	 * 6.overload和override的区别。overload的方法是否可以改变返回值的类型？
	 * overload：方法名相同，参数类型和参数个数可以不同。 override：方法名相同，参数类型和参数个数相同，方法可以不同。
	 * overload可以改变返回值类型。
	 * 
	 * 7. (1): class A:a=11 d=2.0 (2): class A:a=3.0f d=java program.
	 * 8.请说明什么是抽象类？抽象类有什么作用？ 抽象类是在类名前加上abstract关键字的类。 作用：一个类继承抽象类就必须实现抽象类中的方法。
	 * 9.final类和final方法有什么作用？ final类不能被继承 final方法不能被复写。
	 * 10.Object类中的equals方法和hashcode方法。 equals方法是比较两个对象是否相等。
	 * hashcode方法是返回对象的哈希码值。 11.throws关键字和throw关键字有什么区别和联系？ throws是 回避异常
	 * throw是主动抛出异常
	 * 
	 * 12.list和set集合有什么区别？ list：元素有序，可重复 set： 元素无序，不重复。
	 * 13.collection和collections有什么区别？ collection：是一个接口 collections：是一个类
	 * 14.java中的多态是什么？ 重载和重写
	 * 
	 * 15.请列举java语言中的八种基本数据类型，并说明每种数据类型的含义及长度。 byte 1字节 short 2 int 4 double 8
	 * long 8 char 2 float 4 boolean
	 * 
	 * 16.面向对象的特征有哪些方面？并解释特征。 继承 类与类之间可以使用继承类的属性和方法 封装 将一些数据封装起来只允许特定的对象对其操作 多态
	 * 重写和重载 17.作用域public，private，protected，及不写时的区别？ public：该类 包 子类 其它包
	 * protected： 该类 包 子类 private： 该类 不写; 该类 包
	 * 18.写一个程序，要求功能：求出用1,2,5这三个数不同个数组合的和为100的组合个数。 int d=0; for(int
	 * a=0;a<100;a++){ for(int b=0;b<=50;b++){ for(int c=0;c<=20;c++){
	 * if(a+b*2+c*5==100){ d++; } } } } System.out.println(d);
	 * 
	 * }
	 * 
	 * 19.说明try/catch/finally语句块的作用。 主动抛出该语句块所产生的异常。
	 * 
	 * 20.返回值是多少？“beijing”.equalsIgnoreCase(new String(“beijing”)) true
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		Information ift=new Information();
		File file = new File("E:\\lx\\info.txt");
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
			String line = br.readLine();
			while (line != null) {
				if (!line.startsWith("#")) {
				
					System.out.println(line);
					
				}
				line = br.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
