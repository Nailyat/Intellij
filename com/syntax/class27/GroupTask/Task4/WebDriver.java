package com.syntax.class27.GroupTask.Task4;

public interface WebDriver {

    void open();
    void close();

    String getTitle();
}
interface TakesScreenshot{
    void getScreenshot();
}
interface RemoteWebDriver extends WebDriver, TakesScreenshot{
    void navigate();
}
class ChromeDriver implements RemoteWebDriver{
    @Override
    public void open() {
        System.out.println("Open Chrome");
    }

    @Override
    public void close() {
        System.out.println("Close Chrome");
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void getScreenshot() {
        System.out.println("Take screenshot in Chrome");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to Chrome");
    }
}
class FirefoxDriver implements RemoteWebDriver{
    @Override
    public void open() {
        System.out.println("Open Firefox");
    }

    @Override
    public void close() {
        System.out.println("Close Firefox");
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void getScreenshot() {
        System.out.println("Take screenshot in Firefox");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to Firefox");
    }
}
class SafariDriver implements RemoteWebDriver{
    @Override
    public void open() {
        System.out.println("Open Safari");
    }

    @Override
    public void close() {
        System.out.println("Open Safari");
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void getScreenshot() {
        System.out.println("Take screenshot in Safari");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to Safari");
    }
}