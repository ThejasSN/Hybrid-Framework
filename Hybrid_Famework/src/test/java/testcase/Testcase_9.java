package testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class Testcase_9 extends BaseTest{

	@Test
public static void open() throws InterruptedException, IOException {
		
		driver.manage().window().maximize();
	driver.findElement(By.xpath(loc.getProperty("cart"))).click();
	Thread.sleep(4000);

	System.out.println("Test cases is successfully verified");
	

	}
}