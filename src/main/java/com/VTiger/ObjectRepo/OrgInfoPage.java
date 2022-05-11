package com.VTiger.ObjectRepo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.VTiger.generic.WebDriverUtil;

public class OrgInfoPage 
{
	WebDriver driver;
	public OrgInfoPage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//img[@alt='Create Organization...']")
	private WebElement createorgbtn;

	@FindBy(xpath="//input[@name='search_text']")
	private WebElement searchfororgtxtbox;

	@FindBy(id ="bas_searchfield")
	private WebElement orgtypedd;

	public WebElement getCreateorgbtn() {
		return createorgbtn;
	}

	public WebElement getSearchfororgtxtbox() {
		return searchfororgtxtbox;
	}

	public WebElement getOrgtypedd() {
		return orgtypedd;
	}

	public WebElement getSearchorgbtn() {
		return searchorgbtn;
	}

	public WebElement getFirstcheckbox() {
		return firstcheckbox;
	}

	@FindBy(name="submit")
	private WebElement searchorgbtn;

	public void searchforOrg(String orgname, String value) {
		getSearchfororgtxtbox().sendKeys(orgname);
		WebDriverUtil webDriverUtil = new WebDriverUtil(driver);
		webDriverUtil.selectValuefromdd(getOrgtypedd(), value);
		getSearchorgbtn().click();
	}

	@FindBy(xpath="//table[@class=\"lvt small\"]//tr[3]//input[@name=\"selected_id\" and @type=\"checkbox\"]")
	private WebElement firstcheckbox;

	@FindBy(xpath="//input[@class=\"crmbutton small delete\"]")
	private WebElement deletebtn;

	public WebElement getDeletebtn() {
		return deletebtn;
	}

	@FindBy(xpath="//span[normalize-space()='No Organization Found !']")
	private WebElement noOrgfound;

	public WebElement getnoOrgfound() 
	{
		return noOrgfound;
	}
	
	@FindBy(xpath="//a[@title='Organizations']")
	private WebElement firstOrg;
	
	public WebElement getfirstOrg() 
	{
		return firstOrg;
	}

}