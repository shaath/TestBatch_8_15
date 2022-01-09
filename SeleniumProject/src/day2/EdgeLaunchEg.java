package day2;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class EdgeLaunchEg {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "D:\\TestBatch_8_15_AM\\Jars\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();

		driver.get("https://twitter.com");
		driver.manage().window().maximize();
		
//		System.setProperty("webdriver.opera.driver", "D:\\TestBatch_8_15_AM\\Jars\\operadriver_win64\\operadriver.exe");
//		OperaDriver driver = new OperaDriver();
		
	}

}
