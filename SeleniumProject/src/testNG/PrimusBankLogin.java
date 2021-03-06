package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PrimusBankLogin {

	public WebDriver driver;
	@BeforeClass
	public void Launch_br()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\TestBatch_8_15_AM/Jars/geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@BeforeMethod
	public void Launch_App()
	{
		driver.get("http://primusbank.qedgetech.com/");
	}
	
	@Test
	public void Login() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
	}
	
	@AfterMethod
	public void Logout() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@href='http://primusbank.qedgetech.com']")).click();
	}
	
	@AfterClass
	public void Close()
	{
		driver.close();
	}
}
