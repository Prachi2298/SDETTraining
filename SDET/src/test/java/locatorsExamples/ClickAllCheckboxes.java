package locatorsExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickAllCheckboxes {
	
	
WebDriver driver;
	
	@BeforeClass
	  public void beforeClass() {
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
	  }

  @Test
  public void f() {
	  
	  driver.get("https://leafground.com/checkbox.xhtml");
	  
	 List<WebElement> chbox=  driver.findElements(By.xpath("//*[@id=\"j_idt87:basic\"]/tbody/tr/td/div/div[2]")) ; 
	
	 //WebElement is the return type for storing the elements
	 
	 for(WebElement cbox : chbox) {
		 cbox.click();
	 }
	 
	 
	 driver.quit();

	
   }
 }
