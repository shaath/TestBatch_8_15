package day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumMethodsEg2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\TestBatch_8_15_AM/Jars/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://google.com");
		System.out.println(driver.getTitle()+"----"+driver.getCurrentUrl());
		
		Thread.sleep(3000);
		
		driver.navigate().to("http://facebook.com");
		System.out.println(driver.getTitle()+"----"+driver.getCurrentUrl());
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		System.out.println(driver.getTitle()+"----"+driver.getCurrentUrl());
		
		Thread.sleep(3000);
		
		driver.navigate().forward();
		System.out.println(driver.getTitle()+"----"+driver.getCurrentUrl());
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		System.out.println(driver.getTitle()+"----"+driver.getCurrentUrl());
		
	}

}
