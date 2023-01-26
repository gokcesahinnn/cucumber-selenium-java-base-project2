package com.javaBaseProject.web.qa.steps;

import com.javaBaseProject.web.qa.util.BrowserType;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.time.Duration;

import static com.javaBaseProject.web.qa.webDriver.WebDriverFactory.getInstance;

public class Hooks {
    public static WebDriver webDriver;

    private static final Log log = LogFactory.getLog(Hooks.class);

    @Before
    public void openBrowser() {
        log.info("Opening Browser");
        webDriver = getInstance(BrowserType.CHROME);
        webDriver.manage().deleteAllCookies();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @After
    public void tearDown(Scenario scenario){
        File file;
        if (scenario.isFailed()) {
            String screenshotPath = System.getProperty("user.dir") + "\\target\\screenshots\\" + scenario.getName() + "\\";
            file = new File(screenshotPath);
            file.mkdir();
            try {
                final File scrFile = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(scrFile, new File(screenshotPath + "screenshot.png"));

            } catch (final Exception e) {
                e.printStackTrace();
            }
            String failedScreenShot = screenshotPath + "screenshot.png";
            String url = "<img src=" + failedScreenShot + " alt='failed screenshot'>";
            scenario.embed(url.getBytes(), "png", "Click Here To See Screenshot");
        }
        webDriver.quit();
    }
}