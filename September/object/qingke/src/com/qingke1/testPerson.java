package com.qingke1;

import com.qingke.Dog;
import com.qingke.Person;
import com.qingke.Phone;

public class testPerson {
	public static void main(String[] args) {

		Person p = new Person("����", 19);
		Phone newPhone = new Phone("��Ϊ", "6plus");
		p.phone = newPhone;
		System.out.println(p.phone.brand);
		Dog[] dogs = { new Dog(), new Dog(), new Dog() };
		p.dogs = dogs;
		System.out.println(p.dogs.length);
	}
}
