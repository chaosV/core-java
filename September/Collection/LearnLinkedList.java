package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LearnLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();
		doTimings("ArrayList", arrayList);
		doTimings("LinkedList", linkedList);
		
	}

	/**
	 * 计算ArrayList和LinkedLiat的遍历时间
	 * @param type
	 * @param list
	 */
	public static void doTimings(String type, List<Integer> list) {
		long start = System.currentTimeMillis();//获得自1970年至今的毫秒数
		
		for (int i = 0; i < 1E5; i++) {
			list.add(i);
		}
		
		long end = System.currentTimeMillis();
		System.out.println(type + ":" + (end - start));
	}
}
