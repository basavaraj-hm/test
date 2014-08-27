package com.facebook.status;
import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Facebook_Status {

	private WebDriver webdriver;
	
	@Before
	public void intialize()
	{
		webdriver=new FirefoxDriver();
		webdriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	@Test
	public void testCase()
	{
		webdriver.manage().window().maximize();
		webdriver.get("https://www.facebook.com");
		webdriver.findElement(By.xpath("//input[@name='email']")).sendKeys("xyzab1989@gmail.com");
		webdriver.findElement(By.xpath("//input[@name='pass']")).sendKeys("m@nu1997");
		webdriver.findElement(By.xpath("//input[@value='Log In']")).click();
		webdriver.findElement(By.xpath("//a[@href='https://www.facebook.com/?ref=logo']")).click();
		webdriver.findElement(By.xpath("//textarea[@aria-haspopup='true']")).click();
		webdriver.findElement(By.xpath("//textarea[@aria-haspopup='true']")).sendKeys("i am hungry..!");
		webdriver.findElement(By.xpath("//div//ul//li/button")).click();
	}
}
