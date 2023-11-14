package com.kodilla.testing2.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverConfig {
    public final static String SAFARI = "SAFARI_DRIVER";
    public static WebDriver getDriver(final String driver) {

        System.setProperty("webdriver.safari.driver", "/Users/marcelchlastawa/Documents/Development/Projects/Kodilla/safaridriver");

        if (driver.equals(SAFARI)) {
            return new SafariDriver();
        } else {
            return null;
        }
    }

}
