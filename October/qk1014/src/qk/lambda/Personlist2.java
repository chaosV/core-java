package qk.lambda;

import java.util.ArrayList;
import java.util.List;

//使用lambda表达式和函数接口
public class Personlist2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> persons=new ArrayList<>();
		persons.add(new Person("张三","化学",64));
		persons.add(new Person("李四","计算机",84));
		persons.add(new Person("王五","化学",64));
		persons.add(new Person("马六","英语",69));
		persons.add(new Person("Q7","化学",69));
		
		Personlist2 pl2=new Personlist2();
		pl2.filterPrint(persons);
	}
	public void filterPrint(List<Person> persons){
		for(Person p:persons){
			if("化学".equals(p.department)){
				System.out.println(p.name);
			}
		}
	}
}
