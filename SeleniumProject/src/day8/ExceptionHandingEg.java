package day8;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExceptionHandingEg {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.gecko.driver", "D:\\TestBatch_8_15_AM/Jars/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://google.com");
		
		try 
		{
			driver.findElement(By.linkText("About")).click();
			System.out.println(driver.getTitle()+"---"+driver.getCurrentUrl());
		} 
		catch (Exception e) 
		{
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("D:\\TestBatch_8_15_AM\\Workspace\\SeleniumProject\\src\\screenshots\\Exception.jpg"));
			
			System.out.println("There is no link present in Google page with the name Privcy");	
		}
		
		System.out.println("Now the cursor came out of Try catch block");
		System.out.println(driver.getTitle()+"---"+driver.getCurrentUrl());		

	}

}
