package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_keyboardEg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\TestBatch_8_15_AM/Jars/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://google.com");
		
		Thread.sleep(3000);

		WebElement img = driver.findElement(By.linkText("Images"));
		
		Actions act = new Actions(driver);
		
		
		act.moveToElement(img).perform();
		Thread.sleep(3000);
		
		act.contextClick().perform();
		
		Thread.sleep(3000);
		
		
		act.sendKeys(Keys.chord("P")).perform();
		
	}

}
