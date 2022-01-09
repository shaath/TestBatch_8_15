package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericMethods {

	public WebDriver driver;
	
	public void br_Launch(String br)
	{
		if (br.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\TestBatch_8_15_AM/Jars/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if (br.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\TestBatch_8_15_AM\\Jars/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (br.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "D:\\TestBatch_8_15_AM\\Jars\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
	}
	
}
