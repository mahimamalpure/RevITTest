package com.revItAutomation.locators;

import org.openqa.selenium.By;

import com.revItAutomation.locatorvalues.FlightDetailsLocatorValues;

public interface FlightDetailsLocators 
{
	public static final By FLIGHT_DETAILS_PAGE_TITLE_LTR = By.xpath(FlightDetailsLocatorValues.FLIGHT_DETAILS_PAGE_TITLE);
	public static final By TRIP_TYPE_LTR = By.xpath(FlightDetailsLocatorValues.TRIP_TYPE);
	public static final By DEPARTING_FROM_LTR = By.xpath(FlightDetailsLocatorValues.DEPARTING_FROM);
	public static final By ARRIVING_TO_LTR = By.xpath(FlightDetailsLocatorValues.ARRIVING_TO);
	public static final By SERV_CLASS_LTR = By.xpath(FlightDetailsLocatorValues.SERV_CLASS);
	public static final By CONTINUE_LTR = By.xpath(FlightDetailsLocatorValues.CONTINUE);
	
	
	
}
