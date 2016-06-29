package util;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GetTableColumns {

	public static List<String> getAllColumns(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
//		String sql = "select * from t_customer where extend1='别克试驾卡'";
		List<String> list = new ArrayList<String>();
//		// TcustomerDao td = new TcustomerDaoImpl();
//		Connection conn = DBUtil.getConnection();
//		PreparedStatement psmt = conn.prepareStatement(sql);
//		ResultSet rs = psmt.executeQuery();
		// rs为查询结果集
		ResultSetMetaData rsmd = rs.getMetaData();
		int count = rsmd.getColumnCount();
//		String str = null;
		for (int i = 1; i <= count; i++) {
			// heads.add(rsmd.getColumnName(i));//把列名存入向量heads中
//			str = rsmd.getColumnName(i) + " ";
//			System.out.println(str);
			list.add(rsmd.getColumnName(i));
		}
		return list;
	}

}
