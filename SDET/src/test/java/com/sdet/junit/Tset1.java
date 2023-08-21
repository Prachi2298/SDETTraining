package com.sdet.junit;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Tset1 {
	
	WebDriver driver;
	
  @BeforeClass
  public void beforeClass() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
  }
    
    @Test
    public void f() {
    	driver.get("https://www.leafground.com/");
    	
    	driver.findElement(By.id("email")).sendKeys("guptaprachi@gmail.com");
    	
    	driver.findElement(	By.name("message")).sendKeys("vgdgvdf");
    	
    	driver.findElement(By.cssSelector("button[class=\"ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only\"]")).click();
    	
    	
    	
    }


}
