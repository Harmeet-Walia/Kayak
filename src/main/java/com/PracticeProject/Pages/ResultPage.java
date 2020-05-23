package com.PracticeProject.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResultPage {
	WebDriver driver;

//	@FindBy(xpath = "//div[contains(@aria-label,' number 1:')]")
//	@FindBy(xpath = "//button[contains(@id,'-dialog-close')]")
	// @FindBy(xpath="div[contains(@id, '-feature-score')]")
	// @FindBy(xpath = "//div[contains(text(),'Important messages:')]")
//	WebElement closeDialogBox;

	public ResultPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void closeAlert() throws InterruptedException {
		WebElement element = driver.findElement(By.xpath("//div[contains(@aria-label,' number 1:')]"));
//		WebDriverWait wait=new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(element));
		Thread.sleep(2000);

		Actions actions = new Actions(driver);
		actions.pause(1000).click(element).build().perform();

	}

}
