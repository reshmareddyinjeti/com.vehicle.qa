package com.vehicle.qa.pageObjects;

import com.vehicle.qa.driver.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.sql.Driver;

public class HomePage extends DriverFactory {
    public static String vehicleRegNumber;
    @FindBy(id = "vehicleReg")
    private WebElement vehicleReg;
    @FindBy(css = ".track-search")
    private WebElement findVehicleButton;

    public void customerEnterRegistrationNumber(String regNumber) {
        vehicleReg.sendKeys(regNumber);
        vehicleRegNumber = regNumber;
    }

    public void magnifierGlass() {
        findVehicleButton.click();

    }
}


