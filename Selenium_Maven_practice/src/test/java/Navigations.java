import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Navigations {
    public static void main(String[] args) throws MalformedURLException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //opening flipkart
        driver.get("https://www.flipkart.com/");
        //opening myntra
        driver.navigate().to("https://www.myntra.com/");



        //creating url instance
        URL url = new URL("https://www.amazon.in/");

        //opening amazon
        driver.navigate().to(url);

        // moving back to myntra
        driver.navigate().back();

        // moving forward to amazon
        driver.navigate().forward();

        // reloading amazon.
        driver.navigate().refresh();

        driver.quit();

    }
}
