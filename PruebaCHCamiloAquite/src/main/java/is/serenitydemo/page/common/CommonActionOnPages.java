package is.serenitydemo.page.common;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class CommonActionOnPages {

    private final WebDriver driver;
    private final WebDriverWait explicitWait;


    protected CommonActionOnPages(WebDriver driver) {
        this.driver = driver;
        explicitWait = new WebDriverWait(driver, Duration.ofMillis(200));
    }

    protected void typeInto(By locator, String value) {
        driver.findElement(locator).sendKeys(value);
    }

    protected void clearText(By locator) {
        driver.findElement(locator).clear();
    }

    protected void click(By locator) {
        driver.findElement(locator).click();
    }

    protected void waitClick(By locator) {
        explicitWait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    protected String getText(By locator) {
        return driver.findElement(locator).getText();
    }

    protected void pressEnter(By locator) {
        driver.findElement(locator).sendKeys(Keys.ENTER);
    }

    protected void waitToBeClickable(By locator) {
        this.explicitWait.until(ExpectedConditions.elementToBeClickable(locator));
    }
}
