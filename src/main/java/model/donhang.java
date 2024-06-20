package model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class donhang {
	@Id
	private String id;
	private String tenSP;
	private float giaBan;
	private Date ngayMua;
	@ManyToOne
	private khachhang kh;

	public donhang() {

	}

	public donhang(String id, String tenSP, float giaBan, Date ngayMua, khachhang kh) {

		this.id = id;
		this.tenSP = tenSP;
		this.giaBan = giaBan;
		this.ngayMua = ngayMua;
		this.kh = kh;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTenSP() {
		return tenSP;
	}

	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}

	public float getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(float giaBan) {
		this.giaBan = giaBan;
	}

	public Date getNgayMua() {
		return ngayMua;
	}

	public void setNgayMua(Date ngayMua) {
		this.ngayMua = ngayMua;
	}

	public khachhang getKh() {
		return kh;
	}

	public void setKh(khachhang kh) {
		this.kh = kh;
	}

	

}
