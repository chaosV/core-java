package qk.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//ʹ��lambda���ʽ�ͺ����ӿ�
public class Personlist22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> persons=new ArrayList<>();
		persons.add(new Person("����","��ѧ",64));
		persons.add(new Person("����","�����",84));
		persons.add(new Person("����","��ѧ",64));
		persons.add(new Person("����","Ӣ��",69));
		persons.add(new Person("Q7","��ѧ",69));
		
		Personlist22 pl2=new Personlist22();
		//pl2.filterPrint(persons,(Person p)->"��ѧ".equals(p.department));
		pl2.filterPrint(persons,(Person p)->p.name.startsWith("��"));
		
	}
	public void filterPrint(List<Person> persons,Predicate<Person> predicate){
		for(Person p:persons){
			if(predicate.test(p)){
				System.out.println(p.name);
			}
		}
	}
}
