package day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class GmailLoginEg {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		//identifying the email textbox
		WebElement email=driver.findElement(By.id("identifierId"));
		//Enter the email id into email textbox
		
		email.sendKeys("testingtoolstrainer449");
//		Sleeper.sleepTightInSeconds(3);
//		
//		String text=email.getAttribute("value");
//		System.out.println(text);
//		
//		Sleeper.sleepTightInSeconds(3);
//
//		email.clear();
		
		//Clicking on next button
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		
//		Sleeper.sleepTightInSeconds(5);
		
		//Entering password
		driver.findElement(By.name("password")).sendKeys("1234567890");
		//Clicking on next button
		driver.findElement(By.cssSelector(".RveJvd.snByac")).click();

	}

}
