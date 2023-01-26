package com.javaBaseProject.web.qa.steps;

import com.javaBaseProject.web.qa.pages.Search.SearchResultPage;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class SearchResultSteps {

    private WebDriver webDriver = Hooks.webDriver;
    SearchResultPage searchResultPage = new SearchResultPage(webDriver);

    @Then("verify that the search result contains the keyword {string}")
    public void verifySearchResults(String expectedText) {
        this.searchResultPage.verifySearchResults(expectedText);
    }
}
