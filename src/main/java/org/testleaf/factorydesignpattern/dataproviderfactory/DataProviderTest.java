package org.testleaf.factorydesignpattern.dataproviderfactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testleaf.factorydesignpattern.browserfactory.BrowserFactory;
import org.testleaf.factorydesignpattern.browserfactory.BrowserType;

import java.util.Map;

public class DataProviderTest {

    public static void main(String[] args) {
        // Retrieve data from Excel
        TestDataProvider dataProvider = DataProviderFactory.getDataProvider(DataSourceType.EXCEL);
        Map<String, String> credentials = dataProvider.getTestData();

        String username = credentials.get("username");
        String password = credentials.get("password");

        WebDriver driver = BrowserFactory.launchBrowserWithUrl(BrowserType.EDGE);
        BrowserFactory.launchUrl(driver);
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("submit")).click();
    }
}