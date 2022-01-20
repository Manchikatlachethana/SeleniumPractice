import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWait {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        //launch chrome
        WebDriver driver = new ChromeDriver();
        //enter url
        driver.get("https://www.flipkart.com/");
        //maximize window
        driver.manage().window().maximize();
        //delete the cookies
        driver.manage().deleteAllCookies();

        //dynamic wait
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);



    }
}
