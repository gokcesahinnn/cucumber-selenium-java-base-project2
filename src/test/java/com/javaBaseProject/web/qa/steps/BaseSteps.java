package com.javaBaseProject.web.qa.steps;

import com.javaBaseProject.web.qa.pages.BasePage;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class BaseSteps {

    private WebDriver webDriver = Hooks.webDriver;
    BasePage basePage = new BasePage(webDriver);

    public BaseSteps() {
    }

    @When("user on the homepage")
    public void openHomePage() {
        basePage.HomePage();
    }
}
