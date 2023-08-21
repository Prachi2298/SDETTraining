package locatorsExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownExample {
	
WebDriver driver;
	
	@BeforeClass
	  public void beforeClass() {
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
	  }

  @Test
  public void f() {
	  
	  driver.get("https://leafground.com/select.xhtml");
	  
	  Select dropdown = new Select(driver.findElement(By.xpath("//*[@id='j_idt87']/div/div[1]/div[1]/div/div/select")));
  
	  dropdown.selectByVisibleText("Selenium");
	  
	 // dropdown.deselectByVisibleText("Selenium");
	  
	 //dropdown.selectByIndex(3);
	  
	  //dropdown.selectby
	  
	 // Select dropdown1 = new Select(driver.findElement(By.id("j_idt87:country_input")));
	  
	 // dropdown1.selectByValue("Germany");
	
}
}

