package com.syntax.class27.Task;

public class Tester {
    public static void main(String[] args) {

        WebDriver webDriver=new ChromeDriver();
        webDriver.openBrowser();
        webDriver.maximizeWindow();
        webDriver.findElement();
        webDriver.closeBrowser();

        WebDriver webDriver1=new FireFoxDriver();
        webDriver1.openBrowser();
        webDriver1.maximizeWindow();
        webDriver1.findElement();
        webDriver1.closeBrowser();
    }
}
