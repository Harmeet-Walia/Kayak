package com.PracticeProject.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchPage {
	WebDriver driver;

	@FindBy(xpath = "//*[contains(@id,'origin-airport-display')]")
	WebElement originFlightContainer;

	@FindBy(name = "origin")
	WebElement origin;

	@FindBy(xpath = "//li[@id='ap-OAK/304']")
	WebElement selectOriginFromList;

	@FindBy(xpath = "//*[contains(@id, 'destination-airport-display')]")
	WebElement destinationFlightContainer;

	@FindBy(name = "destination")
	WebElement destination;

	@FindBy(xpath = "//li[@id='ap-LAS/35107']")
	WebElement selectDestinationFromList;

	@FindBy(xpath = "//div[contains(@id, 'dateRangeInput-display-start-inner')]")
	WebElement departureDate;
	
	@FindBy(xpath = "//div[contains(@id,'-depart')]")
	WebElement enterDepartDate;
	
	@FindBy(xpath = "//div[contains(@id,'dateRangeInput-display-end-inner')]")
	WebElement ReturnDate;
	
	@FindBy(xpath = "//div[contains(@id,'-return')]")
	WebElement enterReturnDate;
	
	@FindBy(xpath = "//button[contains(@title,'Search flights')]")
	WebElement searchFlights;
	

	public searchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void enterOriginCity() {
		originFlightContainer.click();
		origin.sendKeys(Keys.BACK_SPACE);
		origin.sendKeys(Keys.BACK_SPACE);
		origin.sendKeys("OAK");
		selectOriginFromList.click();

	}

	public void enterDestinationCity() {
		Actions action = new Actions(driver);
		action.click(destinationFlightContainer);
		action.pause(1000).build().perform();

		action.sendKeys(destination, "Las Vegas");
		action.pause(1000).build().perform();
		action.click(selectDestinationFromList).build().perform();

//		destinationFlightContainer.click();
//		destination.sendKeys("Las Vegas");
//		selectDestinationFromList.click();

	}

	public void enterDepartureDate() {
		Actions action = new Actions(driver);
		action.click(departureDate);
		action.pause(1000).build().perform();
		action.click(enterDepartDate).sendKeys(enterDepartDate, Keys.BACK_SPACE).build().perform();
		//enterDepartDate.clear();
		
		action.sendKeys(enterDepartDate, "06/09/2020").build().perform();
		
		

	}

	public void enterReturnDate() {
		Actions action = new Actions(driver);
		action.click(ReturnDate).build().perform();
		action.sendKeys(enterReturnDate, Keys.BACK_SPACE).pause(2000).build().perform();
		action.sendKeys(enterReturnDate, "06/22/2020").build().perform();

	}

	public void submit() {
		searchFlights.click();
		
		
	}

}
