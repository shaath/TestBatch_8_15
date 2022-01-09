package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Actions {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "D:\\TestBatch_8_15_AM/Jars/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://faceboook.com");

		WebElement email = driver.findElement(By.id("email"));
		
		Actions act = new Actions(driver);
		
//		act.click(email).perform();
//		Thread.sleep(3000);
//		
//		act.sendKeys(Keys.chord("gjefoes")).perform();
//		Thread.sleep(3000);
//		
//		act.click(email).perform();
//		Thread.sleep(3000);
//		
//		act.sendKeys(Keys.ENTER).perform();
//		
		
		act.click(email).sendKeys(Keys.chord("fiisidhfdi")).click(email).sendKeys(Keys.ENTER).build().perform();
	}

}
