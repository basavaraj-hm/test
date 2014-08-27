package com.username.password;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class User_name {

	WebDriver web;
	@Before
	public void intial() throws Exception
	{
	web=new FirefoxDriver();
	web.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	@Test
	public void testCase() throws Exception
	{
		web.get("https://gmail.com");
		web.manage().window().maximize();
		web.findElement(By.xpath("//input[@id='Email']")).sendKeys("xyzab1989");
		web.findElement(By.xpath("//input[@id='Passwd']")).sendKeys("m@nu1997");
		web.findElement(By.xpath("//input[@id='signIn']")).click();
		web.findElement(By.xpath("//a[@href='https://mail.google.com/mail/u/0/#inbox']")).click();
		web.findElement(By.xpath("//div/table/tbody/tr/td[4]/div[2]")).click();
		web.findElement(By.xpath("//div[@aria-expanded='false']/img")).click();
		web.findElement(By.xpath("//div[@act='25']/img")).click();
		web.findElement(By.xpath("//textarea[@aria-label='To']")).sendKeys("qwertymail1989@gmail.com");
		web.findElement(By.xpath("//div[@class='T-I J-J5-Ji aoO T-I-atl L3']")).click();
		Thread.sleep(10000);
		web.findElement(By.xpath("//div[@id='gb']/div/div/div/div[3]/div/a/span")).click();
		web.findElement(By.xpath("//a[contains(@href, '?logout&hl=en&hlor')]")).click();
		Thread.sleep(5000);
	    web.navigate().to("https://accounts.google.com/AccountChooser?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&hl=en&service=mail&scc=1"	);
		web.findElement(By.xpath("//a[@id='account-chooser-add-account']")).click();
		web.findElement(By.xpath("//input[@id='Email']")).sendKeys("qwertymail1989");
		web.findElement(By.xpath("//input[@id='Passwd']")).sendKeys("m@nu1997");
		web.findElement(By.xpath("//input[@id='signIn']")).click();
		 int count=0;
		 int i=0;
			while(i++!=3)
			{
				try
				{
					web.findElement(By.xpath("//tbody/tr/td/div/span[@email='xyzab1989@gmail.com']"));
				}
				catch(Exception ee){
					count+=1;
					Thread.sleep(5000);
					web.navigate().refresh();
					if(count==3)
					{
						web.findElement(By.xpath("//div[@id='gb']/div/div/div/div[3]/div/a/span")).click();
						web.findElement(By.xpath("//a[contains(@href, '?logout&hl=en&hlor')]")).click();
						break;
					}
					}
	
			} 

		
		}
}
