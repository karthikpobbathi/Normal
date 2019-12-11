package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Contact {

	WebDriver driver;

	public Contact(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	
}
