package qk.lambda;

import java.util.ArrayList;
import java.util.List;

public class Personlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> persons=new ArrayList<>();
		persons.add(new Person("����","��ѧ",64));
		persons.add(new Person("����","�����",84));
		persons.add(new Person("����","��ѧ",64));
		persons.add(new Person("����","Ӣ��",69));
		persons.add(new Person("Q7","��ѧ",69));
		
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
