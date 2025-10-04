# Cartlow E2E Automation Testing Using Selenium (POM)

## Project Overview
This project automates an **End-to-End (E2E) shopping scenario** on [Cartlow UAE](https://cartlow.com/uae/en) using **Selenium WebDriver** with **Java**. It follows the **Page Object Model (POM) design pattern** to improve code maintainability and scalability.

The automation scenario includes:
- User login
- Navigation through homepage categories
- Selecting specific products (Laptop & Smartwatch)
- Adding items to the cart with quantity, size, color, and connectivity options
- Managing cart items (view, remove)
- Proceeding to checkout

This project is ideal for practicing **E2E testing, Selenium WebDriver, POM pattern, and handling dynamic web elements**.

---

## Technology Stack
- Java 21
- Selenium WebDriver 4.35.0
- TestNG 7.11.0
- Maven (for dependency management)
- Page Object Model (POM) design pattern

---

## E2E Scenario Steps

1. **Login** with a valid account.
2. **Open the homepage**.
3. **Laptops Tab**:
   - Select: `Dell Latitude 7490 Intel Core i7-8650U 14" FHD Display, 16GB RAM, 512GB SSD, Windows 10 Pro`
   - Add **1 item** to the cart.
4. **Smartwatches Tab**:
   - Select: `Apple Watch Series 6 (40mm, GPS + Cellular) Gold Aluminum Case with Pink Sand Sport Band`
   - Options:
     - Connectivity: GPS and Cellular
     - Color: Silver
     - Size: 44mm
   - Add **2 items** to the cart.
5. **Cart Management**:
   - Open cart → View cart
   - Remove the laptop
6. **Checkout**:
   - Proceed to checkout with remaining items

---

## Project Structure
src/
└── main/java/pages/ # Page classes (POM)
└── test/java/automationTest/ # Test classes
pom.xml # Maven configuration

---

## How to Run
1. Clone this repository:
git clone https://github.com/your-username/cartlow-e2e-automation.git
2. Navigate to the project folder:
cd cartlow-e2e-automation
3.Run the tests using Maven:
mvn clean test

---

## Key Features
- Page Object Model (POM) implementation
- Dynamic element handling using WebDriverWait
- Adding products with specific options and quantities
- Cart verification and management
- End-to-End test scenario execution

---

## Notes
- Ensure ChromeDriver is compatible with your installed Chrome browser version.
- Update login credentials in LoginPage before running tests.
- Waits are implemented to handle dynamic elements, pop-ups, and AJAX requests.
