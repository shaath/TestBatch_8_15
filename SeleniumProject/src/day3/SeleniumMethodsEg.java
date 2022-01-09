package day3;

import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumMethodsEg {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\TestBatch_8_15_AM/Jars/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://facebook.com");
		
//		String title = driver.getTitle();
//		System.out.println(title);
//		
//		String url = driver.getCurrentUrl();
//		System.out.println(url);
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);

	}

}
