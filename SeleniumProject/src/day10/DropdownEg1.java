package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownEg1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\TestBatch_8_15_AM/Jars/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://primusbank.qedgetech.com/");
		
		WebElement branch_select = driver.findElement(By.id("drlist"));
		
		Select s = new Select(branch_select);
		
//		s.selectByIndex(1);
//		s.selectByVisibleText("QEdgeTech");
		s.selectByValue("QEdgeTech");

	}

}
