package com.sdet.junit;

import static org.testng.Assert.fail;

import org.testng.annotations.Test;

public class Amazonappln {
	
  @Test(groups = "smoke")
  public void reg() {  //non- prioritized method has a priority 0 by default
	  System.out.println("reg");
	  
  }
  
  @Test(groups = "regression")
  public void login() {
	  System.out.println("login");

  }
  
  @Test
  
  public void search() {
	  System.out.println("Search");

  }
  
  
}

/* this defines the syntax of priority and depends on method and groups
@Test(dependsOnMethods = "reg", priority = 1, groups = "smoke")
public void login() {
	    System.out.println("login");
	   }
*/
