package com.revItAutomation.actions;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.revItAutomation.getters.HomeGetters;

public class HomeActions 
{
	public static void login(WebDriver driver, Map<Object, Object> loginDataMap)
	{
		HomeGetters.getUserName(driver).sendKeys(loginDataMap.get("UserName").toString());
		HomeGetters.getPassword(driver).sendKeys(loginDataMap.get("Password").toString());
		HomeGetters.getSubmitButton(driver).click();
	}
}
