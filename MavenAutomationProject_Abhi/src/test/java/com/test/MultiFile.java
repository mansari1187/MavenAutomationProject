package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MultiFile {
	
	@Test(priority=1)
	public void SelectDropDown() throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.in");
		
		Thread.sleep(7000);
		
		System.out.println(driver.getTitle());
		
		driver.manage().window().maximize();
		
		WebElement dropdownoption = driver.findElement(By.id("searchDropdownBox"));
		
		Select sel = new Select(dropdownoption);
		
		sel.selectByIndex(4);
		
		sel.selectByValue("search-alias=beauty");
		
		sel.selectByVisibleText("Deals");
		
		driver.quit();
		
	}
	
	@Test(priority=2)
	public void AdvanceDropDown() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.in");
		
		Thread.sleep(7000);
		
		System.out.println(driver.getTitle());
		
		driver.manage().window().maximize();
		
		WebElement dropdownoption = driver.findElement(By.id("searchDropdownBox"));
		
		Select sel = new Select(dropdownoption);
		
		List<WebElement>li = sel.getOptions();
		
		System.out.println(li.size());
		
		for(int i = 0 ; i<li.size() ; i++)
		{
			li.get(i).click();
			System.out.println(li.get(i).getText());
		}
		
		driver.quit();
	}

}
