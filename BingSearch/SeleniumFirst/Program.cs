using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using OpenQA.Selenium;
using OpenQA.Selenium.Firefox;

namespace BingSearch
{
    class Program
    {
        static void Main(string[] args)
        {
            try
            {

                IWebDriver driver = new FirefoxDriver();
                driver.Manage().Window.Maximize();
                driver.Navigate().GoToUrl("http://www.bing.com");
                driver.FindElement(By.XPath("//form/div/input")).SendKeys("windows 8.1");
                driver.FindElement(By.XPath("//form/div/input")).SendKeys(Keys.Enter);
                driver.FindElement(By.XPath("//div/nav/ul/li[2]/a")).Click();
                driver.FindElement(By.XPath("//form//div/input[1]")).Clear();
                driver.FindElement(By.XPath("//form//div/input[1]")).SendKeys("windows xp");
                driver.FindElement(By.XPath("//form//div/input[2]")).Click();
                driver.FindElement(By.XPath("//header/nav/ul/li[1]/a")).Click();
                driver.FindElement(By.XPath("//form//div/input[1]")).Clear();
                driver.FindElement(By.XPath("//form//div/input[1]")).SendKeys("gmail");
                driver.FindElement(By.XPath("//form//div/input[1]")).SendKeys(Keys.Enter);
                driver.FindElement(By.XPath("//ol/li[2]/h2/a")).Click();
                driver.FindElement(By.XPath("//form/input[13]")).SendKeys("xyzab1989");
                driver.FindElement(By.XPath("//form/input[14]")).SendKeys("m@nu1997");
                driver.FindElement(By.XPath("//form/input[15]")).Click();

            }
            catch (Exception ee)
            {
               
            }
           
        }
    }
}
