package test;

import java.sql.Date;
import java.util.ArrayList;

import dao.DonHangDao;
import dao.KhachHangDao;
import model.donhang;
import model.khachhang;

public class Test {
	public static void main(String[] args) {
		khachhang kh2 = new khachhang();
		kh2.setId(1);
		khachhang kh3  = KhachHangDao.get().getSelectId(kh2);
		khachhang kh9 = new khachhang();
		donhang dh = new donhang();
		dh.setId("SV01");
		dh.setGiaBan(5000);
		dh.setNgayMua(new Date(System.currentTimeMillis()));
		dh.setTenSP("Keo KIT");
		dh.setKh(kh9);
		
		kh9.themDH(dh);
		
	//	kh3.themDH(dh);
	//	KhachHangDao.get().(kh3);
		System.out.println(kh3);
	}
}
