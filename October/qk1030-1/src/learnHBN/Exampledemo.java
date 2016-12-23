package learnHBN;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Example;

public class Exampledemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		
		Student std=new Student();
		std.setLastname("ÕÔ");
		std.setGender("ÄÐ");
		
		Example studentExample=Example.create(std);
		studentExample.excludeZeroes();
		
		Criteria criteria=session.createCriteria(Student.class);
		criteria.add(studentExample);
		

	}

}
