package com.revItAutomation.locators;

import org.openqa.selenium.By;

import com.revItAutomation.locatorvalues.SearchFlightLoctorValues;

public interface SearchFlightLoctors {
	
	public static final By SEARCH_FLIGHT_PAGE_TITLE = By.xpath(SearchFlightLoctorValues.SEARCH_FLIGHT_PAGE_TITLE);
	public static final By CONTINUE_BOOKING = By.xpath(SearchFlightLoctorValues.CONTINUE_BOOKING);
}
