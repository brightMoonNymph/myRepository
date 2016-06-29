package util;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CreateFileUtil {
	public static void main(String[] args) {
//		System.out.println((new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss")).format(new Date(System.currentTimeMillis())));
		CreateFileUtil.createFile();
		}
	public static File createFile(){
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss");
		DateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date(System.currentTimeMillis());
		long secondSum = System.currentTimeMillis();
		String fileStr = "C:/Users/强/Desktop/excel_home/"+format2.format(date);
//		String str = "C:/Users/强/Desktop/excel_home/"+"admin_customer_"+format.format(date)+"_"+secondSum+".xls";
		String excelStr = fileStr+"/admin_customer_"+format.format(date)+"_"+secondSum+".xls";
		//先创建当天文件夹
		File file2 = new File(fileStr);
		if( !file2.exists()){
			file2.mkdirs();
		}
		File file = new File(excelStr);
		if( !file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return file;
	}
}
