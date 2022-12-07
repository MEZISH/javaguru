package lv.javaguru.demo.lecture8;

import lv.javaguru.demo.lecture7.DriverFactory;
import lv.javaguru.demo.lecture8.pages.DogsPage;
import lv.javaguru.demo.lecture8.pages.MainPage;
import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class WebDogsTest {

    private static WebDriver driver;

    @Before
    public void setUpDriver() {
        driver = DriverFactory.getDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void demoTest() throws InterruptedException {

        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.openDogsPage();

        DogsPage dogsPage = new DogsPage(driver);
        dogsPage.inputAge(1);

        Thread.sleep(1000);

        Assertions.assertThat(dogsPage.getAgeInputValue()).isEqualTo(1);
    }

    @After
    public void tearDownDriver() {
        driver.close();
        driver.quit();
    }
}
