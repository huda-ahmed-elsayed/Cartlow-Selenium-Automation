package pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    private WebDriver driver;
    private WebDriverWait wait;
    private By accountMenu = By.xpath("//*[@id=\"app\"]/header/div[1]/div/div[1]/div[3]/div[3]");
    private By firstSignInButton = By.xpath("//a[normalize-space()='Sign In']");
    private By emailInput = By.xpath("//input[@id='identifier']");
    private By continueButton = By.xpath("//span[normalize-space()='Continue']");
    private By passwordInput = By.xpath("//input[@id='password']");
    private By finalSigInButton = By.xpath("//span[normalize-space()='Sign In']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void login(String email, String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("body")));

        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(accountMenu));
        Actions action = new Actions(driver);
        action.moveToElement(element).pause(Duration.ofSeconds(1)).perform();
        
        wait.until(ExpectedConditions.elementToBeClickable(firstSignInButton)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailInput)).sendKeys(email);
        wait.until(ExpectedConditions.elementToBeClickable(continueButton)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordInput)).sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(finalSigInButton)).click();
    }
}
