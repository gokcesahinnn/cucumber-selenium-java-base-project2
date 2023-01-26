package com.javaBaseProject.web.qa.steps.Search;

import com.javaBaseProject.web.qa.pages.BasePage;
import com.javaBaseProject.web.qa.pages.Search.SearchPage;
import com.javaBaseProject.web.qa.steps.Hooks;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class SearchSteps {

    private WebDriver webDriver = Hooks.webDriver;
    SearchPage searchPage = new SearchPage(webDriver);

    public SearchSteps() {
    }

    @When("search {string} on search page")
    public void searchKey(String key) {
        searchPage.searchKey(key);
    }
}
