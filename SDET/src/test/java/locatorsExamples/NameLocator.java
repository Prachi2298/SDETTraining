package locatorsExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NameLocator {
	
	WebDriver driver;
	 
	 @BeforeClass
	  public void beforeClass() {
		  WebDriverManager.chromedriver().setup();
		  
		 driver = new ChromeDriver();
	  }

	 
 @Test
 public void f() {
	  
	  driver.get("https://leafground.com/");
	  
	  driver.findElement(By.name("message")).sendKeys("I am a fresher");
	  
	  
 }
}
