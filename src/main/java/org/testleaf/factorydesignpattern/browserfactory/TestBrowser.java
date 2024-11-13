package org.testleaf.factorydesignpattern.browserfactory;

import org.openqa.selenium.WebDriver;

public class TestBrowser {

    public static void main(String[] args) {

        WebDriver driver = BrowserFactory.launchBrowserWithUrl(BrowserType.edge);
        BrowserFactory.launchUrl(driver);

    }

}