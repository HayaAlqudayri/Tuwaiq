package Pages;

// Import necessary classes from Selenium and TestNG
import org.openqa.selenium.*;
import org.testng.Assert;

import static ObjectsPath.TestHome.*; // Import all static fields (locators) from TestHome class

// Define the TestPages class
public class TestPages {
    WebDriver driver = null; // Declare WebDriver instance variable

    // Constructor to initialize WebDriver instance
    public TestPages(WebDriver driver) {
        this.driver = driver; // Assign WebDriver instance from parameter to local driver variable
    }

    // Method to open GitHub homepage
    public void OpenUrl() {
        driver.get("https://tuwaiq.edu.sa/"); // Navigate to GitHub URL
    }
     // https://www.udacity.com/
    // Method to click on the login button on the home page
    public void ChangeLanguage() {
        WebElement english = driver.findElement(language); // Find login button element
        english.click(); // Click on the login button
    }


    public void ClickBootcampsAndCourses() {
        WebElement ClickB = driver.findElement(ClickBoot); // Find login button element
        ClickB.click(); // Click on the login button
    }

    public void ClickFliterIcon() {
        WebElement ClickF = driver.findElement(ClickFliter); // Find login button element
        ClickF.click(); // Click on the login button
    }

    public void ClickSearch() {
        WebElement ClickS = driver.findElement(ClickSearchS); // Find login button element
        ClickS.click(); // Click on the login button
    }

    public void ClickRegion() {
        WebElement ClickL = driver.findElement(ClickRegionS); // Find login button element
        ClickL.click(); // Click on the login button

    }
    public void SearchData () throws InterruptedException {
        driver.findElement(SearchInputBar).sendKeys("علم"); // Find email address field and enter email
        Thread.sleep(3000); // Pause execution for 3000 milliseconds (not recommended; use explicit waits instead)
        driver.findElement(SearchInputBar).sendKeys(Keys.ENTER);
    }

        public void SelectRegion() {
        WebElement Select = driver.findElement(SelectRegionR); // Find login button element
        Select.click(); // Click on the login button
    }


    public void SelectCatogery() {
        WebElement SelectCa = driver.findElement(SelectC); // Find login button element
        SelectCa.click(); // Click on the login button
    }

    public void scrollToPosition(int x, int y) {
        JavascriptExecutor Js = (JavascriptExecutor) driver;
        Js.executeScript("window.scrollTo(arguments[0], arguments[1]);",x , y);

    }

//
//    // Method to enter login credentials and verify login
//    public void SearchData () throws InterruptedException {
//        driver.findElement(SearchInputBar).sendKeys("data"); // Find email address field and enter email
//        Thread.sleep(3000); // Pause execution for 3000 milliseconds (not recommended; use explicit waits instead)
//        driver.findElement(SearchInputBar).sendKeys(Keys.ENTER); // Find password field and enter password
//        //  driver.findElement(signInBtn).click(); // Click on sign-in button
//
//         boolean homepageview = driver.findElement(assertionForProgram).isDisplayed(); // Check if assertion element is displayed
//           Assert.assertTrue(homepageview, "home page is not displayed!"); // Assert that homepageview is true
//    }
//
//    public void LearnMethod() {
//        WebElement learnBtn = driver.findElement(learnB); // Find login button element
//        learnBtn.click(); }
//}
}