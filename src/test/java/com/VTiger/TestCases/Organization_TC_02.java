package com.VTiger.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.VTiger.generic.BrowserOpen;
import com.VTiger.generic.TestData;
import com.VTiger.generic.WebDriverUtil;

public class Organization_TC_02 extends BrowserOpen {
	
	 public static void main(String args[]) throws Throwable {
		
		 BrowserOpen r=new BrowserOpen();
		 r.browser1();
		 
		 WebDriverUtil u=new WebDriverUtil(driver);
		 u.maxwindow();
		 
    	 driver.findElement(By.xpath("(//a[.='Organizations'])[1]")).click();
    	 driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
    	 
    	 TestData g=new TestData();
    	 String ran=g.getOrganizationName();
    	 
    	 driver.findElement(By.name("accountname")).sendKeys(ran);
    	 
    	 WebElement dd1 = driver.findElement(By.name("industry"));
    	 u.selectValuefromdd(dd1,"Education");
    	 
    	 WebElement dd2 = driver.findElement(By.name("accounttype"));
		 u.selectValuefromdd(dd2,"Customer");
		 
		 WebElement dd3 = driver.findElement(By.name("rating"));
		u.selectValuefromdd("Active", dd3);
		
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[.='Organizations']")).click();
		
		 driver.findElement(By.name("search_text")).sendKeys(ran);
		System.out.println(ran);
		
		WebElement dd4 = driver.findElement(By.id("bas_searchfield"));
		dd4.click();
		Thread.sleep(2000);
		u.selectValuefromdd("Organization Name", dd4);
		
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		String rd = driver.findElement(By.xpath("//a[@title='Organizations']")).getText();
	    System.out.println(rd);
	    
	    if(rd.equals(ran))
	    {
	    	System.out.println("Organization is successfully created");
	    }
	    else
	    {
	    	System.out.println("Organization is not created");
	    }
	    
	    
	 }

}	


