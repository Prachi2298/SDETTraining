package locatorsExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetSize {
	
	
WebDriver driver;
	
	@BeforeClass
	  public void beforeClass() {
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
	  }

  @Test
  public void f() {
	  
	  driver.get("https://leafground.com/button.xhtml");
	  
	Dimension getSize =   driver.findElement(By.id("j_idt88:j_idt98")).getSize();

	
	System.out.println(getSize.getHeight() + " - Height" + ", " + getSize.getWidth() + " - Width");
	
	
	driver.quit();
	
	
   }
  
}
