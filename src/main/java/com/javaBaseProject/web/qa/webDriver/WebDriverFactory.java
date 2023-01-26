package com.javaBaseProject.web.qa.webDriver;

import com.javaBaseProject.web.qa.util.BrowserType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class WebDriverFactory {
    private WebDriverFactory() {
    }

    public static WebDriver getInstance(BrowserType browser) {
        WebDriver webDriver;
        switch (browser) {
            default:
            case CHROME:
                webDriver = new ChromeDriver(setChromeOptions());
                break;
            case FIREFOX:
                webDriver = new FirefoxDriver(setFirefoxDriver());
                break;
            case EDGE:
                webDriver = new EdgeDriver(setEdgeDriver());
                break;
        }
        return webDriver;
    }

    public static ChromeOptions setChromeOptions() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-blink-features=AutomationControlled");
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-web-security");
        options.addArguments("--ignore-ssl-errors=yes");
        options.addArguments("--ignore-certificate-errors");
        return options;
    }

    public static FirefoxOptions setFirefoxDriver() {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--disable-blink-features=AutomationControlled");
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-web-security");
        options.addArguments("--ignore-ssl-errors=yes");
        options.addArguments("--ignore-certificate-errors");
        return options;
    }

    public static EdgeOptions setEdgeDriver() {
        WebDriverManager.edgedriver().setup();
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--disable-blink-features=AutomationControlled");
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-web-security");
        options.addArguments("--ignore-ssl-errors=yes");
        options.addArguments("--ignore-certificate-errors");
        return options;
    }
}
