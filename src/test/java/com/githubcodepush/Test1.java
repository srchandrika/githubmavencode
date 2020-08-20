package com.githubcodepush;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("This is before method of test1 class");
	}
	@AfterMethod
	public void afterMethod(){
		System.out.println("This is after method of test1 class");
	}
  @Test
  public void f() {
	  
	  System.out.println("This is test1 class");
  }
}
