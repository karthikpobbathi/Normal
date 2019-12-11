package com.pom;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Home {

	
	WebDriver driver;

	public Home(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Home")
	WebElement home;

	@FindBy(linkText = "Register")
	WebElement register;
	
	@FindBy(linkText = "Contact Us")
	WebElement contact;
	
	@FindBy(className = "primary-content")
	WebElement heading;
	public List<WebElement> getHeader() {
		return header;
	}

	@FindBys({@FindBy(xpath="/html/body/div/header/ul/li[1]/a"),
			@FindBy(xpath="/html/body/div/header/ul/li[2]/a"),
			@FindBy(xpath="/html/body/div/header/ul/li[3]/a")})
	List<WebElement> header;
	public WebElement getHome() {
		return home;
	}

	public WebElement getRegister() {
		return register;
	}

	public WebElement getContact() {
		return contact;
	}

	public WebElement getHeading() {
		return heading;
	}
	
	
}
