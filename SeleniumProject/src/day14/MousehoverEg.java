package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MousehoverEg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\TestBatch_8_15_AM/Jars/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://amazon.in");
		
		Thread.sleep(5000);
		
		WebElement signin = driver.findElement(By.id("nav-link-accountList"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(signin).perform();
		
		Thread.sleep(3000);
		
		WebElement prime = driver.findElement(By.xpath("//span[text()='Your Prime Video']"));	
		act.click(prime).perform();
		
	}

}
