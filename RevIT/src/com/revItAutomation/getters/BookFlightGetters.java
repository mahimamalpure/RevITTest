package com.revItAutomation.getters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.revItAutomation.locators.BookFlightLoctors;

public class BookFlightGetters {

	public static WebElement getBookFlightTitle(WebDriver driver){
		return driver.findElement(BookFlightLoctors.BOOK_FLIGHT_PAGE_TITLE);
	}

	public static WebElement getBuyFlightsButton(WebDriver driver){
		return driver.findElement(BookFlightLoctors.BUY_FLIGHTS);
	}
	
	public static WebElement getFirstNameTextBox(WebDriver driver){
		return driver.findElement(BookFlightLoctors.FIRST_NAME);
	}
	
	public static WebElement getLastNameTextBox(WebDriver driver){
		return driver.findElement(BookFlightLoctors.LAST_NAME);
	}
	
	public static WebElement getCCNumberTextBox(WebDriver driver){
		return driver.findElement(BookFlightLoctors.CC_NUMBER);
	}
	
	public static WebElement getTicketLessChkBox(WebDriver driver){
		return driver.findElement(BookFlightLoctors.TICKETLESS_CHK);
	}

	public static WebElement getFlightConfirmationPageTitle(WebDriver driver){
		return driver.findElement(BookFlightLoctors.FLIGHT_CONFIRMTION_PAGE_TITLE);
	}
}
