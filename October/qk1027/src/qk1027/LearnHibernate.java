package qk1027;



import java.util.List;

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
			List<apartment> student=dao.list1();

			
			session.close();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}
}
