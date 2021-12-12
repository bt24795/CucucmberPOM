package com.qa.stepDefinitionTest;

import java.io.IOException;

import org.testng.Assert;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps extends TestBase
{
	LoginPage lp;//class level initialize objects
	HomePage hp;
	
	public HomePageSteps() throws IOException 
	{
		super();
	}

	@Given("^user opens browser$")
	public void user_opens_browser() throws IOException 
	{
	    TestBase.initialization();
	}

	@When("^user is already on login page$")
	public void user_is_already_on_login_page() throws IOException
	{
		lp = new LoginPage(); //object
		String title = lp.validatePageTitle();
		Assert.assertEquals(title, "Free CRM - CRM software for customer relationship management, sales, and support.");
	}

	@Then("^user logs into page$")
	public void user_logs_into_page() throws IOException 
	{
		hp = lp.login(p.getProperty("username"),p.getProperty("password")); //from properties file - username / password
	}
	
	@Then("^user validates the title of Home page$")
	public void user_validates_the_title_of_Home_page()  
	{
		String homePageTitle = hp.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "CRMPRO","Home Page title did not match");
	}

	/*
	 * @Then("^user validates loggedin user$") public void
	 * user_validates_loggedin_user() { boolean flag = hp.verifyUserName();
	 * Assert.assertTrue(flag); }
	 */
}
