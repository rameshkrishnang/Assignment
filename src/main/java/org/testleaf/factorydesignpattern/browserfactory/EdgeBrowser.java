package org.testleaf.factorydesignpattern.browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.logging.Logger;

public class EdgeBrowser implements Browser{

    private static Logger log = Logger.getLogger(EdgeBrowser.class.getName());

   @Override
    public WebDriver launchBrowser() {
        log.info("Launching Edge Browser");
        return new EdgeDriver();
    }
}
