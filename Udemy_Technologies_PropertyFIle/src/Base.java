import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Base 
{
	WebDriver driver = null;
@Test
public void login() throws IOException
{
	Properties prop = new Properties();
	FileInputStream fis = new FileInputStream("E:\\NEW Drive E Data\\New Radha Workspace Dec 2019\\Workspace\\Udemy_Technologies_PropertyFIle\\examplepropertyfile.properties");
	prop.load(fis);
	System.out.println(prop.getProperty("Username"));
	switch(prop.getProperty("browser").toLowerCase())
	{
	case "firefox":
		System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		break;
	case "chrome":
		System.setProperty("webdriver.chrome.driver", "");
		driver = new ChromeDriver();
		break;
	case "ie":
		//driver = new InternetExplorerDriver();
		break;
	}
	driver.get(prop.getProperty("url"));
}
}
