package com.vehicle.qa.pageObjects;

import com.vehicle.qa.driver.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultsPage extends DriverFactory {
    public String getUrl() {

        return driver.getCurrentUrl();
    }

    @FindBy(css = ".result")
    private WebElement regResult;

    public String getRegResult() {
        return regResult.getText();
    }
}

