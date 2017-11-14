package com.revItAutomation.actions;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.revItAutomation.getters.BookFlightGetters;

public class BookFlightActions {
	
	
	public static boolean validateIfBookFlightPageIsDisplayed(WebDriver driver)
	{
		WebElement webElement = BookFlightGetters.getBookFlightTitle(driver);

		if(webElement.isDisplayed())
		{
			return true;
		}
		
		return false;
	}
	
	public static void clickBuyFlightsButton(WebDriver driver){
		
		BookFlightGetters.getBuyFlightsButton(driver).click();
	}

	public static void enterDetailsOnBuyFlightsPage(WebDriver driver, Map<Object, Object> userDataMap) {
		
		BookFlightGetters.getFirstNameTextBox(driver).sendKeys(userDataMap.get("firstName").toString());
		BookFlightGetters.getLastNameTextBox(driver).sendKeys(userDataMap.get("lastName").toString());
		BookFlightGetters.getCCNumberTextBox(driver).sendKeys(userDataMap.get("cardNumber").toString());
		BookFlightGetters.getTicketLessChkBox(driver).click();
	}

	public static boolean validateIfFlightConfirmationPageIsDisplayed(WebDriver driver)
	{
		WebElement webElement = BookFlightGetters.getFlightConfirmationPageTitle(driver);

		if(webElement.isDisplayed())
		{
			return true;
		}
		
		return false;
	}

}
