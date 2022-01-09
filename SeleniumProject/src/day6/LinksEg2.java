package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksEg2 {

	public static void main(String[] args) {
		
		boolean flag = false;
		
		System.setProperty("webdriver.gecko.driver", "D:\\TestBatch_8_15_AM/Jars/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://bing.com");
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for (int i = 0; i < links.size(); i++) 
		{
			String name = links.get(i).getText();
			System.out.println(name);
			
			if (name.equalsIgnoreCase("Videos")) {
				
				flag = true;
				break;
			}
		}
		
		if (flag == true) 
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		

	}

}
