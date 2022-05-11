package com.practice;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertionhard {
	
	@Test
	public void sample() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888");
		
		 WebElement un = driver.findElement(By.name("user_name"));
		 boolean value = un.isDisplayed();
		 System.out.println(value);
		 
		 Assert.assertEquals(value, true );
		 un.sendKeys("admin");
		 
		WebElement pwd=driver.findElement(By.name("user_password"));
		boolean pwdvalue=pwd.isDisplayed();
		System.out.println(pwdvalue);
		
		Assert.assertEquals(pwdvalue, true);
		pwd.sendKeys("admin");
		
		WebElement button = driver.findElement(By.id("submitButton"));
		boolean val = button.isDisplayed();
		System.out.println(val);
		
		Assert.assertEquals(val, true);
		button.click();
		
	}

}
