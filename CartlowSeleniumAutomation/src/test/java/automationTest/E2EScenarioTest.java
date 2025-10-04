package automationTest;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.*;

public class E2EScenarioTest extends BaseTest{

	@Test
	public void E2EScenario() throws InterruptedException {
		
		//Login
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("yejaro6565@ampdial.com", "Name@2002");
		
		//Change Country to UAE
		ChangeCountry changeCountry = new ChangeCountry(driver);
		changeCountry.switchCountry();
		
		//Clear cart
		CartPage cartPage = new CartPage(driver);
		cartPage.clearCart();

		//Go to Laptops section
		HomePage homePage = new HomePage(driver);
		homePage.goToLaptops();
		
		//Add the Dell laptop to cart
		LaptopsPage laptopsPage = new LaptopsPage(driver);
		laptopsPage.addLaptopToCart();
		
		//Go to Smartwatches section
		homePage.goToSmartwatches();
		
		//Add Apple Watch with options and quantity = 2
		SmartwatchsPage smartwatchsPage = new SmartwatchsPage(driver);
		smartwatchsPage.addSmartwatchToCart();
		
		//Go to cart, remove one laptop, and proceed to checkout
		cartPage.cart();
	}
}