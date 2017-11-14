package com.revItAutomation.actions;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.revItAutomation.getters.FlightDetailsGetters;

public class FlightDetailsActions 
{
	public static boolean validateIfFlightDetailsPageIsDisplayed(WebDriver driver)
	{
		WebElement webElement = FlightDetailsGetters.getFlightDetailsTitle(driver);

		if(webElement.isDisplayed())
		{
			return true;
		}
		
		return false;
	}
	
	public static void enterDetailsOnFlightDetailsPage(WebDriver driver, Map<Object, Object> loginDataMap){
		
		FlightDetailsGetters.getTripType(driver).click();
		FlightDetailsGetters.getDepartingFrom(driver).sendKeys(loginDataMap.get("departFrom").toString());
		FlightDetailsGetters.getArrivingAt(driver).sendKeys(loginDataMap.get("arriveTo").toString());
		FlightDetailsGetters.getServicingClass(driver).click();
		FlightDetailsGetters.getContinueButton(driver).click();
	}
	
}