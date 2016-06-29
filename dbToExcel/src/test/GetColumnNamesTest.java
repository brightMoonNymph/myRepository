package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.TcustomerDao;
import dao.impl.TcustomerDaoImpl;
import entity.Tcustomer;
import util.DBUtil;

public class GetColumnNamesTest {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "select * from t_customer where extend1='别克试驾卡'";
		List<Tcustomer> list = new ArrayList<Tcustomer>();
//		TcustomerDao td = new TcustomerDaoImpl();
		Connection conn = DBUtil.getConnection();
		PreparedStatement psmt = conn.prepareStatement(sql);
		ResultSet rs = psmt.executeQuery();
		//rs为查询结果集
		ResultSetMetaData rsmd=rs.getMetaData();
		int count=rsmd.getColumnCount();
		String str = null;
		for(int i=1;i<=count;i++){
//		heads.add(rsmd.getColumnName(i));//把列名存入向量heads中
			str = str+rsmd.getColumnName(i)+" ";
			System.out.println(str);
		}
		
		
	}

}
