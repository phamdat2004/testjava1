package dao;

import java.util.ArrayList;

public interface DaoInteface<T> {
	public boolean them(T t);
	
	public boolean update(T t);
	
	public boolean delete(T t);
	
	public ArrayList<T> getSelectAll();
	
	public T getSelectId(T t);
}
