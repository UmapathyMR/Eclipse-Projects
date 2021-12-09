package com.newproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC002 extends BaseTest1 
{

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub

		launch("chrome");
		
		navigate("https://www.amazon.ca");
		
		
		
		WebElement id = driver.findElement(By.id("twotabsearchtextbox"));
		
		id.sendKeys("toys");
		
		//Thread.sleep(5000);
		
		WebElement clicksearch = driver.findElement(By.id("nav-search-submit-button"));
		
		clicksearch.click();
		
		//Thread.sleep(5000);
		
		WebElement id1 = driver.findElement(By.id("twotabsearchtextbox"));
		
		id1.clear();
		
		driver.findElement(By.name("field-keywords")).sendKeys("car");
		
		WebElement clicksearch1 = driver.findElement(By.id("nav-search-submit-button"));
		
		clicksearch1.click();
		
		//Thread.sleep(5000);
		
		WebElement id3 = driver.findElement(By.id("twotabsearchtextbox"));
		
		id3.clear();
		
		//Thread.sleep(5000);
		
		 WebElement id4 = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		 
		 id4.sendKeys("kidstoys");
		 
		
	//	Thread.sleep(5000);
		
		
		
		id4.clear();
		
		driver.findElement(By.linkText("Customer Service")).click();//used to click on static link webelements, ifit is 
		//dynamic webelements then use partial link text as shown below
		
		Thread.sleep(5000);
		
		//driver.findElement(By.partialLinkText("Gift Ide"));
		
		//Thread.sleep(5000);
		
		//driver.close();
		
		//below is printing all tag names under the tagname a....here "a" is the tag name for all 
		//the webelements like customer service, gift ideas, all..etc..
		//we are trying to print all tag names using below notations.
		
		List<WebElement> alltagnames = driver.findElements(By.tagName("a"));
		
		//we have to use forloop to print all tag names...
		for(int i=0;i<alltagnames.size();i++)
			
		{
			if (!alltagnames.get(i).getText().isEmpty())//here we are using this if condition to inform to 
				//the system that do not print empty spaces between the tagnames, the ! mark denotes not equal to...
			{
				System.out.println(alltagnames.get(i).getText());
			}
		}
		
		 //boolean iddis = id.isDisplayed();
		 //System.out.println(iddis);
		
		//boolean idena = id.isEnabled();
		//System.out.println(idena);
		
		 //boolean idsel = id.isSelected();
		 //System.out.println(idsel);
		
	}

}
