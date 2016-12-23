package learnHBN;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.query.Query;


public class StudentDao {
	private Session session;
	
	public StudentDao(Session session){
		this.session=session;
	}
	
	public List<Student> list(){
		Query<Student> query=session.createQuery("from Student",Student.class);
		return query.getResultList();
	}
	
	  public Student getStudentById(int id) {
	        return session.get(Student.class, id);
	    }
	
	public List<Student> listByName(String name){
		Query<Student> query=session.createQuery("from Student where firstname like :name or lastname like :name",Student.class);
		query.setParameter("name", "%"+name+"%");
		return query.getResultList();
	
	}
	
}
