package com.PracticeProject.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarSearchPage {
	
	
	WebDriver driver;
	
	@FindBy(xpath="//li/a[contains(text(), 'Cars')]")
	WebElement clickOnCars;
	
	@FindBy(xpath="//div[contains(@data-placeholder, 'Enter an airport or city')]")
	WebElement clickOnPickUp;
	
	@FindBy(name="pickup")
	WebElement pickUpInput;
	
	@FindBy(xpath="//div[contains(@id, 'dateRangeInput-display-start-inner')]")
	WebElement clickOnPickUpDate;
	
	
	
	@FindBy(xpath="//div[contains(@id, '-dateRangeInput-start-time-select-display')]")
	WebElement clickOnTimePickUp;
	
	@FindBy(xpath="//li[contains(text(), '2:00 pm')]")
	WebElement select2PM;
	
	
	
	
	public CarSearchPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String clickOnCarOption() {
		clickOnCars.click();
		return driver.getTitle();
		
		
	}
	
	public void enterPickUpLocation() {
		Actions action=new Actions(driver);
		action.click(clickOnPickUp);
		action.sendKeys(Keys.BACK_SPACE).build().perform();
		
		action.sendKeys(pickUpInput, "Oakland").sendKeys(Keys.ENTER).pause(2000).build().perform();
	}
	
	public void enterPickUpDate() {
		Actions action=new Actions(driver);
		action.click(clickOnPickUpDate).pause(2000).perform();
		action.sendKeys(Keys.BACK_SPACE).sendKeys("06/08/2020").pause(2000).sendKeys(Keys.ENTER).sendKeys(Keys.ENTER).build().perform();
		
	}
	 
	public void selectPickUpTime() {
		Actions action=new Actions(driver);
		action.click(clickOnTimePickUp).pause(3000).click(select2PM).pause(3000).build().perform();
		
		
		
	}

}
