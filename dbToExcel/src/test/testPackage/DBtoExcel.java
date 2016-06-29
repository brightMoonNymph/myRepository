package test.testPackage;

import util.GetDividePageSQL;

public class DBtoExcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] sql = GetDividePageSQL.getDividePageSql();
		System.out.println("DBtoExcel.main:"+sql.length);
		dbToExcel(sql);
//		System.out.println("试驾卡券：总量"+test_drive+"，增量");
	}
	
	public static void dbToExcel(String[] sql){
		for(String ss:sql){
			DBDividePageToExcel.dividePageDataToExcel(ss);
		}
	}
}
