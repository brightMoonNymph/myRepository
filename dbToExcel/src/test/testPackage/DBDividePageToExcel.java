package test.testPackage;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import dao.TcustomerDao;
import dao.TsubUserInfoDao;
import dao.impl.TcustomerDaoImpl;
import dao.impl.TsubUserInfoDaoImpl;
import entity.Tcustomer;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
import util.CreateExcelTitle;
import util.CreateFileUtil;
import util.DBUtil;
import util.GetCustomerDataList;

public class DBDividePageToExcel {
	public static void dividePageDataToExcel(String sql) {
		System.out.println("DBDividePageToExcel.dividePageDataToExcel:" + sql);
		File file = CreateFileUtil.createFile();
		WritableWorkbook writeBook;
		// String sql = "select * from t_customer where extend1='试驾卡券'";
		Connection conn = null;
		PreparedStatement psmt = null;
		Statement stt = null;
		ResultSet rs = null;
		ResultSetMetaData rsmd = null;
		TcustomerDao td = null;
		try {
			td = new TcustomerDaoImpl();
			conn = DBUtil.getConnection();
			// 这样获得的结果集，指针就可以在其中自由移动。然后，就可以用如下方法获取结果集的行数：
			stt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			rs = stt.executeQuery(sql);
			// //计算行
			// int row ;
			// rs.last();
			// row = rs.getRow();
			// System.out.println("row:"+row);
			// 创建excel之前判断数据库记录总量，若大于1000考虑分页
			int sumDBItems = td.countDBSubItems();
			/* 创建excel标题栏开始 */
			writeBook = Workbook.createWorkbook(file);
			// // 新建工作表(sheet)对象，并声明其属于第几页
			// // 第一个参数为工作簿的名称，第二个参数为页数
			WritableSheet firstSheet = writeBook.createSheet("t_customer数据-Test", 0);
			List<String> titleList = CreateExcelTitle.createExcelTitle();
			// 新创建单元格格式控制
			WritableCellFormat cellFormat = new WritableCellFormat();
			cellFormat.setAlignment(jxl.format.Alignment.CENTRE);
			for (int i = 0; i < titleList.size(); i++) {
				// 创建要显示的内容,创建一个单元格，第一个参数为列坐标，第二个参数为行坐标，第三个参数为内容
				Label label = new Label(i, 0, titleList.get(i));
				label.setCellFormat(cellFormat);
				firstSheet.addCell(label);
			}
			/* 创建excel标题栏结束 */
			/* 创建excel主体开始 */
			List<Tcustomer> customerList = new ArrayList<Tcustomer>();
			List<Label> labelList = new ArrayList<Label>();
			// 游标移动首行
			rs.first();
			customerList = GetCustomerDataList.getDataList(rs);
			// 格式化日期数据
			DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			//具有外键关系的4s店店名查询
			TsubUserInfoDao tidi = new TsubUserInfoDaoImpl();
			for (int i = 0; i < customerList.size(); i++) {
				// System.out.println(customerList.get(i));
				int excelColumn = 0;
				// 行加1，因第一行已经是标题栏
				// 短信兑换码
				Label label_1 = new Label(excelColumn++, i + 1, customerList.get(i).getMember_no() + "");
				// 券号Code
				Label label_2 = new Label(excelColumn++, i + 1, customerList.get(i).getCUSTOMER_NAME() + "");
				// 微信结果为空，数据库无此字段:CUSTOMER_PHASE
				Label label_3 = new Label(excelColumn++, i + 1, customerList.get(i).getCUSTOMER_PHASE());
				// 4S店为空:SUB_ACCOUNT_ID,根据此外键查询t_sub_userinfo表的staff_name
				Label label_4 = new Label(excelColumn++, i + 1, customerList.get(i).getStaff_name());
				// 领取时间
				Label label_5 = new Label(excelColumn++, i + 1, format.format(customerList.get(i).getCREATE_DATE()));
				// 数据记录时间
				Label label_6 = new Label(excelColumn++, i + 1, format.format(customerList.get(i).getUPDATE_DATE()));
				// buick结果为空:INDUSTRY_KIND
				Label label_7 = new Label(excelColumn++, i + 1, customerList.get(i).getINDUSTRY_KIND());
				// Buick流水号
				Label label_8 = new Label(excelColumn++, i + 1, customerList.get(i).getCustomer_no() + "");
				// 微信流水号
				Label label_9 = new Label(excelColumn++, i + 1, customerList.get(i).getCUSTOMER_ALIAS() + "");
				// 核销时间(如果是1900-01-01 00:00:00.0，先格式化为yyyy-mm-dd型，设为空)
				String temp = format.format(customerList.get(i).getCustomer_follow_link_date());
				if ("1900-01-01 00:00:00".equals(temp)) {
					Label label_10 = new Label(excelColumn++, i + 1, "");
					firstSheet.addCell(label_10);
				} else {
					Label label_10 = new Label(excelColumn++, i + 1,
							format.format(customerList.get(i).getCustomer_follow_link_date()));
					firstSheet.addCell(label_10);
				}
				// 卡券类型
				Label label_11 = new Label(excelColumn++, i + 1, customerList.get(i).getEXTEND1() + "");
				// 来源
				Label label_12 = new Label(excelColumn++, i + 1, customerList.get(i).getEXTEND2() + "");
				// 领取流水号
				Label label_13 = new Label(excelColumn++, i + 1, customerList.get(i).getEXTEND3() + "");
				// 商户编码为空:extend4
				Label label_14 = new Label(excelColumn++, i + 1, customerList.get(i).getEXTEND4());
				// 卡ID
				Label label_15 = new Label(excelColumn++, i + 1, customerList.get(i).getEXTEND5() + "");
				// 领取者的ID
				Label label_16 = new Label(excelColumn++, i + 1, customerList.get(i).getEXTEND6() + "");
				// 微信真实结果
				Label label_17 = new Label(excelColumn++, i + 1, customerList.get(i).getEXTEND8() + "");
				// 手机
				Label label_18 = new Label(excelColumn++, i + 1, customerList.get(i).getMOBILE_PHONE() + "");
				// 领取参数为空
				Label label_19 = new Label(excelColumn++, i + 1, "");
				firstSheet.addCell(label_1);
				firstSheet.addCell(label_2);
				firstSheet.addCell(label_3);
				firstSheet.addCell(label_4);
				firstSheet.addCell(label_5);
				firstSheet.addCell(label_6);
				firstSheet.addCell(label_7);
				firstSheet.addCell(label_8);
				firstSheet.addCell(label_9);
				// label_10的添加，已放到上面逻辑判断中
				firstSheet.addCell(label_11);
				firstSheet.addCell(label_12);
				firstSheet.addCell(label_13);
				firstSheet.addCell(label_14);
				firstSheet.addCell(label_15);
				firstSheet.addCell(label_16);
				firstSheet.addCell(label_17);
				firstSheet.addCell(label_18);
				firstSheet.addCell(label_19);
			}
			writeBook.write();
			writeBook.close();

		} catch (IOException e) {
			// ODO Auto-generated catch block
			e.printStackTrace();
		} catch (RowsExceededException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (WriteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
