package com.syntax.class25.PolymorphismDemo;

public class WebDriver {

    void openBrowser(){
        System.out.println("Opening browser");
    }
    void loadWebSite(String website){
        System.out.println("Load the website inside the browser");
    }
    void Test1(){
        System.out.println("Enter login info and check if you can login");
    }
    void Test2(){
        System.out.println("Click on BUY button and make sure you can place an order");
    }
    void TestFileDownload(){
        System.out.println("Testing file download");
    }
    void closeBrowser(){
        System.out.println("Close browser");
    }
}
class GoogleChrome extends WebDriver{
    void openBrowser(){
        System.out.println("Opening browser in Google Chrome");
    }
    void loadWebSite(String website){
        System.out.println("Load the website inside the browser Google Chrome");
    }
    void Test1(){
        System.out.println("Enter login info and check if you can login in Google Chrome");
    }
    void Test2(){
        System.out.println("Click on BUY button and make sure you can place an order in Google Chrome");
    }
    void TestFileDownload(){
        System.out.println("Testing file download in Google Chrome");
    }
    void closeBrowser(){
        System.out.println("Close browser Google Chrome");
    }
}
class FireFox extends WebDriver{
    void openBrowser(){
        System.out.println("Opening browser in FireFox");
    }
    void loadWebSite(String website){
        System.out.println("Load the website inside the browser FireFox");
    }
    void Test1(){
        System.out.println("Enter login info and check if you can login in FireFox");
    }
    void Test2(){
        System.out.println("Click on BUY button and make sure you can place an order in FireFox");
    }
    void TestFileDownload(){
        System.out.println("Testing file download in FireFox");
    }
    void closeBrowser(){
        System.out.println("Close browser FireFox");
    }
}
class Safari extends WebDriver{
    void openBrowser(){
        System.out.println("Opening browser in Safari");
    }
    void loadWebSite(String website){
        System.out.println("Load the website inside the browser Safari");
    }
    void Test1(){
        System.out.println("Enter login info and check if you can login in Safari");
    }
    void Test2(){
        System.out.println("Click on BUY button and make sure you can place an order in Safari");
    }
    void TestFileDownload(){
        System.out.println("Testing file download in Safari");
    }
    void closeBrowser(){
        System.out.println("Close browser Safari");
    }
}
class IE extends WebDriver{
    void openBrowser(){
        System.out.println("Opening browser in IE");
    }
    void loadWebSite(String website){
        System.out.println("Load the website inside the browser IE");
    }
    void Test1(){
        System.out.println("Enter login info and check if you can login in IE");
    }
    void Test2(){
        System.out.println("Click on BUY button and make sure you can place an order in IE");
    }
    void TestFileDownload(){
        System.out.println("Testing file download in IE");
    }
    void closeBrowser(){
        System.out.println("Close browser IE");
    }
}