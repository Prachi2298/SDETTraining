package com.sdet.junit;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorTest1 {
	
	Calculator cal = new Calculator();

  @Test (dataProvider="dpAdd")
  public void add1Test(int expValue, int a, int b) {
   Assert.assertEquals(expValue, cal.add1(a, b));  
   }

  @Test(groups = "smoke")
  public void sub1Test() {
	   Assert.assertEquals(0, cal.sub1(5, 5));  
  }
  
  @DataProvider(name="dpAdd")
  public Object[][] getdata(){
	  Object[][] t1 = new Object[][] {
		  
		  {10,5,5},
		  {20,10,10},
		  {15,8,9},
		  {16,8,8},
		  {30,17,9},
		  {29,8,10},
		  {10,8,2}
	  };
	  return t1;
	  }
	 
}

