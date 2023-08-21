package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon1 {
	
	WebDriver driver;
	
	@BeforeClass
	  public void beforeClass() {
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
	  }

  @Test
  public void f() {
	  
	  driver.get("https://www.amazon.in/ap/register?showRememberMe"
	  		+ "=true&openid.pape.max_auth_age=0&openid.identity=http%3A%2F%2Fspecs."
	  		+ "openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&mobile"
	  		+ "BrowserWeblabTreatment=C&openid.return_to=https%3A%2F%2Fwww.amazon."
	  		+ "in%2F%3Fie%3DUTF8%26ext_vrnc%3Dhi%26tag%3Dgooginprimeexpt5-21%26ascsubta"
	  		+ "g%3D_k_CjwKCAjw2K6lBhBXEiwA5RjtCc2hbWPVaRjuLTMetNdaY1S4HjUP2K"
	  		+ "wvmzqXgvF2vaJv4kmNYSJYPRoCN04QAvD_BwE_k_%26gclid%3DCjwKCAjw2K6lBh"
	  		+ "BXEiwA5RjtCc2hbWPVaRjuLTMetNdaY1S4HjUP2KwvmzqXgvF2vaJv4kmNYSJYPRoCN04"
	  		+ "QAvD_BwE%26ref_%3Dnav_ya_signin&prevRID=BBCRHH8E80SYATG1MDEA&openid.assoc"
	  		+ "_handle=inflex&openid.mode=checkid_setup&desktopBrowserWeblabTreatment=C&prepo"
	  		+ "pulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	  
	  
	  driver.findElement(By.linkText("Conditions of Use")).click();
	  
	  driver.navigate().back();
	  
	  driver.findElement(By.partialLinkText("Privacy Policy")).click();
	  
	  driver.navigate().back();
	  
	  driver.findElement(By.id("ap_customer_name")).sendKeys("Prachi Gupta");
	  
	  driver.findElement(By.name("email")).sendKeys("8168685188");
	  
	  driver.findElement(By.xpath("//input[@id=\"ap_email\"]")).sendKeys("prachigupta@gmail.com");
	  
	  driver.findElement(By.cssSelector("input[class=\"a-input-text a-span12 auth-required-field auth-require-fields-match auth-require-password-validation\"]")).sendKeys("Prachi2345@");
	  
	  driver.findElement(By.id("continue")).click();
	  
	  driver.quit();
	  
  }
}
