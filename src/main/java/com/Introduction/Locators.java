package com.Introduction;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Implicit wait - 5 seconds time out.
		System.setProperty("webdriver.chrome.driver","C:\\browserdrivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
//driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.get("https://rahulshettyacademy.com/locatorspractice/");
driver.findElement(By.id("inputUsername")).sendKeys("rahul");
driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacadem");
driver.findElement(By.className("signInBtn")).click();

System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
driver.findElement(By.linkText("Forgot your password?")).click();
driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("xyz@gmail.com");
driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("xyzx@gmail.com");
driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("9876543212");
driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();

System.out.println(driver.findElement(By.cssSelector("form p")).getText());

driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
Thread.sleep(1000);
//driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("rahul");
driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("rahulshettyacademy");
driver.findElement(By.id("chkboxOne")).click();
driver.findElement(By.name("chkboxTwo")).click();
driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
