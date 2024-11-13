package org.testleaf.factorydesignpattern.browserfactory;


import org.openqa.selenium.WebDriver;

public class BrowserFactory {

    public static WebDriver driver;

    public static WebDriver launchBrowserWithUrl(BrowserType browserType) {
        switch (browserType) {
            case chrome:
                driver = new ChromeBrowser().launchBrowser();
                return driver;
            case edge:
                driver = new EdgeBrowser().launchBrowser();
                return driver;
            default:
                throw new IllegalArgumentException("Browser type not supported: " + browserType);
        }
    }

    public static void launchUrl(WebDriver driver) {
        BrowserUtility browserUtility = new BrowserUtility(driver);
        browserUtility.implicitWait();
        browserUtility.maximizeBrowser();
        browserUtility.launchUrl();
    }
}
