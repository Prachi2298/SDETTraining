package com.sdet.junit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazonapp1 {
  @Test
 public void edge() {
	  WebDriverManager.edgedriver().setup();
	  
	  
	  WebDriver driver;
	  
	  driver = new EdgeDriver();
	  
  }
  
  @Test
  public void chrome() {
	  
	  WebDriverManager.chromedriver().setup();
	  
	  WebDriver driver ;
	  driver = new ChromeDriver();
	  
  }
}
