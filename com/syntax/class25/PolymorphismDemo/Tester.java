package com.syntax.class25.PolymorphismDemo;

public class Tester {
    public static void main(String[] args) {

        WebDriver[] webDrivers={new GoogleChrome(), new FireFox(), new Safari(), new IE()};
        for(WebDriver driver:webDrivers) {
            testOnAllBrowsers(driver);
        }
    }
   static void testOnAllBrowsers(WebDriver webDriver){
       webDriver.openBrowser();
       webDriver.loadWebSite("www.google.com");
       webDriver.Test1();
       webDriver.Test2();
       webDriver.TestFileDownload();
       webDriver.closeBrowser();
    }
}
