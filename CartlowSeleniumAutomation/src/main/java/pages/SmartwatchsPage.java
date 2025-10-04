package pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SmartwatchsPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By searchBar = By.xpath("//*[@id=\"app\"]/header/div[1]/div/div[1]/div[2]/form/div/input");
    private By appleWatch = By.xpath("//*[@id=\"main\"]/div/div/div[2]/div[2]/div[2]/div/div[1]/a");
    private By connectivity = By.xpath("//span[normalize-space()='GPS And Cellular']");
    private By color = By.xpath("//span[normalize-space()='Silver']");
    private By size = By.xpath("//span[normalize-space()='44mm']");
    private By quantity = By.xpath("//span[@aria-label='Increase Quantity']");
    private By addToCartButton = By.xpath("//button[normalize-space()='Add To Cart']");

    public SmartwatchsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    private void scrollAndClick(By locator) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true); window.scrollBy(0, -150);", element);
        try {
            element.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        }
    }

    public void addSmartwatchToCart() throws InterruptedException {
        WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(searchBar));
        input.sendKeys("Apple Watch Series 6 (40mm, GPS + Cellular) Gold Aluminum Case with Pink Sand Sport Band");
        Thread.sleep(2000);
        input.sendKeys(Keys.ENTER);

        scrollAndClick(appleWatch);
        scrollAndClick(connectivity);
        scrollAndClick(color);
        scrollAndClick(size);
        scrollAndClick(quantity);
        scrollAndClick(addToCartButton);
    }
}