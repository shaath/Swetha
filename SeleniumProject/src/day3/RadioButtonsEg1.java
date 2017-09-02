package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonsEg1 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com/");
		
		driver.manage().window().maximize();
		
		List<WebElement> radios=driver.findElements(By.name("trip_type"));
		System.out.println(radios.size());
		
		for (int i = 0; i < radios.size(); i++) 
		{
			String rText=radios.get(i).getAttribute("value");
			System.out.println(rText);
			if (rText.equalsIgnoreCase("RoundTrip")) 
			{
				radios.get(i).click();
				break;
			}
		}

	}

}
