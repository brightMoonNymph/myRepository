package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import dao.TsubUserInfoDao;
import util.DBUtil;

public class TsubUserInfoDaoImpl implements TsubUserInfoDao{

	public String getShop4s(String SUB_ACCOUNT_ID) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		String sql = "select staff_name from t_sub_userinfo where SUB_ACCOUNT_ID=?";
		String shop4s = null;
		conn = DBUtil.getConnection();
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, SUB_ACCOUNT_ID);
			rs = psmt.executeQuery();
			while(rs.next()){
				shop4s = rs.getString(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			DBUtil.closeResource(conn, rs, psmt);
		}
		
		return shop4s;
	}
	
//	public static void main(String[] args) {
//		Scanner sca = new Scanner(System.in);
//		TsubUserInfoDaoImpl tidi = new TsubUserInfoDaoImpl();
//		while(true){
//			System.out.println("input:"+tidi.getShop4s(sca.nextLine()));
//		}
//	}
}
