package com.sdet.junit;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class GetLocation {
	
	WebDriver driver;
	
	@BeforeClass
	  public void beforeClass() {
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
	  }

  @Test
  public void f() {
	  
	  driver.get("https://leafground.com/button.xhtml");
	  
	  Point LocationValue = driver.findElement(By.name("j_idt88:j_idt94")).getLocation();
	  
	 System.out.println( LocationValue.getX());
	  
	 System.out.println(LocationValue.getY());
	 
	 driver.quit();
  }
  
}
