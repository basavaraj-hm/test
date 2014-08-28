package com.facebook.message;
import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
public class Facebook_Message {
	private WebDriver web;
	
	@Before
	public void intialMessage() throws Exception
	{
		web=new FirefoxDriver();
		web.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	@Test
	public void testMessage() throws Exception
	{
		web.manage().window().maximize();
		web.get("https://www.facebook.com");
		web.findElement(By.xpath("//table/tbody/tr[2]/td[1]/input")).sendKeys("qwertymail1989@gmail.com");
		web.findElement(By.xpath("//table/tbody/tr[2]/td[2]/input")).sendKeys("m@nu1997");
		web.findElement(By.xpath("//table/tbody/tr[2]/td[3]/label/input")).click();
        web.findElement(By.xpath("//ul/li[3]/div//a/div[2]/span[@ data-reactid='.0.$pinnedNav.1.$217974574879787.0.$link.2.0']")).click();
        web.findElement(By.xpath("//button[@class='_42ft _4jy0 _3mv _4jy3 _517h']")).click();
        web.findElement(By.xpath("//tbody/tr/td[2]/div/div/div/div/input")).sendKeys("Sanvi ab");
        web.findElement(By.xpath("//tbody/tr/td[2]/div/div/div/div/input")).sendKeys(Keys.ENTER);
        web.findElement(By.xpath("//div/div[2]/textarea")).sendKeys("what's up?");
        web.findElement(By.xpath("//div[@class='_1r-']//label/input")).click();
		
	}

}
