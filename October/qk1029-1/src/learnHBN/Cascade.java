package learnHBN;



import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Cascade {
	public static void main(String[] args){
		try{
			SessionFactory sf=new Configuration().configure().buildSessionFactory();
			Session session=sf.openSession();
			
			StudentDao dao=new StudentDao(session);
			Transaction tx=session.beginTransaction();
			Studentlogin login=session.get(Studentlogin.class, 1);
			session.delete(login);
			tx.commit();
			
			session.close();
		}catch(HibernateException e){
			e.printStackTrace();
		}
	}
}
