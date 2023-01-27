package com.javaBaseProject.web.qa.runners;


import com.javaBaseProject.web.qa.util.ConfigReader;
import com.vimalselvam.cucumber.listener.Reporter;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/com/javaBaseProject/web/qa/features"},
        glue = "com.javaBaseProject.web.qa.steps",
        plugin = "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportRegression.html",
        tags = {"@smoke"}
)

public class SmokeTestRunner extends AbstractTestNGCucumberTests {
    @AfterClass
    public static void afterClass() {
        Reporter.loadXMLConfig("src/main/resources/extendReportProperties.xml");
        Reporter.setSystemInfo("QA Tester : ", "kloia QA");
        Reporter.setSystemInfo("Application name : ", ConfigReader.get("application_name"));
        Reporter.setSystemInfo("Operating System Info", ConfigReader.get("os_name"));
        Reporter.setSystemInfo("Department", "QA");
        Reporter.setTestRunnerOutput("Test execution Cucumber Report");
    }
}
