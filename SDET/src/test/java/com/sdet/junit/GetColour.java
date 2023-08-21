package com.sdet.junit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetColour {
	
WebDriver driver;
	
	@BeforeClass
	  public void beforeClass() {
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
	  }

  @Test
  public void f() {
	  
	  driver.get("https://leafground.com/button.xhtml");
	  
	String ColorValue =   driver.findElement(By.id("j_idt88:j_idt96")).getCssValue("color");

	System.out.println(ColorValue);
	
	String HexValue = Color.fromString(ColorValue).asHex();
	
	System.out.println(HexValue);
	
	
	driver.quit();
	
	
   }
}