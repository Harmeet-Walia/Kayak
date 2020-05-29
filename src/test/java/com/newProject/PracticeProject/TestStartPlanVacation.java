package com.newProject.PracticeProject;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.PracticeProject.Pages.searchPage;

public class TestStartPlanVacation extends BaseTest {
	
	@Test
	public void testClickOrlando() {
		searchPage search=new searchPage(driver);
		String title=search.clickStartTravelOrlando();
		Assert.assertEquals("Cheap Flights to Orlando from $26 - KAYAK", title);
	}
	
	@Test
	public void testClickChicago() {
		searchPage search=new searchPage(driver);
		
		String title=search.clickStartTravelChicago();
		Assert.assertEquals(title, "Cheap Flights to Chicago from $25 - KAYAK");
		
	}

}
