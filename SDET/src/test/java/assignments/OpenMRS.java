package assignments;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class OpenMRS{
	
	WebDriver driver;
  
  @BeforeClass
  public void beforeClass() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
  }
  
  @Test
  public void f() {
	  
	  driver.get("https://demo.openmrs.org/openmrs/login.htm");
	  
	  driver.findElement(By.id("username")).sendKeys("Admin");
	  
	  driver.findElement(By.id("password")).sendKeys("Admin123");
	  
	  driver.findElement(By.id("Inpatient Ward")).click();
	  
	  driver.findElement(By.id("loginButton")).click();
	  
	 driver.findElement(By.xpath("//*[@id=\"referenceapplication-registrationapp-registerPatient-home"
	    + "pageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension\"]")).click();
	 
	 driver.findElement(By.name("givenName")).sendKeys("Prachi");
	 
	 driver.findElement(By.name("familyName")).sendKeys("Gupta");
	 
	 driver.findElement(By.id("next-button")).click();
	 
	 
	 
	  
  }

}
