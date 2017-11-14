package com.revItAutomation.locatorvalues;

public interface FlightDetailsLocatorValues 
{
	public static final String FLIGHT_DETAILS_PAGE_TITLE  = "//b[contains(normalize-space(.), 'Flight Details')]";
	public static final String TRIP_TYPE = "//input[@value='oneway']";
	public static final String DEPARTING_FROM = "//*[@name='fromPort']";
	public static final String ARRIVING_TO = "//*[@name='toPort']";
	public static final String SERV_CLASS = "//input[@name='servClass' and @value='First']";
	public static final String CONTINUE = "//input[@name='findFlights']";
}
