package qk.lambda;

import java.util.ArrayList;
import java.util.List;

public class Personlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> persons=new ArrayList<>();
		persons.add(new Person("张三","化学",64));
		persons.add(new Person("李四","计算机",84));
		persons.add(new Person("王五","化学",64));
		persons.add(new Person("马六","英语",69));
		persons.add(new Person("Q7","化学",69));
		
		Personlist pl=new Personlist();
		//pl.printPerson(persons);
		
		pl.printPersonFull(persons);
		
	}
	public void printPerson(List<Person> personList){
		for(Person p:personList){
			System.out.println(p.name);
		}
	}
	
	public void printPersonFull(List<Person> personList){
		for(Person p:personList){
			System.out.println(p.name+":"+p.department);
		}
	}
}
