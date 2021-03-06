package methods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BusinessMethods extends GenericMethods{

	public String url = "http://orangehrm.qedgetech.com";
	public String u = "Admin", p = "Qedge123!@#";
	public String prPath = "D:\\TestBatch_8_15_AM\\Workspace\\SeleniumProject\\src\\com\\SeleniumProject\\properties\\OrgHRM.properties";
	public String expval, actval;
	public GenericMethods gm;
	public FileInputStream fi;
	public Properties pr;

	//Launch
	public String org_Launch(String br, String url) throws IOException
	{
		fi = new FileInputStream(prPath);
		pr = new Properties();
		pr.load(fi);
		
		expval = "LOGIN";
		
		gm = new GenericMethods();
		gm.br_Launch(br);
		gm.driver.get(url);
		gm.driver.manage().window().maximize();
		gm.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
//		gm.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		actval = gm.driver.findElement(By.id(pr.getProperty("login"))).getAttribute("value");
		
		if (expval.equalsIgnoreCase(actval)) 
		{
			return "Pass";
		}
		else
		{
			return "Fail";
		}
	}
	
	//Login
	public String org_Login(String u, String p)
	{
		expval = "welcome";
		gm.driver.findElement(By.id(pr.getProperty("username"))).sendKeys(u);
		gm.driver.findElement(By.id(pr.getProperty("password"))).sendKeys(p);
		gm.driver.findElement(By.id(pr.getProperty("login"))).click();
		
		actval = gm.driver.findElement(By.partialLinkText("Welcome")).getAttribute("id");
		
		if (expval.equalsIgnoreCase(actval)) 
		{
			return "Pass";
		}
		else
		{
			return "Fail";
		}
	}
	
	//Logout
	public String org_Logout() throws InterruptedException
	{
		expval = "LOGIN";
		Thread.sleep(3000);
		gm.driver.findElement(By.partialLinkText("Welcome")).click();
		gm.driver.findElement(By.linkText("Logout")).click();
		
		actval = gm.driver.findElement(By.id("btnLogin")).getAttribute("value");
		
		if (expval.equalsIgnoreCase(actval)) 
		{
			return "Pass";
		}
		else
		{
			return "Fail";
		}
	}
	
	//Close
	public void org_Close()
	{
		gm.driver.quit();
	}
	
	//Employee Registration
	public String org_EmpReg(String fname, String lname, String eid)
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
		if (expval.equalsIgnoreCase(actval)) {
			return "Pass";
		}
		else{
			return "Fail";
		}	
	}
	
	//user Registration
	public String org_UserReg(String ename, String uname, String pwd) throws InterruptedException
	{
		boolean flag = false;
		expval = uname;
		gm.driver.findElement(By.linkText("Admin")).click();
		gm.driver.findElement(By.linkText("User Management")).click();
		gm.driver.findElement(By.linkText("Users")).click();
		
		Thread.sleep(3000);
		gm.driver.findElement(By.id("btnAdd")).click();
		Thread.sleep(3000);
		gm.driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(ename);
		gm.driver.findElement(By.id("systemUser_userName")).sendKeys(uname);
		gm.driver.findElement(By.id("systemUser_password")).sendKeys(pwd);
		gm.driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(pwd);
		gm.driver.findElement(By.id("btnSave")).click();
		
		List<WebElement> rows = gm.driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		
		for (int i = 0; i < rows.size(); i++)
		{
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			
			actval = cols.get(1).getText();
			if (actval.equalsIgnoreCase(expval)) {
				flag = true;
				break;
			}
		}
		
		if (flag == true) 
		{
			return "Pass";
		}
		else{
			return "Fail";
		}
	}
}
