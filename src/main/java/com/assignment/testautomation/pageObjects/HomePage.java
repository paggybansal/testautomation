package com.assignment.testautomation.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	// All objects should be defined here
	private By findYourCareerTxtBox = By.cssSelector("input#keywordLocation");
	private By filterByCountry = By.cssSelector("input#location");
	private By ulFindYourCareer = By.xpath("/html[1]/body[1]/ats-app[1]/div[1]/app-page-layout[1]/section[1]/main[1]/app-search[1]/section[1]/div[1]/akamai-multi-input-search[1]/multi-input-search[1]/ifc-search-bar[1]/ifc-search-bar-template[1]/div[1]/div[1]/ifc-taleo-lookup-rest[1]/div[1]/div[2]/div[1]/div[1]/ul[1]");
	private By ulCountryList = By.xpath("/html[1]/body[1]/ats-app[1]/div[1]/app-page-layout[1]/section[1]/main[1]/app-search[1]/section[1]/div[1]/akamai-multi-input-search[1]/multi-input-search[1]/ifc-search-bar[1]/ifc-search-bar-template[1]/div[1]/div[2]/div[1]/div[2]/ifc-taleo-lookup-rest[1]/div[1]/div[2]/div[1]/div[1]/ul[1]");
	private By noOfJobs = By.cssSelector("div.container div.card.border-0.mb-5:nth-child(3) div.card-body.px-4.px-lg-5 div.d-flex.flex-column.flex-md-row.justify-content-between.count-and-sort:nth-child(1) div.text-muted.font-italic.mb-2.overflow-hidden > span:nth-child(1)");
	private By searchBtn = By.xpath("//button[@title='Search']");
	// All methods should be defined here
	public WebElement getFindYourCareerTxtBox() {
		return driver.findElement(findYourCareerTxtBox);
	}
	public WebElement getFilterByCountry() {
		return driver.findElement(filterByCountry);
	}
	public WebElement getulFindYourCareer() {
		return driver.findElement(ulFindYourCareer);
	}
	
	public WebElement getulCountryList() {
		return driver.findElement(ulCountryList);
	}
	
	public WebElement getNoOfJobs() {
		return driver.findElement(noOfJobs);
	}
	
	public WebElement getSearchBtn() {
		return driver.findElement(searchBtn);
	}

}
