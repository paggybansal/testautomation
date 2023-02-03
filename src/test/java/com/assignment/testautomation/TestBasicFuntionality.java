package com.assignment.testautomation;

import org.testng.annotations.Test;

import com.assignment.testautomation.actions.Actions;
import com.assignment.testautomation.base.Base;
import com.assignment.testautomation.pageObjects.HomePage;

import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class TestBasicFuntionality extends Base {
	
	
	public WebDriver driver;
	public Actions actions;
	
	@BeforeTest
	  public void beforeTest() throws IOException {
		  
		   driver = initializeDriver();
			actions = new Actions(driver);
	  }
	
	
  @Test(description = "Unlogged customer is able to search for a job", priority = 1)
  public void searchForAJobMatchingGivenCriteria() {
	  
	  HomePage hp = new HomePage(driver);
	  
	  actions.navigateTo(prop.getProperty("url"));
	  actions.enterText(hp.getFindYourCareerTxtBox(), "Senior Software Development Engineer in Test");
	  actions.selectOptionWithText(hp.getulFindYourCareer(),"senior software development engineer in test");
	  actions.enterText(hp.getFilterByCountry(), "Poland");
	  actions.selectOptionWithText(hp.getulCountryList(), "Poland");
	  System.out.println(actions.getText(hp.getNoOfJobs()));
  }
  
  @Test(description = "Customer is notified when no offers match given criteria", priority = 2)
  public void customerIsNotifiedWhenNoOffersMatchGivenCriteria() {
	  
	  HomePage hp = new HomePage(driver);
	  
	  actions.navigateTo(prop.getProperty("url"));
	  actions.enterText(hp.getFindYourCareerTxtBox(), "XXX");
	  actions.click(hp.getSearchBtn());
	  Assert.assertEquals(actions.getText(hp.getNoOfJobs()), "We found 0 jobs based on your search criteria");
  }
  

  @AfterTest
  public void afterTest() {
	 driver.quit();
  }

}
