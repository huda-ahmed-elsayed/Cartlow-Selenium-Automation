package pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	private WebDriver driver;
	private WebDriverWait wait;
	private By laptopsTab = By.linkText("Laptops");
	private By smartwatchesTab = By.linkText("Smartwatches");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	}
	
	public void goToLaptops() {
		wait.until(ExpectedConditions.elementToBeClickable(laptopsTab)).click();
	}
	
	public void goToSmartwatches() {
		wait.until(ExpectedConditions.elementToBeClickable(smartwatchesTab)).click();
	}
}