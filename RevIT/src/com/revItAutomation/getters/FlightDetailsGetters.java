package com.revItAutomation.getters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.revItAutomation.locators.FlightDetailsLocators;

public class FlightDetailsGetters 
{
	public static WebElement getFlightDetailsTitle(WebDriver driver)
	{
		return driver.findElement(FlightDetailsLocators.FLIGHT_DETAILS_PAGE_TITLE_LTR);
	}
	
	public static WebElement getTripType(WebDriver driver)
	{
		return driver.findElement(FlightDetailsLocators.TRIP_TYPE_LTR);
	}
	
	public static WebElement getDepartingFrom(WebDriver driver)
	{
		return driver.findElement(FlightDetailsLocators.DEPARTING_FROM_LTR);
	}
	
	public static WebElement getArrivingAt(WebDriver driver)
	{
		return driver.findElement(FlightDetailsLocators.ARRIVING_TO_LTR);
	}
	
	public static WebElement getServicingClass(WebDriver driver)
	{
		return driver.findElement(FlightDetailsLocators.SERV_CLASS_LTR);
	}
	
	public static WebElement getContinueButton(WebDriver driver)
	{
		return driver.findElement(FlightDetailsLocators.CONTINUE_LTR);
	}
}