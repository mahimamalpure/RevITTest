package com.revItAutomation.locatorvalues;

public interface BookFlightLoctorValues {

	public static final String BOOK_FLIGHT_PAGE_TITLE  = "//b/font/font[contains(text(), 'Summary')]";
	public static final String BUY_FLIGHTS = "//input[@name = 'buyFlights']";
	public static final String FIRST_NAME = "//input[@name = 'passFirst0']";
	public static final String LAST_NAME = "//input[@name = 'passLast0']";
	public static final String TICKETLESS_CHK = "//b[contains(text(), 'Billing Address')]/../../..//input[@name = 'ticketLess']";
	public static final String CC_NUMBER = "//input[@name = 'creditnumber']";
	public static final String FLIGHT_CONFIRMTION_PAGE_TITLE = "//b/font[contains(normalize-space(.), 'Your itinerary has been booked!')]";
}

	
	
	
	