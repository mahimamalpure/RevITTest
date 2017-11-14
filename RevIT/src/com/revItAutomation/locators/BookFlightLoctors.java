package com.revItAutomation.locators;

import org.openqa.selenium.By;

import com.revItAutomation.locatorvalues.BookFlightLoctorValues;

public interface BookFlightLoctors {
	
	public static final By BOOK_FLIGHT_PAGE_TITLE = By.xpath(BookFlightLoctorValues.BOOK_FLIGHT_PAGE_TITLE);
	public static final By BUY_FLIGHTS = By.xpath(BookFlightLoctorValues.BUY_FLIGHTS);
	public static final By FIRST_NAME = By.xpath(BookFlightLoctorValues.FIRST_NAME);
	public static final By LAST_NAME = By.xpath(BookFlightLoctorValues.LAST_NAME);
	public static final By TICKETLESS_CHK = By.xpath(BookFlightLoctorValues.TICKETLESS_CHK);
	public static final By CC_NUMBER = By.xpath(BookFlightLoctorValues.CC_NUMBER);
	public static final By FLIGHT_CONFIRMTION_PAGE_TITLE = By.xpath(BookFlightLoctorValues.FLIGHT_CONFIRMTION_PAGE_TITLE);
	
}
