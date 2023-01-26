package com.javaBaseProject.web.qa.pages.Search;

import com.javaBaseProject.web.qa.pages.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage extends BasePage {

    public SearchResultPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(css = ".g link")
    public WebElement titleSearchLink;

    public String getTextSearchedKeys() {
        return titleSearchLink.getAttribute("href");
    }

    public void verifySearchResults(String expectedText) {
        System.out.println("Search Result Page First Href Text " + titleSearchLink.getAttribute("href"));
        System.out.println("expectedText: " + expectedText);
        Assert.assertTrue(getTextSearchedKeys().contains(expectedText));
    }

}
