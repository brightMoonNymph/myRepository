package test;

import java.util.Arrays;

public class DividePageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long sum = 5000,tCount,remainder;
		tCount = sum/1000l;
		remainder = sum%1000l;
		System.out.println("分页个数(多少个千)："+tCount+" 余数："+remainder);
		//根据以上，生成查询sql语句(以1000位分割单位)
		String[] s ;
		if(sum==0){
			System.exit(0);
		}else if(sum%1000==0){
			//记录分页
			int start = 0,end = 1;
			s = new String[(int)tCount];
			for(int i = 1; i <= tCount; i++){
				s[i-1] = "select top 1000 * from (select row_number() over(order by seed) as rownumber,* from t_customer) "
						+ "as A where rownumber > "+start*1000+" and rownumber <="+end*1000+" and extend1='试驾卡券'";
				start++;
				end++;
			}
			//输出sql
			for(String str:s)
			System.out.println(str);

		}else{
			//有余数，长度tCount+1
			//记录分页
			int start = 0,end = 1;
			s = new String[(int)tCount+1];
			for(int i = 1; i <= tCount+1; i++){
				s[i-1] = "select top 1000 * from (select row_number() over(order by seed) as rownumber,* from t_customer) "
						+ "as A where rownumber > "+start*1000+" and rownumber <="+end*1000+" and extend1='试驾卡券'";
				start++;
				end++;
			}
			//输出sql
			for(String str:s)
			System.out.println(str);
		}
	}

}
