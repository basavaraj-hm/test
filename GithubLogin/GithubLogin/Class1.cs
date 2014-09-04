using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using NUnit.Framework;
using OpenQA.Selenium;
using OpenQA.Selenium.Firefox;
namespace GithubLogin
{
    public class Class1
    {
        private IWebDriver webdriver;

        [SetUp]
        public void setUp()
        {
            webdriver = new FirefoxDriver();
        }

        [Test]
        public void testCase()
        {
            webdriver.Manage().Window.Maximize();
            webdriver.Navigate().GoToUrl("http://www.github.com");
            webdriver.FindElement(By.XPath("//div/div/div//div/a[2]")).Click();
            webdriver.FindElement(By.XPath("//form/div[3]/input[1]")).SendKeys("xyzab1989");
            webdriver.FindElement(By.XPath("//form/div[3]/input[2]")).SendKeys("m@nu1997");
            webdriver.FindElement(By.XPath("//form/div[3]/input[3]")).Click();
            webdriver.FindElement(By.XPath("//div/div[2]/div/div/div/a")).Click();
            webdriver.FindElement(By.XPath("//ul/li/a//span[@class='css-truncate']/span")).Click();
            webdriver.FindElement(By.XPath("//ul/li/a//span/span[@class='repo']")).Click();
            webdriver.FindElement(By.XPath("//div/div[1]/span[@title='master']")).Click();
            webdriver.FindElement(By.XPath("//div/div[1]/div[1]/div[2]/div/input")).SendKeys("github");
            webdriver.FindElement(By.XPath("//form/div[2]")).Click();
        }


    }
}
