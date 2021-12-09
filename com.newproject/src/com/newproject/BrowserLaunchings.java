package com.newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunchings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Uma\\Webdriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");//opens the browser with this specified url
		
		
		driver.manage().window().maximize();//maximizes the browser
		//driver.quit();//closes the browser
		
		WebElement SignInLink = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
		SignInLink.click();
				
				
		
		
		/*System.setProperty("webdriver.gecko.driver", "C:\\Uma\\Webdriver\\chromedriver_win32\\geckodriver.exe");
		driver =  new FirefoxDriver();
		driver.navigate().to("https://www.amazon.ca")*/;
	}

}
