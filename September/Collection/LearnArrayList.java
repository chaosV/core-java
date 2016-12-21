package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		//1.增加
		list.add("张三");
		list.add("李四");
		list.add("王五");
		list.add("张三");		
		
		list.add(0, "小二");//根据下标增加元素
		
		//2.访问
		list.get(0);
		
		//3.删除
		list.remove(list.size() - 1);
		
		//4.替换
		list.set(2, "小三");
		
		//5.遍历(两种遍历方式)
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("================");
		
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
