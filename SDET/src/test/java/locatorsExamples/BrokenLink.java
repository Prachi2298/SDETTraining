package locatorsExamples;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLink {
	
WebDriver driver;
	
	@BeforeClass
	  public void beforeClass() {
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
	  }

  @Test
  public void f() {
	  
	  driver.get("https://leafground.com/link.xhtml");
	  
	  driver.findElement(By.linkText("Broken?")).click();
	  
	  String expTitle ="Error 404 /lists.xhtml Not Found in ExternalContext as a Resource";
	  
	  String actTitle =driver.getTitle();
	   
	  Assert.assertEquals(expTitle , actTitle);
	    
	  //driver.quit();
  }
}
