package com.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Library {
	
	
	static ExtentTest test;
	
	//common Generic method  1) Exception  Handle
	
	public static void custom_sendkys(WebElement element,String value,String fildname) {
		
		try {
		element.sendKeys(value);
		
		test.log(Status.PASS, fildname+" successfuly send =="+value );
		
		}catch(Exception e) {
			
			test.log(Status. FAIL, e.getMessage());
			
			//System.out.println(e.getMessage());
		}
		
	}
	
	public static void custom_click(WebElement element,String fildname) {
		
		try {
			
		element.click();
			
		test.log(Status.PASS, "clicked sucessfully=="+fildname);
			
		}catch(Exception e) {
			test.log(Status.FAIL,e.getMessage());
			
			//System.out.println(e.getMessage());
			
		}
		
	}
	// using DropDown case used common method
	
	public static void custom_HandleDropdown(WebElement element,String text) {
		
		try {
		Select select=new Select(element);
		
		select.selectByVisibleText(text);
		
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
		
	}
	
	//Using Mouse Handle over click
	
	public static void custom_HandelMouseOver_click(WebDriver driver,WebElement element) {
		try {
		Actions act=new Actions(driver);
		
		act.moveToElement(element).click().build().perform();
		
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
	}

}
