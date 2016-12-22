package qk.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//使用lambda表达式和函数接口
public class Personlist22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> persons=new ArrayList<>();
		persons.add(new Person("张三","化学",64));
		persons.add(new Person("李四","计算机",84));
		persons.add(new Person("王五","化学",64));
		persons.add(new Person("马六","英语",69));
		persons.add(new Person("Q7","化学",69));
		
		Personlist22 pl2=new Personlist22();
		//pl2.filterPrint(persons,(Person p)->"化学".equals(p.department));
		pl2.filterPrint(persons,(Person p)->p.name.startsWith("王"));
		
	}
	public void filterPrint(List<Person> persons,Predicate<Person> predicate){
		for(Person p:persons){
			if(predicate.test(p)){
				System.out.println(p.name);
			}
		}
	}
}
