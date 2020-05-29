package com.newProject.PracticeProject;

import org.testng.annotations.Test;

import com.PracticeProject.Pages.searchPage;

public class TestFlightCovid19Options extends BaseTest{
	
	
	@Test
	public void testCovid19Options () {
		searchPage search=new searchPage(driver);
		search.covidOptionsCancelFlight();
		search.covidOptionsBookFlight();
		search.covidPlanVacation();
		
		
		
	}

}
