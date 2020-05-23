package com.newProject.PracticeProject;


import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.PracticeKayak.utils.ExcelUtils;
import com.PracticeProject.Pages.ResultPage;
import com.PracticeProject.Pages.searchPage;

public class TestSearchFlight  extends BaseTest {
	
	
	@Test(dataProvider="getCellData")
	public void searchAFlight(String Origin, String Destination, String departureDate, String returndate) throws AWTException, InterruptedException
 {
		searchPage search=new searchPage(driver);
		ResultPage result=new ResultPage(driver);
		search.enterOriginCity(Origin);
		search.enterDestinationCity(Destination);
		search.enterDepartureDate(departureDate);
		search.enterReturnDate(returndate);
		search.submit();
		result.closeAlert();
	}
	
	@DataProvider
	public Object[][] getCellData(){
		try {
			Object[][] testData=ExcelUtils.getFlightDataFromExcel("src/test/resources/Test_DataForKayak.xlsx", "sheet1", 4);
			return testData;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
		
	}

}
