package day12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Sleeper;

public class CalanderEg {

	public static void main(String[] args) throws InterruptedException {
		
		String exp_date = "15/August/2022";

		String[] split = exp_date.split("/");
		
		String exp_month_year = split[1]+" "+split[2];
		String exp_day = split[0];
		
		System.out.println(exp_month_year+"---"+exp_day);
		
		System.setProperty("webdriver.gecko.driver", "D:\\TestBatch_8_15_AM/Jars/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://cleartrip.com");
		
		driver.findElement(By.xpath("//*[local-name()='svg' and @class='t-all ml-2']")).click();
		
		Thread.sleep(3000);
		
		String month_year = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]/div")).getText();
		System.out.println(month_year);
		
		while(!exp_month_year.equalsIgnoreCase(month_year))
		{
			driver.findElement(By.xpath("//*[local-name()='svg' and @data-testid='rightArrow' ]")).click();
			month_year = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]/div")).getText();
		}
		
		Thread.sleep(3000);
		
		List<WebElement> cells = driver.findElements(By.xpath("(//div[@class='DayPicker-Body'])[1]/div[@class='DayPicker-Week']/div"));
		
		System.out.println(cells.size());
		for (int i = 0; i < cells.size(); i++) 
		{
			String day = cells.get(i).getText();
			System.out.println(day);
			
			if (exp_day.equals(day))
			{
				cells.get(i).click();
				break;
			}
		}
	}

}
