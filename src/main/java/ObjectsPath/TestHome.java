package ObjectsPath;

// Import necessary classes from Selenium
import org.openqa.selenium.By;


// Define the TestHome class
public class TestHome {

    // Locator for the login button in the home page

    public static final By language = By.xpath("/html/body/main/div/nav[2]/div[2]/button[1]");


    public static final By ClickBoot = By.xpath("/html/body/main/div/nav[2]/div[1]/div/div/ul/li[2]/a");

    public static final By ClickFliter = By.xpath("/html/body/main/section[1]/div/section[1]/div/div[1]/div[1]/button/img");

    public static final By ClickSearchS = By.xpath("/html/body/main/section[1]/div/section[1]/div/div[2]/div/div/div[3]/input");

    public static final By SearchInputBar = By.xpath("/html/body/main/section[1]/div/section[1]/div/div[2]/div/div/div[3]/input");


    public static final By ClickRegionS = By.xpath("//*[@id=\"regionSelect\"]");

    public static final By SelectRegionR = By.xpath("//*[@id=\"regionSelect\"]/option[2]");

    public static final By SelectC = By.xpath("/html/body/main/section[1]/div/section[1]/div/div[1]/div[2]/button[2]");




    //Below for uadcity
//   public static final By searchBarElement = By.xpath("//*[@id=\"app-header\"]/div[1]/div[2]/div[1]/div/div[1]/input");
//    // Locator for the email address input field in the login form
//    public static final By SearchInputBar = By.xpath("//*[@id=\"app-header\"]/div[1]/div[2]/div[1]/div/div[1]/inputa");
//
//    // Locator for the password input field in the login form
//    public static final By assertionForProgram = By.xpath("//*[@id=\"__next\"]/div/main/div[1]/div/div[2]/section/div[2]/div[2]/div/div/article[1]/div[2]/div[1]/div[1]");
//
//    // Locator for the sign in button in the login form
//    public static final By learnB = By.xpath("//*[@id='popover-trigger-:r18:']");
//
//    // Locator for an element to assert upon successful login
//    public static final By assertionUponLogin = By.xpath("//*[@id='dashboard']/div/feed-container/div[1]/div/a");

}
