package com.example.onebrowser;

import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
public class One_browser {

	WebDriver webdriver;
	
	@Before
	public void intial() throws Exception
	{
		webdriver=new FirefoxDriver();
		webdriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	@Test
	public void test_case() throws Exception
	{
		webdriver.get("https://www.gmail.com");
		webdriver.manage().window().maximize();
		webdriver.findElement(By.xpath("//input[@id='Email']")).sendKeys("xyzab1989");
		webdriver.findElement(By.xpath("//input[@id='Passwd']")).sendKeys("m@nu1997");
		webdriver.findElement(By.xpath("//input[@id='signIn']")).click();
		webdriver.findElement(By.xpath("//div[@class='aic']/div/div")).click();
		webdriver.findElement(By.xpath("//textarea[@aria-label='To']")).sendKeys("qwertymail1989@gmail.com");
		webdriver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("hi");
		webdriver.switchTo().frame(webdriver.findElement(
				   By.xpath("//iframe[contains(@tabindex,'1') and contains(@frameborder,'0')]"))); 
		webdriver.findElement(By.xpath("//body[@role='textbox']")).sendKeys("hi this is body text message");    
		webdriver.switchTo().defaultContent();        		
		webdriver.findElement(By.xpath("//img[@data-tooltip='Save & Close']")).click();
		try
		{
		webdriver.findElement(By.xpath("//a[@href='https://mail.google.com/mail/u/0/#drafts']")).click();
		}
		catch(NoSuchElementException ee)
		{
			webdriver.navigate().refresh();
		}
		
		Thread.sleep(2000);
		webdriver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div[2]/div[1]/div[1]/div/div/div[5]/div[1]/div/table/tbody/tr/td[6]/div/div/div/span[2]")).click();
		webdriver.findElement(By.xpath("//div[@class='T-I J-J5-Ji aoO T-I-atl L3']")).click();
		Thread.sleep(5000);
		 webdriver.findElement(By.xpath("//div[@id='gb']/div/div/div/div[3]/div/a/span")).click();
		webdriver.findElement(By.xpath("//a[contains(@href, '?logout&hl=en&hlor')]")).click();
			Thread.sleep(10000);
			webdriver.navigate().to("https://accounts.google.com/AccountChooser?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&hl=en&service=mail&scc=1"	);
			webdriver.findElement(By.xpath("//a[@id='account-chooser-add-account']")).click();
		 webdriver.findElement(By.xpath("//input[@id='Email']")).sendKeys("qwertymail1989");
		 webdriver.findElement(By.xpath("//input[@id='Passwd']")).sendKeys("m@nu1997");
		 webdriver.findElement(By.xpath("//input[@id='signIn']")).click();
		 int count=0;
		 int i=0;
			while(i!=3)
			{
				try
				{
					webdriver.findElement(By.xpath("//tbody/tr/td/div/span[@email='xyzab1989@gmail.com']"));
					i+=1;
				}
				catch(Exception ee){
					count+=1;
					Thread.sleep(5000);
					webdriver.navigate().refresh();
					if(count==3)
					{
						webdriver.findElement(By.xpath("//div[@id='gb']/div/div/div/div[3]/div/a/span")).click();
						webdriver.findElement(By.xpath("//a[contains(@href, '?logout&hl=en&hlor')]")).click();
						break;
					}
					}
	
			} 
	 }
	
}
