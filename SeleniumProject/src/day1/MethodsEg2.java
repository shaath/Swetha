package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class MethodsEg2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://bing.com");
		
		driver.findElement(By.linkText("MSN")).click();
		Sleeper.sleepTightInSeconds(3);
//		driver.quit();
		driver.close();
		

	}

}
