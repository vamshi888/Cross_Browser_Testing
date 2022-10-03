package com.qa.bridzelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserScript {
WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void browserSetup(String browserName) throws InterruptedException {
		if(browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\hp\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver(); 
		}
		driver.manage().window().maximize();
		driver.get("https://www.bookswagon.com/login");
		driver.findElement(By.xpath("//input[@id='ctl00_phBody_SignIn_txtEmail']")).sendKeys("8722004447");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='ctl00_phBody_SignIn_txtPassword']")).sendKeys("Vamshi@1234");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='ctl00_phBody_SignIn_btnLogin']")).click();
		Thread.sleep(3000);

	}



}
