package com.PracticeProject.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage {
	WebDriver driver;
	
	
//	@FindBy(xpath = "//div[contains(text(),'Important messages:')]")
//	WebElement closeDialogBox;
	
	@FindBy(xpath = "//div[contains(@aria-label,' number 1:')]")
	//@FindBy(xpath="div[contains(@id, '-feature-score')]")
	WebElement closeDialogBox;
	
	
	public ResultPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	

	public void closeAlert() {
		Actions actions = new Actions(driver);
		actions.pause(2000)
				.click(closeDialogBox)
				.build()
				.perform();

	}

}
