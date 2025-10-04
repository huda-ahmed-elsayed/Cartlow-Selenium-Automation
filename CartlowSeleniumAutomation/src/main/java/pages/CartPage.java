package pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {
	
	private WebDriver driver;
	private WebDriverWait wait;
	private By cartLogo = By.xpath("//div[@class='mt-1.5 flex items-center gap-x-12 max-[1100px]:gap-x-6 max-lg:gap-x-8']//div//div//span[@aria-label='Profile'][normalize-space()='Cart']");
	private By viewCart = By.xpath("//div[@class='mt-1.5 flex items-center gap-x-12 max-[1100px]:gap-x-6 max-lg:gap-x-8']//div//div[@class='fixed z-[21] overflow-hidden bg-white max-md:!w-full inset-y-0 ltr:right-0 rtl:left-0']//div[@class='pointer-events-auto h-full w-full overflow-auto bg-white']//div[@class='flex h-full w-full flex-col']//div[@class='min-h-0 min-w-0 flex-1 overflow-auto']//div[@class='flex h-full flex-col']//div//a[@class='mx-auto block w-full cursor-pointer rounded-lg px-11 py-2.5 text-center text-base font-medium text-gray-700 max-md:rounded-lg max-md:px-5 max-md:py-1.5 border-2 border-gray-300 hover:border-navyBlue hover:bg-gray-200 hover:text-navyBlue transition-all duration-200'][normalize-space()='View Cart']");
	private By itemsSelected = By.xpath("//*[@id=\"select-all\"]");
	private By removeAllButton = By.xpath("//*[@id=\"main\"]/div[2]/div/div[2]/div/div[1]/div[1]/div/div[2]/a[1]");
	private By removeButton = By.xpath("//body//div//div//div//div//div[2]//div[2]//div[1]//div[1]//div[1]//div[3]//div[2]//div[1]//span[1]//span[2]");
	private By agreeButton = By.xpath("//button[normalize-space()='Agree']");
	private By checkoutButton = By.xpath("//a[@class='primary-button place-self-end rounded-2xl px-5 py-2 max-md:my-4 max-md:max-w-full max-md:rounded-lg max-md:py-3 max-md:text-sm max-sm:w-full max-sm:py-2']");
	private By closeButton = By.xpath("//*[@id=\"app\"]/header/div[1]/div/div[1]/div[3]/div[2]/div[3]/div/div/div/div/div[1]/div[2]");
	private By homeLogo = By.xpath("//*[@id=\"app\"]/header/div[1]/div/div[1]/div[1]/a/div[2]");

	public CartPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
	
	public void clearCart() {
	    wait.until(ExpectedConditions.elementToBeClickable(cartLogo)).click();

	    try {
	        WebDriverWait shortWait = new WebDriverWait(driver, Duration.ofSeconds(3));
	        shortWait.until(ExpectedConditions.visibilityOfElementLocated(viewCart));

	        wait.until(ExpectedConditions.elementToBeClickable(viewCart)).click();
	        wait.until(ExpectedConditions.elementToBeClickable(itemsSelected)).click();
	        wait.until(ExpectedConditions.elementToBeClickable(removeAllButton)).click();
	        wait.until(ExpectedConditions.elementToBeClickable(agreeButton)).click();
	        wait.until(ExpectedConditions.elementToBeClickable(homeLogo)).click();
	    } catch (Exception e) {
	        wait.until(ExpectedConditions.elementToBeClickable(closeButton)).click();
	    }
	}
	
	public void cart() {
		wait.until(ExpectedConditions.elementToBeClickable(cartLogo)).click();
		wait.until(ExpectedConditions.elementToBeClickable(viewCart)).click();
		wait.until(ExpectedConditions.elementToBeClickable(removeButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(agreeButton)).click();
		wait.until(ExpectedConditions.elementToBeClickable(checkoutButton)).click();
	}	
}