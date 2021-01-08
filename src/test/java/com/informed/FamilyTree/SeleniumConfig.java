package com.informed.FamilyTree;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumConfig {
    private WebDriver driver;

    public SeleniumConfig(){
        driver = new ChromeDriver();
    }

    static {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    }

    public void close() {
        driver.close();
    }

    public WebDriver getDriver() {
        return driver;
    }


}
