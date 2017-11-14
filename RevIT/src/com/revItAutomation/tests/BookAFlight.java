package com.revItAutomation.tests;

import java.awt.AWTException;
import java.util.Map;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.WebDriver;

import com.revItAutomation.actions.BookFlightActions;
import com.revItAutomation.actions.FlightDetailsActions;
import com.revItAutomation.actions.HomeActions;
import com.revItAutomation.actions.SearchFlightActions;
import com.revItAutomation.config.Configurations;
import com.revItAutomation.config.ReadConfig;
import com.revItAutomation.utils.ExcelReader;
import com.revItAutomation.utils.Utils;

public class BookAFlight 
{
	private WebDriver driver;
	private Map<Object, Object> loginDataMap;
	private Map<Object, Object> flightDataMap;
	private Map<Object, Object> userDataMap;
    @Rule public TestName testName = new TestName();


	@Before
	public void setUp()
	{
		ReadConfig readConfig = new ReadConfig();
		readConfig.loadConfig();

		loginDataMap = ExcelReader.readData("./data.xlsx", "login", 1);
		flightDataMap = ExcelReader.readData("./data.xlsx", "flightdetails", 1);
		userDataMap = ExcelReader.readData("./data.xlsx", "userdetails", 1);
		
		System.out.println("***************** " + testName.getMethodName() + " is started ***********************");
		driver = Utils.launchSelectedBrowser(Configurations.BROWSER_NAME);
	}
	
	@After
	public void tearDown()
	{
		System.out.println("***************** " + testName.getMethodName() + " is finished ***********************");
		driver.close();
	}
	
	@Test
	public void bookAFlight() throws InterruptedException, AWTException
	{
		try {
			HomeActions.login(driver, loginDataMap);
			
			boolean isFlightDetailsPageDisplayed = FlightDetailsActions.validateIfFlightDetailsPageIsDisplayed(driver);

			Assert.assertTrue(isFlightDetailsPageDisplayed);
			
			FlightDetailsActions.enterDetailsOnFlightDetailsPage(driver, flightDataMap);
			
			boolean isSearchFlightPageDisplayed = SearchFlightActions.validateIfSearchFlightDetailsPageIsDisplayed(driver);
			
			Assert.assertTrue(isSearchFlightPageDisplayed);
			
			SearchFlightActions.getContinueBookingButton(driver).click();
			
			BookFlightActions.validateIfBookFlightPageIsDisplayed(driver);
			
			BookFlightActions.enterDetailsOnBuyFlightsPage(driver, userDataMap);
			
			BookFlightActions.clickBuyFlightsButton(driver);
			
			BookFlightActions.validateIfFlightConfirmationPageIsDisplayed(driver);
		
		} catch (Exception e) 
		{
			Utils.getScreenShot(driver, "bookAFlight");
			e.printStackTrace();
		}
	}
}
