package commons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Base {

    protected static WebDriver driver;
    protected static WebDriverWait wait;

    static {
        try {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
            ChromeOptions chromeOptions = new ChromeOptions();
            driver = new ChromeDriver(chromeOptions);
            wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
    public Base (WebDriver driver){
        Base.driver=driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
    }

    public static void navigateToDemoqa(String url){
        driver.get(url);
    }

    public WebElement find(String locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public void write(String locator, String textToWrite){
        find(locator).clear();
        find(locator).sendKeys(textToWrite);
    }

    public void clickElement(String locator){
        find(locator).click();
    }
}
