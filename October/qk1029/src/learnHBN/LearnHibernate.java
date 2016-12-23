package learnHBN;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class LearnHibernate {
	public static void main(String[] args) {
		
	
		try {
			SessionFactory sf = new Configuration().configure().buildSessionFactory();
			Session session = sf.openSession();

			StudentDao dao=new StudentDao(session);
			Student student =dao.getStudentById(1);
			System.out.println(student);
			System.out.println("student login"+student.getLogin());
			
//			StudentStatus stutas=session.get(StudentStatus.class, 1);
			System.out.println("student status"+student);
			

			
			session.close();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}
}
