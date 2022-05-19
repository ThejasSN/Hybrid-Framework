package testcase;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import base.BaseTest;

public class Testcase_3 extends BaseTest{
	@Test
public static void open() throws InterruptedException, IOException {
		//product search
		driver.manage().window().maximize();
	driver.findElement(By.xpath(loc.getProperty("search_box"))).sendKeys("Bed");
	Thread.sleep(4000);
	driver.findElement(By.xpath(loc.getProperty("search_button"))).click();;
	Thread.sleep(4000);

	System.out.println("Test cases is successfully verified");
	

	}
	
  
}
