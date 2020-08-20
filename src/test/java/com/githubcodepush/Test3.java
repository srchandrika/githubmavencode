package com.githubcodepush;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test3 {
	WebDriver driver;
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("This is before method of test3 class");
		System.setProperty("webdriver.chrome.driver","src\\test\\java\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@AfterMethod
	public void afterMethod(){
		System.out.println("This is after method of test3 class");
		driver.close();
	}
  @Test
  public void test3() {
	  System.out.println("This is test3 class");
	  driver.get("http://demowebshop.tricentis.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.MILLISECONDS);
	  driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	  driver.findElement(By.linkText("Register"));
  }

}
