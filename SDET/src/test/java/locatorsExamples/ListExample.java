package locatorsExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListExample {
  
WebDriver driver;
	
	@BeforeClass
	  public void beforeClass() {
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
	  }

  @Test
  public void f() {
	  
	  driver.get("https://leafground.com/select.xhtml");
	  
	  driver.findElement(By.xpath("//*[@id=\"j_idt87:country\"]/div[3]/span")).click();
  
	  driver.findElement(By.xpath("//ul[@id=\"j_idt87:country_items\"]/li[4]")).click();
	  

	  
}

}
