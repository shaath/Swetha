package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;

public class DropdownEg1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///F:/Sharath/Desktop/cars.html");
		driver.manage().window().maximize();
		
		WebElement drop=driver.findElement(By.xpath("html/body/select"));
		
		Select s=new Select(drop);
		
//		s.selectByIndex(3);
//		Sleeper.sleepTightInSeconds(3);
//		Thread.sleep(3000);
//		s.selectByValue("mercedes");
//		Sleeper.sleepTightInSeconds(3);
//		s.selectByVisibleText("Saab");
		
		List<WebElement> dlist=s.getOptions();
		
		System.out.println(dlist.size());
		for (int i = 0; i < dlist.size(); i++)
		{
			s.selectByIndex(i);
			String name=dlist.get(i).getText();
			System.out.println(name);
		}
		
	}

}
