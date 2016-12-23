package learnHBN;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Lazyload {
	public static void main(String[] args) {
		
		
		try {
			SessionFactory sf = new Configuration().configure().buildSessionFactory();
			Session session = sf.openSession();

			StudentDao dao=new StudentDao(session);
			Student student =dao.getStudentById(1);
			System.out.println(student);
//			System.out.println(student.getStatus());
//			
			session.clear();
//			StudentStatus status=session.get(StudentStatus.class, 110);
//			System.out.println(status);
			System.out.println(student.getStatus());

			
			session.close();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}
}
