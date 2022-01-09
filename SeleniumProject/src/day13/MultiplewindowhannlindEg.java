package day13;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiplewindowhannlindEg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\TestBatch_8_15_AM/Jars/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://gmail.com");
		
//		String gmail_wid = driver.getWindowHandle();
//		System.out.println(gmail_wid);
		
		driver.findElement(By.linkText("Privacy")).click();
		
		Set<String> wids = driver.getWindowHandles();
		
		for (String wid : wids)
		{
			System.out.println(wid);
			driver.switchTo().window(wid);
			Thread.sleep(3000);
			String title = driver.getTitle();
			
			System.out.println(title);
			
			if (title.contains("Privacy Policy"))
			{
				driver.findElement(By.linkText("Terms of Service")).click();
				Thread.sleep(3000);
				System.out.println(driver.getTitle()+"---"+driver.getCurrentUrl());
				break;
			}
		}
		
	}

}
