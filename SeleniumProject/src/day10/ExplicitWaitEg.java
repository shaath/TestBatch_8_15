package day10;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitEg {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\TestBatch_8_15_AM\\Jars/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://Amazon.in");
		driver.manage().window().maximize();
		
//		WebDriverWait wait = new WebDriverWait(driver, 60);	
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(100))
				.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='https://m.media-amazon.com/images/I/71MwDPWV9XL._SX3000_.jpg']")));

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/71MwDPWV9XL._SX3000_.jpg']")));

	}

}
