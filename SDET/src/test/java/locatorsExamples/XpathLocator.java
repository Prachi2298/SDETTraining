package locatorsExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathLocator {

	WebDriver driver;
	 
	 @BeforeClass
	  public void beforeClass() {
		  WebDriverManager.chromedriver().setup();
		   
		 driver = new ChromeDriver();
	  }

	 
@Test
public void f() {
	  
	  driver.get("https://leafground.com/input.xhtml;jsessionid=node0v90gfjkb3zju1ezcu5zv0ymyb400852.node0");
	  
	 boolean txtBoxEnabled =  driver.findElement(By.xpath("//input[@id=\"j_idt88:j_idt93\"]")).isEnabled(); 
	 
	 //here we used relative xpath
			  
	 if(txtBoxEnabled==true) {
		 System.out.println("Text box is enabled");
	 }
	 else
	 {
		 System.out.println("Text box is disabled");
	 }
			
	 /* another way of checking the textbox is enable or not 
	  * 
	  * String txtBoxEnabled =  driver.findElement(By.xpath("//input[@id=\"j_idt88:j_idt93\"]")).getAttribute("disabled"); 
	  *  System.out.println(txtBoxEnabled);
	  *  
	  */
}

}
