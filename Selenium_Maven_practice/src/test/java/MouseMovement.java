import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.spicejet.com/");

//        Alert alert = driver.switchTo().alert();
//        String text = alert.getText();
//        System.out.println(text);
//        Thread.sleep(2000);
//        alert.dismiss();

        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//div[text()='Add-ons']"))).build().perform();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[text() = \"SpiceMAX\"]")).click();
    }
}
