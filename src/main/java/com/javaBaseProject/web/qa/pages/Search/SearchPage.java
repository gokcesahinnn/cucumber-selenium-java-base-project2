package com.javaBaseProject.web.qa.pages.Search;

import com.javaBaseProject.web.qa.pages.BasePage;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class SearchPage extends BasePage {

    public SearchPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(css = "input[name='q']") public static WebElement searchBox;
    @FindBy(css = "input[name='btnK']") public static WebElement searchButton;


    public static void searchKey(String key) {
        searchBox.sendKeys(key);
        searchButton.click();
    }


}
