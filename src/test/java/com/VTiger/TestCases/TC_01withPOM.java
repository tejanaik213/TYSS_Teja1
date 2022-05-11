package com.VTiger.TestCases;

import org.openqa.selenium.By;

import com.VTiger.ObjectRepo.HomePage;
import com.VTiger.ObjectRepo.LoginPage;
import com.VTiger.ObjectRepo.Organizations;
import com.VTiger.generic.BrowserOpen;
import com.VTiger.generic.TestData;
import com.VTiger.generic.WebDriverUtil;

public class TC_01withPOM extends BrowserOpen {
		
			public static void main(String[] args) throws Throwable {
				BrowserOpen b=new BrowserOpen();
				b.browser1();
				WebDriverUtil wdu=new WebDriverUtil(driver);
				wdu.maxwindow();
				LoginPage lp=new LoginPage(driver);
				lp.logintoApp();
				 TestData td=new TestData();
				String orgname = td.getOrganizationName();
				
				Organizations or=new Organizations(driver);
				or.createOrg(orgname);
				Thread.sleep(4000);
				
				or.searchOrg(orgname);

			Thread.sleep(2000);
			String name = driver.findElement(By.xpath("//a[@title='Organizations']")).getText();
			System.out.println(name);
			
			if(name.equals(orgname))
			{
				System.out.println("Organization is Successfully Created-Verified-Pass");
			}
			else
			{
				System.out.println("Organization is not Created");
			}
			
			HomePage hp=new HomePage(driver);
			hp.logoutfromApp();
			Thread.sleep(4000);
			driver.close();
			}

		}

