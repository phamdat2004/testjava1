package dao;

import java.util.ArrayList;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.khachhang;
import util.HibernateUtil;

public class KhachHangDao implements DaoInteface<khachhang>{

	
	public static KhachHangDao get() {
		return new KhachHangDao();
	}
	@Override
	public boolean them(khachhang t) {
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.save(t);
			tr.commit();
			session.close();
			return true;
		} catch (Exception e) {
			System.out.println("Khong the them khach hang");
		}
		return false;
	}

	@Override
	public boolean update(khachhang t) {
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.saveOrUpdate(t);
			tr.commit();
			session.close();
			return true;
		} catch (Exception e) {
			System.out.println("Khong the update khach hang");
		}
		return false;
	}

	@Override
	public boolean delete(khachhang t) {
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.delete(t);
			tr.commit();
			session.close();
			return true;
		} catch (Exception e) {
			System.out.println("Khong the xoa khach hang");
		}
		return false;
	}

	@Override
	public ArrayList<khachhang> getSelectAll() {
		ArrayList<khachhang> list = new ArrayList<khachhang>();
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			String hql = "From khachhang";
			Query query = session.createQuery(hql);
			list = (ArrayList<khachhang>) query.getResultList();
			tr.commit();
			session.close();
			
		} catch (Exception e) {
			
		}
		return list;
	}

	@Override
	public khachhang getSelectId(khachhang t) {
		khachhang kh = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			String hql = "from khachhang where id = :id";
			 Query query = session.createQuery(hql, khachhang.class);
		        query.setParameter("id", t.getId());
		        kh = (khachhang) ((org.hibernate.query.Query) query).uniqueResult();
			tr.commit();
			session.close();
		} catch (Exception e) {
			
		}
		return kh;
	}

}
