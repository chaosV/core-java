package qk.lambda;

import java.util.ArrayList;
import java.util.List;

//ʹ��lambda���ʽ����list����
public class Personlist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> persons=new ArrayList<>();
		persons.add(new Person("����","��ѧ",64));
		persons.add(new Person("����","�����",84));
		persons.add(new Person("����","��ѧ",64));
		persons.add(new Person("����","Ӣ��",69));
		persons.add(new Person("Q7","��ѧ",69));
		
		persons.forEach((Person p)->System.out.println(p.name+":"+p.department));
		persons.forEach((Person p)->System.out.println(p.name+":"+p.department+":"+p.score));
		
	
	}
	
	

	
}
