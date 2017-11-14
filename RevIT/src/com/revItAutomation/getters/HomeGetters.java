package com.revItAutomation.getters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.revItAutomation.locators.HomeLocators;

public class HomeGetters 
{
	public static WebElement getUserName(WebDriver driver)
	{
		return driver.findElement(HomeLocators.USERNAME);
	}
	
	public static WebElement getPassword(WebDriver driver)
	{
		return driver.findElement(HomeLocators.PASSWORD);
	}
	
	public static WebElement getSubmitButton(WebDriver driver)
	{
		return driver.findElement(HomeLocators.SUBMIT_BUTTON);
	}
}
