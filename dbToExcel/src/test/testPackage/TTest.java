package test.testPackage;

import java.io.File;
import java.io.IOException;

import dao.TcustomerDao;
import dao.impl.TcustomerDaoImpl;

public class TTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TcustomerDao td = new TcustomerDaoImpl();
		int sum = td.countDBSubItems();
		System.out.println(sum);
//		File file = new File("C:/Users/强/Desktop/excel_home/excelTest/test.xls222");
//		if(!file.exists()){
//			file.mkdirs();
//		}
	}

}
