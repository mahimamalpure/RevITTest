package com.revItAutomation.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.revItAutomation.getters.SearchFlightGetters;

public class SearchFlightActions {
	
	
	public static boolean validateIfSearchFlightDetailsPageIsDisplayed(WebDriver driver)
	{
		WebElement webElement = SearchFlightGetters.getSearchFlightTitle(driver);

		if(webElement.isDisplayed())
		{
			return true;
		}
		
		return false;
	}
	
	public static WebElement getContinueBookingButton(WebDriver driver){
		
		return SearchFlightGetters.getContinueBookingButton(driver);
		
	}


}
