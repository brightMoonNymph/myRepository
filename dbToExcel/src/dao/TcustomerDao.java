package dao;

import java.util.List;

import entity.ExcelEntity;
import entity.Tcustomer;

public interface TcustomerDao {
//	List<Tcustomer> tCustomerList = new ArrayList<Tcustomer>();
	List<Tcustomer> getAllOfTcustomer();
	int countDBSubItems();
	List<Tcustomer> getDividePageData(String sql);
	void excelToDB(ExcelEntity entity);
	
}
