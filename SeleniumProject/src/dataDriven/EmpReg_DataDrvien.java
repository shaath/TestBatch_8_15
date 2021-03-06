package dataDriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import methods.BusinessMethods;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EmpReg_DataDrvien {

	public static void main(String[] args) throws IOException, InterruptedException {
		String strPath = "D:\\TestBatch_8_15_AM\\Workspace\\SeleniumProject\\src\\testdata\\TestData.xlsx";
		String strOutpath = "D:\\TestBatch_8_15_AM\\Workspace\\SeleniumProject\\src\\results\\EmpRes.xlsx";
		String res = null;
		
		FileInputStream fi = new FileInputStream(strPath);
		
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("EmpReg");
		
		int rNo = ws.getLastRowNum();
		System.out.println(rNo);
		
		BusinessMethods bm = new BusinessMethods();
		
		bm.org_Launch("firefox", bm.url);
		bm.org_Login(bm.u, bm.p);
		
		
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
			
			res = bm.org_EmpReg(f, l, eid);
			
			c3.setCellValue(res);			
			
		}
		
		FileOutputStream fo = new FileOutputStream(strOutpath);
		
		wb.write(fo);
		wb.close();
		
		bm.org_Logout();
		bm.org_Close();

	}

}
