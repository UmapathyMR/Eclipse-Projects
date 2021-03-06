package com.newproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest1 
{

	public static WebDriver driver;
	
	public static void launch(String browser) 
	{
		if (browser.equals("chrome"))
		{
	
		//System.setProperty("webdriver.chrome.driver", "C:\\Uma\\Webdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		//driver.get("https://www.amazon.com");//opens the browser with this specified url
		
		
		driver.manage().window().maximize();//maximizes the browser
		//driver.quit();//closes the browser
		}
		
		else if (browser.equals("firefox"))
		{
		
			
			/*
			 * System.setProperty("webdriver.gecko.driver",
			 * "C:\\Uma\\Webdriver\\chromedriver_win32\\geckodriver.exe");
			 * WebDriverManager.firefoxdriver().setup(); driver = new FirefoxDriver();
			 * //driver.navigate().to("https://www.amazon.ca");
			 * driver.manage().window().maximize();//maximizes the browser
			 */			 			
			
			//we have go to run command and type "firefox.exe -p" and then create a user defined profile called
			//Userdefinedprofile1 so, now when we run the firefox, it will open the userdefined profile and 
			//we can see the bookmarks that we saved and chropath extensions that we added and so on... so,
			//now the firefox is under user control...
			
			WebDriverManager.firefoxdriver().setup();//here we are setting up the user defined profile
			ProfilesIni p = new ProfilesIni(); // here we are creating object to call the user defined profile using 
			//java defined class ProfileIni means profile initiation...
			 FirefoxProfile userprofile = p.getProfile("Userdefinedprofile1");
			 FirefoxOptions option = new FirefoxOptions();
			 option.setProfile(userprofile);
			 
			 driver = new FirefoxDriver(option);
			 
			 
			
		}
	}	
		
		public static void navigate(String url)
		
	{
		driver.get(url);
			
		
		
		
	}
}
