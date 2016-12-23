package qk1027;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import qk1027.Student;
import qk1027.academy_year;
import qk1027.apartment;

public class StudentDao {
	private Session session;
	
	public StudentDao(Session session){
		this.session=session;
	}
	
	public List<Student> list(){
		Query<Student> query=session.createQuery("from Student",Student.class);
		return query.getResultList();
	}
	
	public List<Student> listByName(String name){
		Query<Student> query=session.createQuery("from Student where firstname like :name or lastname like :name",Student.class);
		query.setParameter("name", "%"+name+"%");
		return query.getResultList();
	
	}
	
	public List<apartment> list1(){
		Query<apartment> query=session.createQuery("from apartment",apartment.class);
		return query.getResultList();
	}
	
	
	public List<academy_year> list2(){
		Query<academy_year> query=session.createQuery("from academy_year",academy_year.class);
		return query.getResultList();
	}
}
