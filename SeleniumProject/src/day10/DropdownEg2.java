package day10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownEg2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\TestBatch_8_15_AM/Jars/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		WebElement coutry = driver.findElement(By.name("country"));
		
		Select s = new Select(coutry);
		
//		s.selectByIndex(4);
//		Thread.sleep(5000);
//		s.selectByValue("ARGENTINA");
//		Thread.sleep(5000);
//		s.selectByVisibleText("INDIA");
		
		List<WebElement> country_names = s.getOptions();
		
		System.out.println(country_names.size());
		
		for (int i = 0; i < country_names.size(); i++) 
		{
			s.selectByIndex(i);
			
			String name = country_names.get(i).getText();
			System.out.println(name);
			
		}
		

	}

}
