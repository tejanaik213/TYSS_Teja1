package com.practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {
	
	@Test
	public void screen() throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888");
		
	
		TakesScreenshot pic = (TakesScreenshot)driver;
		File src=pic.getScreenshotAs(OutputType.FILE);                                      //name
		File des=new File("C:\\Users\\teja\\eclipse-workspace\\TYSS_Teja1\\screenshotFolder\\vtiger.png");
		
		Files.copy(src, des);
	
	}
	
	

}
