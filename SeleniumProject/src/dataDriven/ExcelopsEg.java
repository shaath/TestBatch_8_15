package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelopsEg {

	public static void main(String[] args) throws IOException {
		
		String strPath = "D:\\TestBatch_8_15_AM\\Workspace\\SeleniumProject\\src\\testdata\\TestData.xlsx";
		String strOutpath = "D:\\TestBatch_8_15_AM\\Workspace\\SeleniumProject\\src\\results\\Testres1.xlsx";
		FileInputStream fi = new FileInputStream(strPath);
		
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("EmpReg");
//		XSSFRow r = ws.getRow(6);
//		XSSFCell c = r.getCell(0);
		
//		System.out.println(c.getStringCellValue());
		
		int rNo = ws.getLastRowNum();
		System.out.println(rNo);
		
		//getting columns count for a row
//		XSSFRow r = ws.getRow(0);
//		System.out.println(r.getLastCellNum());
		
		//Reading the data from a single cell		
//		XSSFRow r = ws.getRow(1);
//		XSSFCell c3 = r.createCell(3);
//		
//		c3.setCellValue("Selenium");
		
		for (int i = 1; i <= rNo; i++) 
		{
			XSSFRow r = ws.getRow(i);
			XSSFCell c = r.getCell(0);
			XSSFCell c1 = r.getCell(1);
			XSSFCell c2 = r.getCell(2);
			XSSFCell c3 = r.createCell(3);
			
			String f = c.getStringCellValue();
			String l = c1.getStringCellValue();
			String eid = c2.getStringCellValue();
			
			System.out.println(f+"---"+l+"----"+eid);
			
			c3.setCellValue("Pass");			
			
		}
		
		FileOutputStream fo = new FileOutputStream(strOutpath);
		
		wb.write(fo);
		wb.close();
		
	}

}
