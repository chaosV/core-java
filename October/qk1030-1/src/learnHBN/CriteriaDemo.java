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
			
			Criteria criteria = session.createCriteria(Student.class);				//���߲�ѯ    ������ѯ����  ���ܲ��� ָ��ӳ�����
			
			System.out.println("-----���߲�ѯ-----");
			List student = criteria.list();
			
			for (Object obj : student) {
				System.out.println(obj);
			}
			
			
			DetachedCriteria dc=DetachedCriteria.forClass(Student.class);  //������Է���ҵ���
			
			Criteria ca=dc.getExecutableCriteria(session);
			
																			//�����߼����Է���DAO��
			System.out.println("-----���߲�ѯ-----");
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
