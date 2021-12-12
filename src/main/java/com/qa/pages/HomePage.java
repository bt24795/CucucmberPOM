package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class HomePage extends TestBase
{
	//Initialize the page object
	public HomePage() throws IOException 
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//td[contains(text(),'User: Brinda Tandel')]")
	public WebElement namelabel;
	
	//@FindBy(xpath = "//a[contains(text(),'Contacts')]")
	@FindBy(css = "a[title='Contacts']")
	public WebElement contactsLink;
	
	//@FindBy(xpath = "//a[contains(text(),'New Contact')]")
	//@FindBy(xpath = "//a[@title = 'New Contact']")
	@FindBy(css = "a[title='New Contact']")
	public WebElement newContactLink;
	
	@FindBy(xpath = "//a[contains(text(),'Deals')]")
	public WebElement dealsLink;
	
	@FindBy(xpath = "//a[contains(text(),'Tasks')]")
	public WebElement tasksLink;
	
	public String verifyHomePageTitle()
	{
		return driver.getTitle();
	}
	public boolean verifyUserName()
	{
		return namelabel.isDisplayed();
	}
	
	public void clickOnNewContacts() throws IOException
	{
		Actions a =new Actions(driver);
		a.moveToElement(contactsLink).build().perform();
		newContactLink.click();
	}
}
