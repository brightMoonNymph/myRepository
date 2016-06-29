package test;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import dao.TcustomerDao;
import dao.impl.TcustomerDaoImpl;
import entity.Tcustomer;

public class Testtt {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println(0%1000);
//		List<Tcustomer> list = new ArrayList<Tcustomer>();
		TcustomerDao td = new TcustomerDaoImpl();
//		list = td.getAllOfTcustomer();
//		System.out.println(list.size());
		int sub = td.countDBSubItems();
		System.out.println(sub);
		System.out.println((new Date()).toString());
		DateFormat format = new SimpleDateFormat("YYYY-MM-DD");
		Date date = new Date();
		long secondSum = System.currentTimeMillis();
		String str = "C:/Users/强/Desktop/"+"admin_customer_"+format.format(date)+"_"+secondSum+".xls";
		
		File file = new File(str);
		if( !file.exists()){
			file.createNewFile();
		}
		System.out.println(str);
		System.out.println(System.currentTimeMillis());
	}

}
