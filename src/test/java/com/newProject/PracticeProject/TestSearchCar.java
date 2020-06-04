package com.newProject.PracticeProject;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.PracticeProject.Pages.CarSearchPage;

public class TestSearchCar extends BaseTest {

	@Test
	public void testCarSearch() {
		CarSearchPage car = new CarSearchPage(driver);
		String title = car.clickOnCarOption();
		System.out.println(title);
		Assert.assertEquals(title, "Car Rentals: Find Cheap Car Rentals & Rental Car Deals - KAYAK");

		car.enterPickUpLocation();
		car.enterPickUpDate();
		car.selectPickUpTime();
		car.enterEndDateCarService();
		car.enterEndTimeCarService();
		car.submit();

	}

}
