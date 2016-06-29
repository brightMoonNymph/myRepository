package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import dao.TcustomerDao;
import dao.impl.TcustomerDaoImpl;
import entity.ExcelEntity;
import jxl.Cell;
import jxl.CellType;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;

public class ReadFromExcelUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Workbook readwb = null;   
		  
        try    
  
        {   
  
            //构建Workbook对象, 只读Workbook对象   
//        	readwb = Workbook.getWorkbook(new File("C:/Users/强/Desktop/卡券码.xlsx"));
            //直接从本地文件创建Workbook   
  
            InputStream instream = new FileInputStream("C:/Users/强/Desktop/卡券码_2.xls");   
            
            Workbook  readwb = Workbook.getWorkbook(instream);
  
            //Sheet的下标是从0开始   
  
            //获取第一张Sheet表   
  
            Sheet readsheet = readwb.getSheet(0);   
  
            //获取Sheet表中所包含的总列数   
  
            int rsColumns = readsheet.getColumns();   
  
            //获取Sheet表中所包含的总行数   
  
            int rsRows = readsheet.getRows();   
            TcustomerDao td = new TcustomerDaoImpl();
            List<ExcelEntity> list = new ArrayList<ExcelEntity>();
            //获取指定单元格的对象引用   
  
            for (int i = 0; i < rsRows; i++)   
  
            {   
  
                for (int j = 0; j < rsColumns; j++)   
  
                {   
                	ExcelEntity entity = new ExcelEntity();
                    Cell cell = readsheet.getCell(j, i);   
                	System.out.print(cell.getContents() + " ");   
                	entity.setCustomer_name(cell.getContents());
                	entity.setMobile_phone(cell.getContents());
                    entity.setExtend1("pAOwnv24a4aXsKT-_QaEIrJojzPI");
                	entity.setEXTEND5("pAOwnv24a4aXsKT-_QaEIrJojzPI");
                	list.add(entity);
                }   
            }   
  
            readwb.close();   
            for(ExcelEntity entity:list){
            	td.excelToDB(entity);
            }
  
//            //利用已经创建的Excel工作薄,创建新的可写入的Excel工作薄   
//  
//            jxl.write.WritableWorkbook wwb = Workbook.createWorkbook(new File(   
//  
//                    "F:/红楼人物1.xls"), readwb);   
//  
//            //读取第一张工作表   
//  
//            jxl.write.WritableSheet ws = wwb.getSheet(0);   
//  
//            //获得第一个单元格对象   
//  
//            jxl.write.WritableCell wc = ws.getWritableCell(0, 0);   
//  
//            //判断单元格的类型, 做出相应的转化   
//  
//            if (wc.getType() == CellType.LABEL)    
//  
//            {   
//  
//                Label l = (Label) wc;   
//  
//                l.setString("新姓名");   
//  
//            }   
//  
//            //写入Excel对象   
//  
//            wwb.write();   
//  
//            wwb.close();   
  
        } catch (Exception e) {   
  
            e.printStackTrace();   
  
        } finally {   
  
              
  
        }  
	}
	
	public static List<String> readExcel(String excelFile){
		List<String> list = new ArrayList<String>();
		File file = new File(excelFile);
		
		
		
		
		return list;
	}
}
