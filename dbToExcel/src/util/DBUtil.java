package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {
//	static Connection conn = null; 
//	static PreparedStatement ps = null;
//	static ResultSet rs = null;
	public static Connection getConnection(){
		Connection conn = null;
		try{
//			String user = "sa",pwd = "Pass1234";
//			String DriverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
//			String DBUrl = "jdbc:sqlserver://test.highqi-tech.com:1433;SelectMethod=cursor;databaseName=Card";
//			String user = "card",pwd = "card";
//			String DriverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
//			String DBUrl = "jdbc:sqlserver://121.43.104.196:1433;SelectMethod=cursor;databaseName=Card";
			String user = "card",pwd = "card";
			String DriverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
			String DBUrl = "jdbc:sqlserver://wxcard.puzzle-idea.com;SelectMethod=cursor;databaseName=Card";
			Class.forName(DriverName);
			conn = DriverManager.getConnection(DBUrl, user, pwd);
		}catch(Exception e){
			e.printStackTrace();
		}
		return conn;
	}
	public static void closeResource(Connection conn,ResultSet rs,PreparedStatement ps){
		try {
			if(conn != null)
			conn.close();
			if(rs != null){
				rs.close();
			}
			if(ps != null){
				ps.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
