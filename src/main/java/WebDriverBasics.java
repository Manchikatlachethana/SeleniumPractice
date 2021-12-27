import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {
    public static void main(String[] args) {
//         FF DRIVER
//         GECKO DRIVER

//        WebDriver driver = new FirefoxDriver();
//        System.setProperty(("webdriver.gecko.driver","/Users/chethanamanchikatla/Documents/geckodriver");


        //chrome browser
        //chrome driver.
        System.setProperty("webdriver.chrome.driver","/Users/chethanamanchikatla/Documents/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();  // launch chrome
        driver.get("http://www.google.com");  // enter url
        String title = driver.getTitle(); // getting title
        System.out.println(title);

        // validation point.
        if(title.equals("Google")){
            System.out.println("title is correct");
        }
        else{
            System.out.println("title is wrong");
        }
        //printing current url, pagesource
    System.out.println("Current URL: "+driver.getCurrentUrl());
    System.out.println("Page Source: "+driver.getPageSource());
    driver.quit();      // closing chrome driver.

    }
}
