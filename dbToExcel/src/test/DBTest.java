package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Tcustomer;
import util.DBUtil;

public class DBTest {

	public DBTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sql = "select top 20 *from t_customer";
		List<Tcustomer> list = new ArrayList<Tcustomer>();
		try {
			Connection conn = DBUtil.getConnection();
			PreparedStatement ps  = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				Tcustomer customer = new Tcustomer();
				customer.setSEED(rs.getInt("seed"));
				customer.setSUB_ACCOUNT_ID(rs.getString("SUB_ACCOUNT_ID"));
				customer.setCUSTOMER_NAME(rs.getString("CUSTOMER_NAME"));
				list.add(customer);
			}
			System.out.println(list.size()+" :"+list);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
