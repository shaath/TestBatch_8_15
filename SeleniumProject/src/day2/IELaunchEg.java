package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IELaunchEg {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "D:\\TestBatch_8_15_AM\\Jars\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("http://selenium.dev");

	}

}
