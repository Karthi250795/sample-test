package com.frametestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassA {
	
	@Parameters({"Browser"})
	@Test
	private void chromeLaunch(String url) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		
<<<<<<< HEAD
System.out.println("perf operation");
=======
		System.out.println("Dev operation");
		
		

>>>>>>> f02dfd906fe958d9a99d54a7c4ef5f31522dc9f9
	}

}
