package testNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmpReg_TC_TestNG extends TestNGMaster{

	@Test(dataProvider = "data")
	public void org_EmpReg(String fname, String lname, String eid)
	{
		expval = fname+" "+lname;
		gm.driver.findElement(By.linkText("PIM")).click();
		gm.driver.findElement(By.linkText("Add Employee")).click();
		
		gm.driver.findElement(By.id("firstName")).sendKeys(fname);
		gm.driver.findElement(By.id("lastName")).sendKeys(lname);
		gm.driver.findElement(By.id("employeeId")).clear();
		gm.driver.findElement(By.id("employeeId")).sendKeys(eid);
		gm.driver.findElement(By.id("btnSave")).click();
		
		actval = gm.driver.findElement(By.xpath("//div[@id='profile-pic']/h1")).getText();
		
		Assert.assertEquals(actval, expval, "Employee Registration failed");
	}
	
	@DataProvider
	public Object[][] data()
	{
		Object[][] x = new Object[4][3];
		
		x[0][0] = "Raju";
		x[0][1] = "K";
		x[0][2] = "RK1234";
		
		x[1][0] = "Rani";
		x[1][1] = "P";
		x[1][2] = "RP3214";
		
		x[2][0] = "Shiva";
		x[2][1] = "S";
		x[2][2] = "SS5432";
		
		x[3][0] = "Uma";
		x[3][1] = "Shankar";
		x[3][2] = "US8524";
		
		return x;
	}
}
