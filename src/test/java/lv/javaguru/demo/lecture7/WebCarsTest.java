package lv.javaguru.demo.lecture7;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebCarsTest {

    private static WebDriver driver;

    @Before
    public void setUpDriver() {
        driver = DriverFactory.getDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void demoTest() throws InterruptedException {
        driver.get("https://www.ss.com/lv/");
        WebElement carsLink = driver.findElement(By.xpath("//*[@id='mtd_97']"));
        carsLink.click();

        WebElement priceInputMin = driver.findElement(By.xpath("//*[@id='f_o_8_min']"));
        WebElement priceInputMax = driver.findElement(By.xpath("//*[@id='f_o_8_max']"));
        priceInputMin.sendKeys("6000");
        priceInputMax.sendKeys("10000");


        Select colorDropdown = new Select(driver.findElement(By.xpath("//*[@id='f_o_17']")));
        String whiteColorValue = "6318";
        colorDropdown.selectByValue(whiteColorValue);

        Thread.sleep(10000);
    }

    @After
    public void tearDownDriver() {
        driver.close();
        driver.quit();
    }
}
