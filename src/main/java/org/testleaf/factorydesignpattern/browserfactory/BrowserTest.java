package org.testleaf.factorydesignpattern.browserfactory;

import org.openqa.selenium.WebDriver;

public class BrowserTest {

    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.launchBrowserWithUrl(BrowserType.EDGE);
        BrowserFactory.launchUrl(driver);

        driver = BrowserFactory.launchBrowserWithUrl(BrowserType.CHROME);
        BrowserFactory.launchUrl(driver);
    }

}