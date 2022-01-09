package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrimusBankLogin {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "D:\\TestBatch_8_15_AM/Jars/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://primusbank.qedgetech.com");
		
		WebElement username = driver.findElement(By.id("txtuId"));
//		username.click();
		username.sendKeys("Admin");
//		Thread.sleep(5000);
//		username.clear();

		driver.findElement(By.name("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
	}

}
