package org.qait.MakeMyTrip.MakeMyTrip1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Hotel {
	WebDriver driver;
	public Hotel(WebDriver driver) {
		this.driver = driver;	// TODO Auto-generated constructor stub
	}

public void clickOnHotelButton()
{
  driver.findElement(By.xpath(".//*[text()='hotels']")).click();
  try{
	  Thread.sleep(6000);
	  
  }catch(InterruptedException e){}

   driver.findElement(By.xpath(".//input[@value='Goa, India']")).click();
   try{
		  Thread.sleep(6000);
		  
	  }catch(InterruptedException e){}

   
   driver.findElement(By.xpath(".//span[contains(text(),'Hyderabad, India') and @class='autoCompleteItem__label']")).click();
   try{
		  Thread.sleep(6000);
		  
	  }catch(InterruptedException e){}

   
   driver.findElement(By.xpath(".//input[@id='hp-widget__chkIn']")).click();
   try{
		  Thread.sleep(6000);
		  
	  }catch(InterruptedException e){}


   driver.findElement(By.xpath(".//a[@class='ui-state-default'  and @href='#' and contains(text(),'19')")).click();
   try{
		  Thread.sleep(6000);
		  
	  }catch(InterruptedException e){}

   
   driver.findElement(By.xpath(".//input[@id='hp-widget__chkOut']")).click();
   try{
		  Thread.sleep(6000);
		  
	  }catch(InterruptedException e){}

   
   driver.findElement(By.xpath(".//a[@class='ui-state-default' and @href='#' and contains(text(),'23')")).click();
   try{
		  Thread.sleep(6000);
		  
	  }catch(InterruptedException e){}

   driver.findElement(By.xpath(".//input[@id='hp-widget__chkOut']")).click();
   try{
		  Thread.sleep(6000);
		  
	  }catch(InterruptedException e){}
   
   driver.findElement(By.xpath(".//li[@class='selected' and contains(text(),'4')]")).click();
   try{
		  Thread.sleep(6000);
		  
	  }catch(InterruptedException e){}
   

   driver.findElement(By.xpath(".//*[text()='Search']")).click();
   try{
		  Thread.sleep(6000);
		  
	  }catch(InterruptedException e){}

}

}