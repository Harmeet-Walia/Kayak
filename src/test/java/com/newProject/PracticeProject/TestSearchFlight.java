package com.newProject.PracticeProject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.PracticeProject.Pages.ResultPage;
import com.PracticeProject.Pages.searchPage;

public class TestSearchFlight  extends BaseTest {
	
	
	@Test
	public void searchAFlight() {
		searchPage search=new searchPage(driver);
		ResultPage result=new ResultPage(driver);
		search.enterOriginCity();
		search.enterDestinationCity();
		search.enterDepartureDate();
		search.enterReturnDate();
		search.submit();
		result.closeAlert();
		
		
		
		
		
	}

}
