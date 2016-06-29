package util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dao.TcustomerDao;
import dao.impl.TcustomerDaoImpl;

public class DBDataItemsCount {
//	public static void main(String[]args){
//		System.out.println("t_customer总记录条数："+DBDataItemsCount.countDBSubItems());
//	}
	public static int countDBSubItems(){
		int sub = 0;
		TcustomerDao td = new TcustomerDaoImpl();
		sub = td.countDBSubItems();
		return sub;
	}
}
