package lv.javaguru.demo.lecture12;

import lv.javaguru.demo.lecture7.DriverFactory;
import org.openqa.selenium.WebDriver;

public class DriverProvider {

    private static WebDriver driver;

    public static WebDriver driver() {
        if (driver == null) {
            init();
        }
        return driver;
    }

    public static void init() {
        driver = DriverFactory.getDriver();
    }
}
