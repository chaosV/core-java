package learnHBN;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.DetachedCriteria;

public class CriteriaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			SessionFactory sf = new Configuration().configure().buildSessionFactory();
			Session session = sf.openSession();
			
			Criteria criteria = session.createCriteria(Student.class);				//在线查询    创建查询对象  接受参数 指明映射对象
			
			System.out.println("-----在线查询-----");
			List student = criteria.list();
			
			for (Object obj : student) {
				System.out.println(obj);
			}
			
			
			DetachedCriteria dc=DetachedCriteria.forClass(Student.class);  //代码可以放在业务层
			
			Criteria ca=dc.getExecutableCriteria(session);
			
																			//代码逻辑可以放在DAO层
			System.out.println("-----离线查询-----");
			List stu=ca.list();
			for (Object obj : student) {
				System.out.println(obj);
			}
			
			session.close();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

}
