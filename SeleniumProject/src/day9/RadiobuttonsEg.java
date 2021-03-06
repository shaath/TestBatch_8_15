package day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadiobuttonsEg {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\TestBatch_8_15_AM/Jars/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://echoecho.com/htmlforms10.htm");
		
		List<WebElement> radios = driver.findElements(By.xpath("(//td[@class='table5'])[2]/input"));
		
		System.out.println(radios.size());
		
		for (int i = 0; i < radios.size(); i++)
		{
			String rName = radios.get(i).getAttribute("value");
			System.out.println(rName);
			
			if (rName.equalsIgnoreCase("milk"))
			{
				radios.get(i).click();
			}
			else if (rName.equalsIgnoreCase("water"))
			{
				radios.get(i).click();
			}
			
		}

	}

}
