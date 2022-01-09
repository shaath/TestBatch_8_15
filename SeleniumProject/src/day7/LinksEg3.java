package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksEg3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "D:\\TestBatch_8_15_AM/Jars/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://primusbank.qedgetech.com/sitemap.html");
		
		//Way1
//		driver.findElement(By.xpath("//a[@href='home.aspx']")).click();

		//Way2
//		WebElement ml = driver.findElement(By.xpath("//table[@id='Table_011']"));
//		
//		List<WebElement> links = ml.findElements(By.tagName("a"));
//		System.out.println(links.size());
//		Thread.sleep(3000);
//		for (int i = 0; i < links.size(); i++) 
//		{
//			String lname = links.get(i).getText();
//			System.out.println(lname);
//			
//			if (lname.equalsIgnoreCase("Home"))
//			{
//				links.get(i).click();
//				break;
//			}
//		}
		
		//Way3
		driver.findElement(By.xpath("//table[@id='Table_011']")).findElement(By.linkText("Home")).click();
	}

}
