package util;

import dao.TcustomerDao;
import dao.impl.TcustomerDaoImpl;

public class GetDividePageSQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = GetDividePageSQL.getDividePageSql();
		for(String ss:s)
		System.out.println("query test："+ss);
	}

	public static String[] getDividePageSql() {
		TcustomerDao td = new TcustomerDaoImpl();
		// 计算数据库符合条件的所有数据的总量
		long sum = td.countDBSubItems();
		// 千分位计数(即多少个千)
		long tCount = sum / 2000l;
		String[] s;
		// 记录分页
		int start = 0, end = 1;
		// 根据以上，生成查询sql语句(以1000为分割单位)
		if (sum == 0) {
			return null;
		} else if (sum % 2000 == 0) {// 没有余数情况
			s = new String[(int) tCount];
			for (int i = 1; i <= tCount; i++) {
				s[i - 1] = "select top 1000 * from ("
						+ "select row_number() over(order by tc.seed) "
						+ "as "
						+ "rownumber,tc.SUB_ACCOUNT_ID,tsu.staff_name,tc.Member_no,tc.CUSTOMER_NAME,tc.CUSTOMER_PHASE,tc.CREATE_DATE,tc.UPDATE_DATE,tc.INDUSTRY_KIND,tc.Customer_no,tc.CUSTOMER_ALIAS,tc.Customer_follow_link_date,tc.EXTEND1,tc.EXTEND2,tc.EXTEND3,tc.extend4,tc.EXTEND5,tc.EXTEND6,tc.EXTEND8,tc.MOBILE_PHONE "
						+ "from t_customer tc LEFT JOIN T_SUB_USERINFO tsu ON tc.SUB_ACCOUNT_ID = tsu.SUB_ACCOUNT_ID "
						+ "WHERE "
						+ "(tc.extend1='试驾卡券' or tc.extend1='购车卡券')) "
						+ "as A "
						+ "where rownumber > "
						+ start *2000
						+ " and rownumber <="
						+ end * 2000 ;
						//+ " and extend1='试驾卡券'";
//						+ " and extend1='别克试驾卡'";
				start++;
				end++;
			}
			// //输出sql
			// for(String str:s)
			// System.out.println(str);
			return s;
		} else {
			// 有余数，长度tCount+1
			s = new String[(int) tCount + 1];
			for (int i = 1; i <= tCount + 1; i++) {
				s[i - 1] = "select top 2000 * from ("
						+ "select row_number() over(order by tc.seed) "
						+ "as "
						+ "rownumber,tc.Member_name,tc.seed,tc.SUB_ACCOUNT_ID,tsu.staff_name,tc.Member_no,tc.CUSTOMER_NAME,tc.CUSTOMER_PHASE,tc.CREATE_DATE,tc.UPDATE_DATE,tc.INDUSTRY_KIND,tc.Customer_no,tc.CUSTOMER_ALIAS,tc.Customer_follow_link_date,tc.EXTEND1,tc.EXTEND2,tc.EXTEND3,tc.extend4,tc.EXTEND5,tc.EXTEND6,tc.EXTEND8,tc.MOBILE_PHONE "
						+ "from t_customer tc LEFT JOIN T_SUB_USERINFO tsu ON tc.SUB_ACCOUNT_ID = tsu.SUB_ACCOUNT_ID "
						+ "WHERE "
						+ "(tc.extend1='试驾卡券' or tc.extend1='购车卡券')) "
						+ "as A "
						+ "where rownumber > "
						+ start *2000
						+ " and rownumber <="
						+ end * 2000 ;
						//+ " and extend1='试驾卡券'";
//						+ " and extend1='别克试驾卡'";
				start++;
				end++;
			}
			// //输出sql
			// for(String str:s)
			// System.out.println(str);
			return s;
		}
	}
}
