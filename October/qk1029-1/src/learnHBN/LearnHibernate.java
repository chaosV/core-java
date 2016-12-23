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
			System.out.println(student.getLogin());
			System.out.println(student.getStatus());
			
			StudentStatus status=session.get(StudentStatus.class, 110);
			System.out.println(status);
			System.out.println(status.getStudents().size());

			
			session.close();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}
}
