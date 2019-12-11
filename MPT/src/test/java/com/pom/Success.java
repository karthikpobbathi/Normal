package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Success {
	
	WebDriver driver;

	public Success(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "/html/body/h1")
	WebElement message;

	public WebElement getMessage() {
		return message;
	}
	
	
	
}
