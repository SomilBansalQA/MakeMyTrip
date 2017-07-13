package org.qait.MakeMyTrip.MakeMyTrip1;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestMakeMyTripLogin {
	
	
	WebDriver driver;

    MakeMyTripLogin objLogin;
	Hotel objHotel;
	
    @BeforeTest
    public void setup(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.makemytrip.com/");

    }
	
    @Test(priority=0)

    public void test_LoginToMMT() {

        objLogin = new  MakeMyTripLogin(driver);
        objLogin.loginToMMT();
        
        try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        assertEquals(driver.findElement(By.xpath(".//*[text()='Hey ']")).getText(), "HEY");

    }
    
    @Test(priority=1)
    public void testsa() {

        objHotel = new  Hotel(driver);
       objHotel.clickOnHotelButton(); 
        try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        assertEquals(driver.findElement(By.xpath(".//*[text()='Hey ']")).getText(), "HEY");

    }
    
	
 }
