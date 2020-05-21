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
	WebElement departDate;

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

	public void enterOriginCity(String Origin) {
		Actions action = new Actions(driver);
		action.click(originFlightContainer);
		action.sendKeys(originFlightContainer, Keys.BACK_SPACE);
		action.sendKeys(originFlightContainer, Keys.BACK_SPACE);
		action.sendKeys(origin, Origin);
		action.pause(2000);
		action.sendKeys(Keys.ENTER);
		action.perform();

	}

	public void enterDestinationCity(String Destination) {
		Actions action = new Actions(driver);
		action.click(destinationFlightContainer);
		action.sendKeys(destinationFlightContainer, Keys.BACK_SPACE);
		action.sendKeys(destinationFlightContainer, Keys.BACK_SPACE);

		action.sendKeys(destination, Destination).pause(2000);
		action.sendKeys(Keys.ENTER).perform();

	}

	public void enterDepartureDate(String departureDate) {
		Actions action = new Actions(driver);
		action.click(departDate);
		action.sendKeys(enterDepartDate, Keys.BACK_SPACE);
		action.sendKeys(enterDepartDate, departureDate).pause(2000).build().perform();

	}

	public void enterReturnDate(String returndate) {
		Actions action = new Actions(driver);
		action.click(ReturnDate).build().perform();
		action.sendKeys(enterReturnDate, Keys.BACK_SPACE);
		action.sendKeys(enterReturnDate, returndate).pause(2000).build().perform();

	}

	public void submit() {
		String previousWindow = driver.getWindowHandle();
		
		searchFlights.click();
		for (String winHandle : driver.getWindowHandles()) {
			if (!winHandle.equals(previousWindow)) {
				driver.switchTo().window(winHandle);
				
				break;
			}
		}

	}

}
