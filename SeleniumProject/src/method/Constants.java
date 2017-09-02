package method;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Constants
{
	public static OrgHRM om=new OrgHRM();
	public static WebDriver driver;
	public static String expval,actval;
	public static String prPath="F:\\Swetha_Recordings\\Swetha\\SeleniumProject\\orgHRM.properties";
	public FileInputStream fi;
	public static Properties pr;

}
