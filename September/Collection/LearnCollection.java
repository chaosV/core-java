package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class LearnCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//声明一个范型威String类型的集合，并分配内存空间
		Collection<String> box;
		box = new ArrayList<String>();
		
		//add:给集合添加元素
		box.add("张三");
		box.add("李四");
		box.add("王五");
		
		//contains:判断集合是否有某个元素
		System.out.println(box.contains("张三"));
		System.out.println(box.contains("赵六"));
		
		//size：获得集合元素的个数
		//remove:删除集合中的某个元素(如果没有，则集合保持不变)
		System.out.println("remove之前有:" + box.size());
		box.remove("张三");
		System.out.println("remove之后有:" + box.size());
		
		//for-each遍历集合
		for (String s : box) {
			System.out.println(s);
		}
		
		//迭代器
		Iterator<String> it = box.iterator();
		while (it.hasNext()) {//判断是否有下一个元素
			System.out.println(it.next());//输出下一个元素
		}
	}

}
