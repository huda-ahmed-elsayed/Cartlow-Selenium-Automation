package pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChangeCountry {
	
	private WebDriver driver;
	private WebDriverWait wait;
	private By intlButton = By.xpath("//*[@id=\"app\"]/header/div[1]/div/div[1]/div[3]/div[1]/button");
	private By uaeButton = By.xpath("//*[@id=\"app\"]/header/div[1]/div/div[1]/div[3]/div[1]/div/div/div/form[1]/button");
	
	public ChangeCountry(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
	
	public void switchCountry() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("body")));

        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(intlButton));
        Actions action = new Actions(driver);
        action.moveToElement(element).pause(Duration.ofSeconds(1)).perform();
        
		wait.until(ExpectedConditions.elementToBeClickable(uaeButton)).click();
	}
}