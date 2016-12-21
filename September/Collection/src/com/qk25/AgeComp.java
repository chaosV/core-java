package com.qk25;

import java.util.Comparator;

public class AgeComp implements Comparator<Person1> {

	@Override
	public int compare(Person1 o1, Person1 o2) {
		if(o1.age>o2.age)return 1;
		if(o1.age<o2.age)return -1;
		return 0;
	}
	

}
