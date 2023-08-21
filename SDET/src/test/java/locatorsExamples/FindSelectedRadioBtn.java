package locatorsExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindSelectedRadioBtn {

	WebDriver driver;
	
	@BeforeClass
	  public void beforeClass() {
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
	  }

  @Test
  public void f() {
	  
	  driver.get("https://leafground.com/radio.xhtml");
	  
	  List<WebElement> radiobtn =   driver.findElements(By.xpath("//table[@id='j_idt87:console2']/tbody/tr/td/div/div/input"));
	  
	  //this xpath was made using the following tags as we could not find a unique identifier
	
	  for(WebElement radio : radiobtn) {
		  
		System.out.println(radio.isSelected());
	
		boolean status = radio.isSelected(); 
		
		if(status == true) {
			System.out.println("Safari is the default browser which is selected");
		}
		}
	 driver.quit();
}
  
}
