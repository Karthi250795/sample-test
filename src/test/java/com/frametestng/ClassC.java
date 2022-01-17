package com.frametestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassC{
	
	@Parameters({"Browser"})
	@Test
	private void fireFoxBrowser(String url) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		driver.get(url);
		
		

	}
	
	

}
