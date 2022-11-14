package com.Introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\browserdrivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://google.com"); // will wait until components are fully loaded.
	driver.navigate().to("https://rahulshettyacademy.com"); // wait until atleast one image file is loaded.
	driver.navigate().back();
	driver.navigate().forward();
}
}
