package com.PracticeProject.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage {
	WebDriver driver;
	
	
//	@FindBy(xpath = "//div[contains(text(),'Important messages:')]")
//	WebElement closeDialogBox;
	
	@FindBy(xpath = "//div[contains(@id,'mainInfo')]")
	WebElement closeDialogBox;
	
	
	public ResultPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	

	public void closeAlert() {
		closeDialogBox.click();

	}

}
