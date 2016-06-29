package dbToExcel;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import dao.TcustomerDao;
import dao.impl.TcustomerDaoImpl;
import entity.Tcustomer;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class DBToExcel {
	public static void main(String[] args) {
		TcustomerDao td = new TcustomerDaoImpl();
		List<Tcustomer> list = new ArrayList<Tcustomer>();
		list = td.getAllOfTcustomer();
		System.out.println(list.size());
		String localExcelFilePath = "C:/Users/强/Desktop/aTagSave.xls";
		File file = new File(localExcelFilePath);
		WritableWorkbook writeBook;
		try {
			writeBook = Workbook.createWorkbook(file);
			// 2、新建工作表(sheet)对象，并声明其属于第几页
			WritableSheet firstSheet = writeBook.createSheet("t_customer数据", 0);// 第一个参数为工作簿的名称，第二个参数为页数
//			Label labelName,labelName2;
			for(int i = -1;i<list.size();i++){
				if(i==-1){
					//创建要显示的内容,创建一个单元格，第一个参数为列坐标，第二个参数为行坐标，第三个参数为内容
					Label label_1 = new Label(0, 0, "seed");
				}
				
				
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
