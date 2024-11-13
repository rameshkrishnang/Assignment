package org.testleaf.factorydesignpattern.browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.logging.Logger;

public class ChromeBrowser implements Browser {

    private static final Logger log = Logger.getLogger(ChromeBrowser.class.getName());

    @Override
    public WebDriver launchBrowser() {
        log.info("Launching Chrome browser");
        return new ChromeDriver();
    }

}
