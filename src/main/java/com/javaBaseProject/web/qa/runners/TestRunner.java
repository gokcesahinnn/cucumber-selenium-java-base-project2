package com.javaBaseProject.web.qa.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/com/javaBaseProject/web/qa/features"},
        glue = "com.javaBaseProject.web.qa.steps",
        plugin = {
                "pretty",
                "html:target/cucumber",
                "json:target/cucumber.json",
                "junit:target/cucumber.xml"
        }
)

public class TestRunner {
}