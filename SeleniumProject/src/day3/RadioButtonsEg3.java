package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonsEg3 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		
		List<WebElement> g1=driver.findElements(By.name("group1"));
		System.out.println(g1.size());
		
		for (int i = 0; i < g1.size(); i++) 
		{
			String text=g1.get(i).getAttribute("value");
			System.out.println(text);
			if (text.equalsIgnoreCase("cheese"))
			{
				g1.get(i).click();
				break;
			}
		}

	}

}
