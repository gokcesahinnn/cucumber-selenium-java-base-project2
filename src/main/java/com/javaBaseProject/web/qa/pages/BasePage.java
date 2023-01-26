package com.javaBaseProject.web.qa.pages;

import com.javaBaseProject.web.qa.util.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BasePage {

    public WebDriverWait webDriverWait;
    protected WebDriver webDriver;

    @Deprecated
    protected BasePage(WebDriver webDriver, long timeoutInSeconds) {
        this(webDriver, Duration.ofSeconds(timeoutInSeconds));
        new WebDriverWait(webDriver, Duration.ofSeconds(30));
    }

    public BasePage(WebDriver webDriver, Duration ofSeconds) {
    }

    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public void HomePage(){
        String url = System.getProperty("base.url") != null ? System.getProperty("base.url") : ConfigReader.get("url");
        webDriver.navigate().to(url);
    }

}