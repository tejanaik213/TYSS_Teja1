package com.VTiger.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.VTiger.generic.BrowserOpen;
import com.VTiger.generic.TestData;
import com.VTiger.generic.WebDriverUtil;


public class Organization_TC_01 extends BrowserOpen 
{
      public static void main(String args[]) throws Throwable
      {
    	  BrowserOpen op=new BrowserOpen();
    	  op.browser1();
    	  
    	  WebDriverUtil pge=new WebDriverUtil(driver);
    	  pge.maxwindow();
    	  
    	  
    	 driver.findElement(By.xpath("(//a[.='Organizations'])[1]")).click();
    	 driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
    	 
    	 TestData td=new TestData();
    	String orgname =td.getOrganizationName();
    	
    	driver.findElement(By.name("accountname")).sendKeys(orgname);
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[.='Organizations'])[1]")).click();
		
		driver.findElement(By.xpath("//input[@name='search_text']")).sendKeys(orgname);
		Thread.sleep(2000);
//		WebDriverUtil ds=new WebDriverUtil (driver);
		WebElement ddr = driver.findElement(By.name("search_field"));
		ddr.click();
	    
//		WebDriverUtil ds=new WebDriverUtil (driver);
		pge.selectValuefromdd(ddr,1);
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(2000);
		
	    //  String  str = driver.findElement(By.xpath("//a[text()='']")).getText();
	    //  System.out.println(str);
	    
    	String str=driver.findElement(By.xpath("//a[@title='Organizations']")).getText();
    	System.out.println(str);
    	
    	if(str.equals(orgname))
    	{
    		System.out.println("Organization is successfully created");
    	}
    	else
    	{
    		System.out.println("Organization is not created");
    	}
    
    	
    	driver.close();
      }
}