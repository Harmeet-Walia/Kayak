package com.newProject.PracticeProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest {
	WebDriver driver;
	
	
	@BeforeMethod
	@Parameters("browser")
	
	public void initiateDriver(@Optional("chrome") String browser) throws Exception{
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\walia\\SeleniumDrivers\\chromedriver.exe");
			driver=new ChromeDriver();
			
			driver.get("https://www.kayak.com/flights");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
//		} else if(browser.equals("FireFox")) {
//			System.setProperty("webdriver.gecko.driver", "C:\\Users\\walia\\SeleniumDrivers\\chromedriver.exe");
//			driver.get("http://www.kayak.com");
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			driver.manage().window().maximize();
			
			
	}

}
}
