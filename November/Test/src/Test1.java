import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test1 {

	/**
	 * 1.����String���󣬿���ʹ�á�=����ֵ��Ҳ����ʹ��new�ؼ��ָ�ֵ�����ַ�����ʲô����
	 * =��ֵ��ֻ��������ֵʱ�����ڴ��п���һ���ռ�ȥ�������ݣ�����ʱ��ռ���ڴ�ռ䡣
	 * new��������ʱ�����ڴ��з�����һ���ռ䣬������û��ռ�ö�һֱ���ڡ� 2.String���StringBuffer����ʲô����?\
	 * String���ַ���������ʹ��String�����ÿ�ζ�����һ���µ�String�ࡣ StringBuffer�����̰߳�ȫ
	 * ��ÿ�β������ǶԱ�����в����� 3.forѭ���е�break����continue����ʹ�á� break�����������ѭ����ִ����һ����䡣
	 * continue�Ǽ���ִ�б�ѭ���� 4.ʹ�ô��룬����һ������Ϊ5��String�����飬��ʹ����ǿforѭ�����������ӡ�������е�Ԫ�ء�
	 * String[] a=new String[5]; a[0]="a"; a[1]="b"; a[2]="c"; a[3]="d";
	 * a[4]="e";
	 * 
	 * for(String b:a){ System.out.println(b); }
	 * 
	 * } 5.˵��Arrays������ã��������� Arrays��������Ĺ����࣬����������̬���� int[] a=new
	 * int[]{5,3,8,0,1,8,3,5,8}; Arrays.sort(a); for(int b:a){
	 * System.out.println(b); }
	 * 
	 * 6.overload��override������overload�ķ����Ƿ���Ըı䷵��ֵ�����ͣ�
	 * overload����������ͬ���������ͺͲ����������Բ�ͬ�� override����������ͬ���������ͺͲ���������ͬ���������Բ�ͬ��
	 * overload���Ըı䷵��ֵ���͡�
	 * 
	 * 7. (1): class A:a=11 d=2.0 (2): class A:a=3.0f d=java program.
	 * 8.��˵��ʲô�ǳ����ࣿ��������ʲô���ã� ��������������ǰ����abstract�ؼ��ֵ��ࡣ ���ã�һ����̳г�����ͱ���ʵ�ֳ������еķ�����
	 * 9.final���final������ʲô���ã� final�಻�ܱ��̳� final�������ܱ���д��
	 * 10.Object���е�equals������hashcode������ equals�����ǱȽ����������Ƿ���ȡ�
	 * hashcode�����Ƿ��ض���Ĺ�ϣ��ֵ�� 11.throws�ؼ��ֺ�throw�ؼ�����ʲô�������ϵ�� throws�� �ر��쳣
	 * throw�������׳��쳣
	 * 
	 * 12.list��set������ʲô���� list��Ԫ�����򣬿��ظ� set�� Ԫ�����򣬲��ظ���
	 * 13.collection��collections��ʲô���� collection����һ���ӿ� collections����һ����
	 * 14.java�еĶ�̬��ʲô�� ���غ���д
	 * 
	 * 15.���о�java�����еİ��ֻ����������ͣ���˵��ÿ���������͵ĺ��弰���ȡ� byte 1�ֽ� short 2 int 4 double 8
	 * long 8 char 2 float 4 boolean
	 * 
	 * 16.����������������Щ���棿������������ �̳� ������֮�����ʹ�ü̳�������Ժͷ��� ��װ ��һЩ���ݷ�װ����ֻ�����ض��Ķ��������� ��̬
	 * ��д������ 17.������public��private��protected������дʱ������ public������ �� ���� ������
	 * protected�� ���� �� ���� private�� ���� ��д; ���� ��
	 * 18.дһ������Ҫ���ܣ������1,2,5����������ͬ������ϵĺ�Ϊ100����ϸ����� int d=0; for(int
	 * a=0;a<100;a++){ for(int b=0;b<=50;b++){ for(int c=0;c<=20;c++){
	 * if(a+b*2+c*5==100){ d++; } } } } System.out.println(d);
	 * 
	 * }
	 * 
	 * 19.˵��try/catch/finally��������á� �����׳����������������쳣��
	 * 
	 * 20.����ֵ�Ƕ��٣���beijing��.equalsIgnoreCase(new String(��beijing��)) true
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
