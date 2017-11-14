package com.revItAutomation.getters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.revItAutomation.locators.SearchFlightLoctors;

public class SearchFlightGetters {

	public static WebElement getSearchFlightTitle(WebDriver driver){
		return driver.findElement(SearchFlightLoctors.SEARCH_FLIGHT_PAGE_TITLE);
	}

	public static WebElement getContinueBookingButton(WebDriver driver){
		return driver.findElement(SearchFlightLoctors.CONTINUE_BOOKING);
	}

}
