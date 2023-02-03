package com.assignment.testautomation.actions;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actions {
	
WebDriver driver;
WebDriverWait wait;
	
	public Actions(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public void click(WebElement element) {
		element.click();
	}
	
	public void enterText(WebElement inputfield, String value) {
		inputfield.sendKeys(value);
	}
	
	public String getText(WebElement inputfield) {
		return inputfield.getText();
	}
	
	public void navigateTo(String url) {
		driver.get(url);
		
	}
	
	public void selectFromDropdown(WebElement dropdown, String value) {
		Select dd = new Select(dropdown);
		dd.selectByValue(value);
	}
	
	public void selectOptionWithText(WebElement ul, String textToSelect)  {
		try
		{
			wait.until(ExpectedConditions.visibilityOf(ul));
			Thread.sleep(5000);
			List<WebElement> optionsToSelect = ul.findElements(By.tagName("li"));
			for(WebElement option : optionsToSelect){
		        if(option.getText().equals(textToSelect)) {
		        	System.out.println("Trying to select: "+textToSelect);
		        	//wait.until(ExpectedConditions.visibilityOf(option)).click();;
		            option.click();
		            break;
		        }
		    }}
		catch(NoSuchElementException nse)
		{
			System.out.println("No Such Element:"+nse.getMessage());
		}
		
		catch(InterruptedException nse)
		{
			System.out.println("Interrupted Exception:"+nse.getMessage());
		}
		
		catch(Exception nse)
		{
			System.out.println("Exception:"+nse.getMessage());
		}
			
		
	}

}
