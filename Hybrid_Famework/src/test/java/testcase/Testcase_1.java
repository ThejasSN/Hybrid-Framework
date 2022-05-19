package testcase;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import base.BaseTest;

public class Testcase_1 extends BaseTest{
	@Test
public static void open() throws InterruptedException, IOException {
		
		//signup page
		driver.manage().window().maximize();
	driver.findElement(By.xpath(loc.getProperty("Login_icon"))).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath(loc.getProperty("signup_option"))).click();
	Thread.sleep(4000);
	
	System.out.println("Test cases is successfully verified");

	}
	
  
}
