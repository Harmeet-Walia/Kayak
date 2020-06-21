package com.PracticeProject.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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
	
	
	
	@FindBy(xpath="//div[contains(@id, '-dateRangeInput-start-time-select-list-wrapper')]")
	WebElement clickOnTimePickUp;
	//c5XXx-dateRangeInput-start-time-select-list
	//c5XXx-dateRangeInput-start-time-select-list-wrapper
	
//	@FindBy(xpath="//ul[contains(@id, 'dateRangeInput-start-time-select-list')]")
//	WebElements selectPickUpTime;
	
	
	
	@FindBy(xpath="//li[contains(text(), '2:00 pm')]")
	WebElement select2PM;
	
	@FindBy(xpath="//div[contains(@id, '-dateRangeInput-display-end-inner')]")
	WebElement endDateCarService;
	
	@FindBy(xpath="//div[contains(@id, '-dateRangeInput-end-time-select-display')]")
	WebElement endTimeCarService;
	
	
	@FindBy(xpath="//div[contains(@id, '-submit')]")
	WebElement submit;
	
	
	
	
	
	public CarSearchPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String clickOnCarOption() {
		clickOnCars.click();
		return driver.getTitle();
		
		
	}
	
	public void enterPickUpLocation(String pickUpLocation) {
		Actions action=new Actions(driver);
		action.click(clickOnPickUp);
		action.sendKeys(Keys.BACK_SPACE).build().perform();
		
		action.sendKeys(pickUpInput, pickUpLocation).sendKeys(Keys.ENTER).pause(2000).build().perform();
	}
	
	public void enterPickUpDate(String dateForPickUp) {
		Actions action=new Actions(driver);
		action.click(clickOnPickUpDate).pause(2000).perform();
		action.sendKeys(Keys.BACK_SPACE).sendKeys(dateForPickUp).pause(2000).sendKeys(Keys.ENTER).build().perform();
		
	}
	 
	public void selectPickUpTime(String pickUpTime) throws InterruptedException {
		
		Actions action=new Actions(driver);
		action.click(clickOnTimePickUp).pause(2000).sendKeys(pickUpTime).pause(2000).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		//driver.findElement(By.xpath("//div[contains(@id, '_-dateRangeInput-start-time-select-list-wrapper')]/ul/li[contains(@id,'-dateRangeInput-start-time-select-option-4')]")).click();
		Thread.sleep(2000);
		
//		Select select=new Select(driver.findElement(By.xpath("//ul[contains(@id, 'dateRangeInput-start-time-select-list')]")));
//		select.selectByVisibleText("1:00 pm");
		
		
		
		
	}
	
	public void enterEndDateCarService(String dropOffDate) {
		Actions action=new Actions(driver);
		action.click(endDateCarService).pause(2000).perform();
		action.sendKeys(Keys.BACK_SPACE).sendKeys(dropOffDate).pause(2000).sendKeys(Keys.ENTER).build().perform();
		
	}
	
	public void enterEndTimeCarService(String dropOffTime) {
		Actions action=new Actions(driver);
		action.click(endTimeCarService).sendKeys(dropOffTime).pause(2000).sendKeys(Keys.ENTER).build().perform();
		
		
	}
	
	public void submit() {
		Actions action=new Actions(driver);
		action.click(submit).pause(2000).build().perform();
		
	}
	
	

}
