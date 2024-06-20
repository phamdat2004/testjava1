package dao;

import java.util.ArrayList;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.donhang;

import util.HibernateUtil;

public class DonHangDao implements DaoInteface<donhang>{

	
	public static DonHangDao get() {
		return new DonHangDao();
	}
	@Override
	public boolean them(donhang t) {
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			session.save(t);
			tr.commit();
			session.close();
			return true;
		} catch (Exception e) {
			System.out.println("Khong the them don hang");
		}
		return false;
	}

	@Override
	public boolean update(donhang t) {
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
	public boolean delete(donhang t) {
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
	public ArrayList<donhang> getSelectAll() {
		ArrayList<donhang> list = new ArrayList<donhang>();
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			String hql = "From DonHang";
			Query query = session.createQuery(hql);
			list = (ArrayList<donhang>) query.getResultList();
			tr.commit();
			session.close();
			
		} catch (Exception e) {
			
		}
		return list;
	}

	@Override
	public donhang getSelectId(donhang t) {
		// TODO Auto-generated method stub
		return null;
	}

}
