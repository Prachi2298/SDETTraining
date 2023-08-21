package locatorsExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RetrieveText {
  
	
	WebDriver driver;
	 
	 @BeforeClass
	  public void beforeClass() {
		  WebDriverManager.chromedriver().setup();
		   
		 driver = new ChromeDriver();
	  }

	 
@Test
public void f() {
	  
	 driver.get("https://leafground.com/input.xhtml;jsessionid=node0v90gfjkb3zju1ezcu5zv0ymyb400852.node0");

     String Text = driver.findElement(By.id("j_idt88:j_idt97")).getAttribute("value");
     
     System.out.println(Text);
     
     driver.quit();

}

}