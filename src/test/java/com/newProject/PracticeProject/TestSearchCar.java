package com.newProject.PracticeProject;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.PracticeKayak.utils.ExcelUtils;
import com.PracticeKayak.utils.ExcelUtilsForCars;
import com.PracticeProject.Pages.CarSearchPage;

public class TestSearchCar extends BaseTest {

	@Test(dataProvider="getCellData")
	public void testCarSearch(String pickUpLocation, String dateForPickUp, String pickUpTime, String dropOffDate, String dropOffTime) throws InterruptedException {
		CarSearchPage car = new CarSearchPage(driver);
		String title = car.clickOnCarOption();
		System.out.println(title);
		Assert.assertEquals(title, "Car Rentals: Find Cheap Car Rentals & Rental Car Deals - KAYAK");

		car.enterPickUpLocation(pickUpLocation);
		car.enterPickUpDate(dateForPickUp);
		car.selectPickUpTime(pickUpTime);
		car.enterEndDateCarService(dropOffDate);
		car.enterEndTimeCarService(dropOffTime);
		car.submit();

	}
	
	@DataProvider
	public Object[][] getCellData(){
		try {
			Object[][] testData=ExcelUtilsForCars.getCarDataFromExcel("src/test/resources/TestDataForCarSearch.xlsx", "sheet1", 5);
			return testData;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
		
	}


}
