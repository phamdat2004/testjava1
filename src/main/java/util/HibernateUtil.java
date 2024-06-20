package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static final SessionFactory sessionFactory = builSessionFactory();

	private static SessionFactory builSessionFactory() {
		try {
			return new Configuration().configure().buildSessionFactory();
		} catch (Exception e) {
			System.out.println("Khong the ket noi toi SQL");
		}
		return null;
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
