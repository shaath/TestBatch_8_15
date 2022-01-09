package day1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FFLaunch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\TestBatch_8_15_AM/Jars/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://google.com");

	}

}
