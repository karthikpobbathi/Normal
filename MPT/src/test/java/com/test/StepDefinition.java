package com.test;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pom.Contact;
import com.pom.Home;
import com.pom.Register;
import com.pom.Success;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

	WebDriver driver;
	Home home;
	Contact contact;
	Register register;
	Success success;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		home = new Home(driver);
		contact = new Contact(driver);
		register = new Register(driver);
		success = new Success(driver);
	}

	@Given("^home page$")
	public void home_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.get("C:\\Users\\ASUS\\Desktop\\webpages\\Home.html");
	}

	@Then("^Title should be Home Page$")
	public void title_should_be_Home_Page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		assertEquals("Home Page", driver.getTitle());
	}

	@When("^contact us link is clicked$")
	public void contact_us_link_is_clicked() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		home.getContact().click();

	}

	@Then("^Title should be 'Contact Us'$")
	public void title_should_be_Contact_Us() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		assertEquals("Contact Us", contact.getTitle());

	}

	@When("^Home link is clicked$")
	public void home_link_is_clicked() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.navigate().back();
	}

	@Then("^Header should contain links$")
	public void header_should_contain_links() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		/*
		 * assertEquals("Contact Us", home.getHeader().get(0).getText());
		 * assertEquals("Register", home.getHeader().get(1).getText());
		 * assertEquals("Home", home.getHeader().get(2).getText());
		 */

	}

	@When("^Register link is clicked$")
	public void register_link_is_clicked() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		home.getRegister().click();
	}

	@Then("^Title should be Employee Registration Page$")
	public void title_should_be_Employee_Registration_Page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		assertEquals("Employee Registration Page", driver.getTitle());

	}

	@When("^Submit button is clicked without entering in any fields$")
	public void submit_button_is_clicked_without_entering_in_any_fields() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		register.getSubmit().click();

	}

	@Then("^alert message should be displayed as 'Please fill in the 'Your Employee Name' box\\.'$")
	public void alert_message_should_be_displayed_as_Please_fill_in_the_Your_Employee_Name_box() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Alert alert = driver.switchTo().alert();
		assertEquals("Please fill in the 'Your Employee Name' box.", alert.getText());
		alert.accept();
	}

	@When("^Submit button is clicked without entering in Employee Number field$")
	public void submit_button_is_clicked_without_entering_in_Employee_Number_field() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		register.getEmployeeName().sendKeys("karthik");
		register.getSubmit().click();
	}

	@Then("^alert message should be displayed as 'Enter Employee Number' box\\.'$")
	public void alert_message_should_be_displayed_as_Enter_Employee_Number_box() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Alert alert = driver.switchTo().alert();
		assertEquals("Enter Employee Number", alert.getText());
		alert.accept();
	}

	@When("^Submit button is clicked with entering in Employee Number field without entering in Employee name field$")
	public void submit_button_is_clicked_with_entering_in_Employee_Number_field_without_entering_in_Employee_name_field()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		register.getEmployeeName().clear();
		register.getEmployeeNumber().sendKeys("9999999");
		register.getSubmit().click();
	}

	@When("^Any character is given in Employee number field$")
	public void any_character_is_given_in_Employee_number_field() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		register.getEmployeeName().sendKeys("karthik");
		register.getEmployeeNumber().sendKeys("f");
	}

	@Then("^it has to 'Enter Number'$")
	public void it_has_to_Enter_Number() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Alert alert = driver.switchTo().alert();
		assertEquals("Enter Number", alert.getText());
		alert.accept();
	}

	@When("^Submit button is clicked without entering in Job location field$")
	public void submit_button_is_clicked_without_entering_in_Job_location_field() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		register.getEmployeeNumber().sendKeys("9999999");
		register.getSubmit().click();
	}

	@Then("^alert message should be displayed as 'Select your Job Location'$")
	public void alert_message_should_be_displayed_as_Select_your_Job_Location() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Alert alert = driver.switchTo().alert();
		assertEquals("Select your Job Location", alert.getText());
		alert.accept();
	}

	@When("^Submit button is clicked without entering in Email field$")
	public void submit_button_is_clicked_without_entering_in_Email_field() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		register.getJobLocation().click();
		register.getSubmit().click();
	}

	@Then("^alert message should be displayed as 'You have entered an invalid email address!'$")
	public void alert_message_should_be_displayed_as_You_have_entered_an_invalid_email_address() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Alert alert = driver.switchTo().alert();
		assertEquals("You have entered an invalid email address!", alert.getText());
		alert.accept();
	}

	@When("^Submit button is clicked with entering a invalid Email in email field$")
	public void submit_button_is_clicked_with_entering_a_invalid_Email_in_email_field() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		register.getEmail().sendKeys("karthik");
		register.getSubmit().click();
	}

	@When("^Submit button is clicked after giving all the data in the form$")
	public void submit_button_is_clicked_after_giving_all_the_data_in_the_form() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		register.getEmail().sendKeys("karthik@gmail.com");
		register.getSubmit().click();
	}

	@Then("^it has to navigate to Success page it has to show 'Registered Successfully!'$")
	public void it_has_to_navigate_to_Success_page_it_has_to_show_Registered_Successfully() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		assertEquals("Registered Successfully!", success.getMessage().getText());

	}
}
