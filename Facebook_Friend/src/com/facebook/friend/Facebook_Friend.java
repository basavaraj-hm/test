package com.facebook.friend;
import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Facebook_Friend {

	private WebDriver web;
	@Before
	public void intial() throws Exception
	{
		web=new FirefoxDriver();
		web.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	@Test
	public void testRun() throws Exception
	{
		web.manage().window().maximize();
		web.get("https://www.facebook.com");
		web.findElement(By.xpath("//input[@name='email']")).sendKeys("xyzab1989@gmail.com");
		web.findElement(By.xpath("//input[@name='pass']")).sendKeys("m@nu1997");
		web.findElement(By.xpath("//input[@value='Log In']")).click();
		web.findElement(By.xpath("//div[@aria-owns='facebar_typeahead_view_list']")).sendKeys("Find all people named \"Tarun Nv\"");
		web.findElement(By.xpath("//a/span/span/span")).click();
		web.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div/div[2]/div/div/div[1]/div/div[1]/div/div[1]/div/div/div/div[3]/div[1]/div/button[1]")).click();
		web.findElement(By.xpath("//div[@id='userNavigationLabel']")).click();
		Thread.sleep(10000);
		web.findElement(By.xpath("//input[@value='Log Out']")).click();
		web.findElement(By.xpath("//input[@name='email']")).sendKeys("qwertymail1989@gmail.com");
		web.findElement(By.xpath("//input[@name='pass']")).sendKeys("m@nu1997");
		web.findElement(By.xpath("//input[@value='Log In']")).click();
		web.findElement(By.xpath("//div/ul/li[1]/div/div/div/ul/li[1]/div[1]/div/div/div/div[1]/div[2]/div[2]/div/form/div/button[1]")).click();
	}
}
