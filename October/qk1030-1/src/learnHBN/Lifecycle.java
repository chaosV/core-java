package learnHBN;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Lifecycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			SessionFactory sf=new Configuration().configure().buildSessionFactory();
			Session session=sf.openSession();
			
			//onLoad
			StudentStatus stat=session.get(StudentStatus.class,111);
			System.out.println(stat);
			
			//onUpdate
//			StudentStatus stat1=new StudentStatus();
//			stat1.setId(1);
//			session.update(stat1);
			
			StudentStatus stat2=new StudentStatus();
			stat2.setId(114);
//			stat2.setCode("new_act");
//			stat2.setName("new_act");
//			stat2.setDescription("new act");
//			
//			
//			Transaction tn= session.beginTransaction();
//			//onSave
//			session.save(stat2);
//			tn.commit();
			
			//onDelete
			Transaction tx= session.beginTransaction();
			session.delete(stat2);
			tx.commit();
			
		}catch(HibernateException e){
			e.printStackTrace();
			
		}
	}

}
