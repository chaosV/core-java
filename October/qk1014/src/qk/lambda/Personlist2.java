package qk.lambda;

import java.util.ArrayList;
import java.util.List;

//ʹ��lambda���ʽ�ͺ����ӿ�
public class Personlist2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> persons=new ArrayList<>();
		persons.add(new Person("����","��ѧ",64));
		persons.add(new Person("����","�����",84));
		persons.add(new Person("����","��ѧ",64));
		persons.add(new Person("����","Ӣ��",69));
		persons.add(new Person("Q7","��ѧ",69));
		
		Personlist2 pl2=new Personlist2();
		pl2.filterPrint(persons);
	}
	public void filterPrint(List<Person> persons){
		for(Person p:persons){
			if("��ѧ".equals(p.department)){
				System.out.println(p.name);
			}
		}
	}
}
