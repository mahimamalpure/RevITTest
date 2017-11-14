package com.revItAutomation.locators;

import org.openqa.selenium.By;

import com.revItAutomation.locatorvalues.HomeLocatorValues;

public interface HomeLocators 
{
	public static final By USERNAME = By.xpath(HomeLocatorValues.USERNAME);
	public static final By PASSWORD = By.xpath(HomeLocatorValues.PASSWORD_VAL);
	public static final By SUBMIT_BUTTON = By.xpath(HomeLocatorValues.SUBMIT_BUTTON);
}
