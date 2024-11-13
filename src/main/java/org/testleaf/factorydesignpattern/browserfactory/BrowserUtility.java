package org.testleaf.factorydesignpattern.browserfactory;

import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.logging.Logger;

public class BrowserUtility {

    private static final Logger log = Logger.getLogger(BrowserUtility.class.getName());
    public WebDriver driver;

    BrowserUtility(WebDriver driver) {
        this.driver = driver;
    }

    public void implicitWait() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        log.info("Added Implicit Wait");
    }

    public void maximizeBrowser() {
        driver.manage().window().maximize();
        log.info("Maximized Browser Window");
    }

    public void launchUrl() {
        driver.get("https://www.google.com");
        log.info("Launched Url");
    }

}