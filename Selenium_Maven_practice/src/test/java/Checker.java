import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checker {
    public static void main(String[] args) throws InterruptedException {
        // launching using webdriver manager
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.nopcommerce.com/en/register?returnUrl=%2Fen");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());


        Thread.sleep(1000);
        WebElement cbox = driver.findElement(By.className("custom-control-label"));
        System.out.println("cbox is displayed "+cbox.isDisplayed());
        System.out.println("cbox is enabled "+cbox.isEnabled());
        System.out.println("Before selection "+cbox.isSelected());

        cbox.click();
        Thread.sleep(1000);

        System.out.println("After selection "+cbox.isSelected());

        Thread.sleep(2000);

        driver.quit();

    }
}
