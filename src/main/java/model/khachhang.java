package model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class khachhang {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String sex;
	private Date ngaySinh;
	@OneToMany(mappedBy = "kh", cascade = CascadeType.ALL)
	private List<donhang> dh = new ArrayList<donhang>();

	public khachhang() {

	}

	public khachhang(String name, String sex, Date ngaySinh) {

		this.name = name;
		this.sex = sex;
		this.ngaySinh = ngaySinh;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public List<donhang> getDh() {
		return dh;
	}

	public void setDh(List<donhang> dh) {
		this.dh = dh;
	}

	public void themDH(donhang dhs) {
		this.dh.add(dhs);
	}

	@Override
	public String toString() {
		return "khachhang [id=" + id + ", name=" + name + ", sex=" + sex + ", ngaySinh=" + ngaySinh+
				"]";
	}
	
	
}
