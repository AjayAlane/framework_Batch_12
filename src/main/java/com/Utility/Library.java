package com.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Library {
      
	static ExtentTest test;
	
	
	public static void custom_SendKeys(WebElement element,String value,String fieldname) {
		try {
		      element.sendKeys(value);
		      test.log(Status.PASS,fieldname +"Value Succesfully Send=="+value);
		}catch(Exception e) {
			test.log(Status.FAIL, e.getMessage());
		
		}
	}
	public static void custom_click(WebElement element,String fieldname) {
		
		try {
			element.click();
			test.log(Status.PASS, "Clicked Succesfully=="+fieldname);
		}catch(Exception e) {
			test.log(Status.FAIL, e.getMessage());
		}
	}
	
	public static void custom_HandleDropDown(WebElement element,String text) {
		try {
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static void custom_HandleMouseHover_click(WebDriver driver,WebElement element) {
		try {
		Actions act=new Actions(driver);
		act.moveToElement(element).click().build().perform();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
