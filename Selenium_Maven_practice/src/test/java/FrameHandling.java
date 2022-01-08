import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FrameHandling {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(); // launch chrome.

        driver.manage().window().fullscreen(); //maximize window.
        driver.manage().deleteAllCookies(); //delete all cookies.

        //dynamic wait
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("https://demoqa.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class=\"card-body\" and h5 = \"Alerts, Frame & Windows\"]")).click();
        Thread.sleep(1000);
        driver.findElement((By.id("item-2"))).click();

    }
}
