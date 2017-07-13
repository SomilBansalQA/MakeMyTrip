package org.qait.MakeMyTrip.MakeMyTrip1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MakeMyTripLogin extends ExcelFile {
	WebDriver driver;

	By login = By.xpath(".//*[text()='log-in']");
	By loginButton= By.xpath(".//button[@onclick='MMT_HEADER.submitLogin();']");
	By mmtUserName = By.xpath(".//input[@id='ch_login_email']");
	By mmtPassword = By.xpath(".//input[@id='ch_login_password']");
    
	public MakeMyTripLogin(WebDriver driver) {
		this.driver = driver;
	}
	// Set user name in textbox

	public void setUserName() {

		driver.findElement(mmtUserName).sendKeys(this.getUserName());

	}

	// Set password in password textbox
	public void setPassword() {
		driver.findElement(mmtPassword).sendKeys(this.getPassword());
	}

	// Click on login button
	public void clickLogin() {
		driver.findElement(login).click();
	}

	public void clickOLoginButton() {
		driver.findElement(loginButton).click();
	}


	  
	public void loginToMMT() {

		// Click Login button

		this.clickLogin();

		// Fill user name
		this.setUserName();

		// Fill password

		this.setPassword();
		
		this.clickOLoginButton();

	}

}
