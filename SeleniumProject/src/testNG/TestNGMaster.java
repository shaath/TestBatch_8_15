package testNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import methods.GenericMethods;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNGMaster {
	public String br = "Firefox";
	public String url = "http://orangehrm.qedgetech.com";
	public String u = "Admin", p = "Qedge123!@#";
	public String fname = "2Test",lname = "Automation23", eid = "TA8794";
	public String ename = fname+" "+lname, uname = fname+lname+"123", pwd = "Test@8521479630";
	public String prPath = "D:\\TestBatch_8_15_AM\\Workspace\\SeleniumProject\\src\\com\\SeleniumProject\\properties\\OrgHRM.properties";
	public String expval, actval;
	public GenericMethods gm;
	public FileInputStream fi;
	public Properties pr;
	
	@BeforeTest
	public void org_Launch() throws IOException
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
		
		actval = gm.driver.findElement(By.id(pr.getProperty("login"))).getAttribute("value");
		
		Assert.assertEquals(actval, expval, "Launch is failed");
	}
	
	@BeforeClass
	public void org_Login()
	{
		expval = "welcome";
		gm.driver.findElement(By.id(pr.getProperty("username"))).sendKeys(u);
		gm.driver.findElement(By.id(pr.getProperty("password"))).sendKeys(p);
		gm.driver.findElement(By.id(pr.getProperty("login"))).click();
		
		actval = gm.driver.findElement(By.partialLinkText("Welcome")).getAttribute("id");
		
		Assert.assertEquals(actval, expval, "Login is failed");
	}
	
	@AfterClass
	public void org_Logout()
	{
		expval = "LOGIN";
		gm.driver.findElement(By.partialLinkText("Welcome")).click();
		gm.driver.findElement(By.linkText("Logout")).click();
		
		actval = gm.driver.findElement(By.id("btnLogin")).getAttribute("value");
		
		Assert.assertEquals(actval, expval, "Logout is failed");
	}
	
	@AfterTest
	public void org_Close()
	{
		gm.driver.close();
	}
}
