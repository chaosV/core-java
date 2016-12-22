package qk.lambda;

import java.util.ArrayList;
import java.util.List;

//使用lambda表达式遍历list集合
public class Personlist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> persons=new ArrayList<>();
		persons.add(new Person("张三","化学",64));
		persons.add(new Person("李四","计算机",84));
		persons.add(new Person("王五","化学",64));
		persons.add(new Person("马六","英语",69));
		persons.add(new Person("Q7","化学",69));
		
		persons.forEach((Person p)->System.out.println(p.name+":"+p.department));
		persons.forEach((Person p)->System.out.println(p.name+":"+p.department+":"+p.score));
		
	
	}
	
	

	
}
