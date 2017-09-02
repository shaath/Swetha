package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PrimusBankLogin 
{
	public static WebDriver driver;
	@BeforeTest
	public void launch_Br()
	{
		driver=new FirefoxDriver();
	}
	
	@BeforeClass
	public void launch_App()
	{
		driver.get("http://primusbank.qedgetech.com/");
	}
	
	@Test
	public void login()
	{
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
	}
	
	@AfterClass
	public void logout()
	{
		driver.findElement(By.xpath(".//*[@id='Table_02']/tbody/tr/td[3]/a/img")).click();
	}
	
	@AfterTest
	public void close()
	{
		driver.close();
	}
	

}
