package com.Introduction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class Locators2 
{
public static void main(String[] args) throws InterruptedException {

	String name = "rahul";
	System.setProperty("webdriver.chrome.driver","C:\\browserdrivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

String password = getpassword(driver);
//driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.get("https://rahulshettyacademy.com/locatorspractice/");
driver.findElement(By.id("inputUsername")).sendKeys(name);
driver.findElement(By.name("inputPassword")).sendKeys(password);
driver.findElement(By.className("signInBtn")).click();
// sleep so that you can navigate to other home page
Thread.sleep(2000);
System.out.println(driver.findElement(By.tagName("p")).getText());
Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+name+",");
driver.findElement(By.xpath("//*[text()='Log Out']")).click();
//Thread.sleep(2000);
//driver.findElement(By.xpath("//button[@class='logout-btn']")).click();
//driver.close();
}

public static String getpassword(WebDriver driver) throws InterruptedException
{
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.findElement(By.linkText("Forgot your password?")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
	String passwordText = driver.findElement(By.cssSelector("form p")).getText();
	String[] password1 = passwordText.split("'");
	//String[] password2 = password1[1].split("'");
	String password2 = password1[1].split("'")[0];
	return password2;
}
}
