package com.qa.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "D:\\Selenium_Class\\Selenium_WorkSpace\\CucucmberPOM\\src\\main\\java\\com\\qa\\features\\freecrm.feature",
		glue= {"com.qa.stepDefinitionTest"},
		format= { "pretty", "html:test-outout" , "json:json_output/cucumber.json"},
		monochrome = true,
		dryRun = false
		//tags = {"@SmokeTest" , "@RegressionTest"}
		)
public class TestRunner 
{

}