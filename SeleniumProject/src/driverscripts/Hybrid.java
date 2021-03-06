package driverscripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import methods.BusinessMethods;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Hybrid {

	public static void main(String[] args) throws IOException, InterruptedException {
			
		String res = null;
		String inPath = System.getProperty("user.dir")+"\\src\\testdata\\Hybrid.xlsx";
		String outPath = System.getProperty("user.dir")+"\\src\\results\\Hybbridres.xlsx";
//		System.out.println(System.getProperty("user.dir"));
		
		BusinessMethods bm = new BusinessMethods();
		
		FileInputStream fi = new FileInputStream(inPath);
		
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		
		XSSFSheet tc_sht = wb.getSheet("Testcase");
		XSSFSheet ts_sht = wb.getSheet("Teststeps");
		XSSFSheet td_sht = wb.getSheet("TestData");
		XSSFSheet emp_reg_data = wb.getSheet("EmpReg");
		
		int tc_sht_Rc = tc_sht.getLastRowNum();
		int ts_sht_Rc = ts_sht.getLastRowNum();
		int emp_Reg_Rc = emp_reg_data.getLastRowNum();
		
		for (int i = 1; i <= tc_sht_Rc; i++)
		{
			tc_sht.getRow(i).createCell(3);
			String exe = tc_sht.getRow(i).getCell(2).getStringCellValue();
//			System.out.println(exe);
			
			if (exe.equalsIgnoreCase("Y"))
			{
				String tc_sht_tcId = tc_sht.getRow(i).getCell(0).getStringCellValue();
//				System.out.println(tc_sht_tcId);
				
				for (int j = 1; j <= ts_sht_Rc; j++)
				{
					String ts_sht_tcId = ts_sht.getRow(j).getCell(0).getStringCellValue();
					
					if (tc_sht_tcId.equalsIgnoreCase(ts_sht_tcId)) {
						
						String key = ts_sht.getRow(j).getCell(3).getStringCellValue();
//						System.out.println(key);
						
						switch (key) {
						case "Launch":
							String br = td_sht.getRow(1).getCell(0).getStringCellValue();
							String url = td_sht.getRow(1).getCell(1).getStringCellValue();
							res = bm.org_Launch(br, url);							
							break;
						case "login":	
							String u = td_sht.getRow(1).getCell(2).getStringCellValue();
							String p = td_sht.getRow(1).getCell(3).getStringCellValue();
							res = bm.org_Login(u, p);
							break;
						case "logout":
							res = bm.org_Logout();
							bm.org_Close();
							break;
						case "Empreg":
							for (int k = 1; k <= emp_Reg_Rc; k++) {
								String fname = emp_reg_data.getRow(k).getCell(0).getStringCellValue();
								String lname = emp_reg_data.getRow(k).getCell(1).getStringCellValue(); 
								String eid = emp_reg_data.getRow(k).getCell(2).getStringCellValue();
								
								res = bm.org_EmpReg(fname, lname, eid);
								
								emp_reg_data.getRow(k).createCell(3).setCellValue(res);
							}							
							break;
						case "Usereg":
							String ename = td_sht.getRow(1).getCell(7).getStringCellValue();
							String uname = td_sht.getRow(1).getCell(8).getStringCellValue();
							String pwd = td_sht.getRow(1).getCell(9).getStringCellValue();
							res = bm.org_UserReg(ename, uname, pwd);
							break;
						case "Ulogin":
							String un = td_sht.getRow(1).getCell(8).getStringCellValue();
							String pw = td_sht.getRow(1).getCell(9).getStringCellValue();
							res = bm.org_Login(un, pw);
							break;
							
						default:
							System.out.println("Give a proper keyword");
							break;
						}
						//Writing the results into test steps sheet
						ts_sht.getRow(j).createCell(4).setCellValue(res);
						//Writing the data into test case sheet
						if (!tc_sht.getRow(i).getCell(3).getStringCellValue().equalsIgnoreCase("Fail"))
						{
							tc_sht.getRow(i).getCell(3).setCellValue(res);
						}
						
					}
				}
			}
			else
			{
				tc_sht.getRow(i).createCell(3).setCellValue("BLOCKED");
			}
					
		}
			
		FileOutputStream fo = new FileOutputStream(outPath);
		wb.write(fo);
		wb.close();
	}

}
