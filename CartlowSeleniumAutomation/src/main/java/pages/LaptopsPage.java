package pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LaptopsPage {

    private WebDriver driver;
    private WebDriverWait wait;
    private By searchBar = By.xpath("//*[@id=\"app\"]/header/div[1]/div/div[1]/div[2]/form/div/input");
    private By dellLaptop = By.xpath("//*[@id=\"main\"]/div/div/div[2]/div[2]/div[2]/div/div[1]/a");
    private By addToCartButton = By.xpath("//*[@id=\"main\"]/div[2]/form/div/div/div[2]/div[6]/button");

    public LaptopsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void addLaptopToCart() throws InterruptedException {
        WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(searchBar));
        input.sendKeys("Dell Latitude 7490 Intel Core i7-8650U 14\" FHD Display, 16GB RAM, 512GB SSD, Windows 10 Pro");
        Thread.sleep(2000);
        input.sendKeys(Keys.ENTER);

        wait.until(ExpectedConditions.visibilityOfElementLocated(dellLaptop)).click();

        WebElement addButton = wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
        ((JavascriptExecutor) driver).executeScript(
            "arguments[0].scrollIntoView(true); window.scrollBy(0, -150);", addButton);

        try {
            addButton.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", addButton);
        }
    }
}