package method;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MethodsEg {
	public static WebDriver driver;

	public static void main(String[] args) 
	{
		function1();
		String res=function2();
		System.out.println(res);
		MethodsEg m=new MethodsEg();
		m.function3();

		boolean flag=m.function4();
		System.out.println(flag);
	}
	//static method without returning any value
	public static void function1()
	{
		System.out.println("This is Function1 code");
	}
	//static method with returning value
	public static String function2()
	{
		System.out.println("This is Function2 code");
		return "Fail";
	}
	//Nonstatic Method without returning any value
	public void function3()
	{
		System.out.println("This is Function3 code");
	}
	//Non static Method with returning value
	public boolean function4()
	{
		System.out.println("This is Function4 code");
		return true;
	}
	public int sum(int a,int b)
	{
		
		int c=a+b;
		return c;
	}
	public double sum(double a,double b,double c)
	{
		double d=a+b+c;
		return d;
	}
	
	public void br_Launc(String br,String url)
	{
		if (br.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if (br.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "F:\\Cdownloads/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if (br.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "F:\\Cdownloads\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		driver.get(url);
	}
	
	public void send_text(String Loc, String value, String text)
	{
		if (Loc.equalsIgnoreCase("id"))
		{
			driver.findElement(By.id(value)).sendKeys(text);
		}
		else if (Loc.equalsIgnoreCase("name")) 
		{
			driver.findElement(By.name(value)).sendKeys(text);
		}
		else if (Loc.equalsIgnoreCase("classname")) 
		{
			driver.findElement(By.className(value)).sendKeys(text);
		}
		else if (Loc.equalsIgnoreCase("tagname")) 
		{
			driver.findElement(By.tagName(value)).sendKeys(text);
		}
		else if (Loc.equalsIgnoreCase("xpath"))
		{
			driver.findElement(By.xpath(value)).sendKeys(text);
		}
		else if (Loc.equalsIgnoreCase("cssselector"))
		{
			driver.findElement(By.cssSelector(value)).sendKeys(text);
		}
	}
	
	public void click(String Loc, String value)
	{
		if (Loc.equalsIgnoreCase("id"))
		{
			driver.findElement(By.id(value)).click();
		}
		else if (Loc.equalsIgnoreCase("name")) 
		{
			driver.findElement(By.name(value)).click();
		}
		else if (Loc.equalsIgnoreCase("classname")) 
		{
			driver.findElement(By.className(value)).click();
		}
		else if (Loc.equalsIgnoreCase("tagname")) 
		{
			driver.findElement(By.tagName(value)).click();
		}
		else if (Loc.equalsIgnoreCase("linktext"))
		{
			driver.findElement(By.linkText(value)).click();

		}
		else if (Loc.equalsIgnoreCase("partiallinktext"))
		{
			driver.findElement(By.partialLinkText(value)).click();
		}
		else if (Loc.equalsIgnoreCase("xpath"))
		{
			driver.findElement(By.xpath(value)).click();
		}
		else if (Loc.equalsIgnoreCase("cssselector"))
		{
			driver.findElement(By.cssSelector(value)).click();
		}
		
	}
	
	public void takes_screenshot(String name) throws IOException
	{
		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("F:\\Swetha_Recordings\\Swetha\\SeleniumProject\\src\\screenshots\\"+name+".png"));

	}
}
