using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using OpenQA.Selenium;
using OpenQA.Selenium.Firefox;
using NUnit.Framework;

namespace SeleniumWeb
{
    [TestFixture]
    public class Class1
    {
        private IWebDriver driver;
        [SetUp]
        public void setUp()
        {
             driver = new FirefoxDriver();
        }

        [Test]
        public void unitTest()
        {
            driver.Manage().Window.Maximize();
            driver.Navigate().GoToUrl("http://www.google.com");
            driver.FindElement(By.XPath("//div/div/input[@spellcheck='false']")).SendKeys("difference between nunit and junit");
            driver.FindElement(By.XPath("//div/div/input[@spellcheck='false']")).SendKeys(Keys.Enter);
            driver.FindElement(By.XPath("//div/ol/div[2]/li[2]/div/h3/a")).Click();
            System.Threading.Thread.Sleep(10000);
            
        }

        [TearDown]
        public void testClose()
        {
            driver.Quit();
        }
    }
}
