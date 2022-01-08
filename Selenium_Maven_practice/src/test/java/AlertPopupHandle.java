import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.jcajce.provider.digest.Skein;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupHandle {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.findElement(By.name("proceed")).click(); //clicks on sighin btn
        Thread.sleep(5000);
        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        System.out.println(text); //gets text on popup
        //validation
        if(text.equals("Please enter a valid user name")){
            System.out.println("valid");
        }
        else{
            System.out.println("Failed");

        }

        alert.accept(); //clicks on ok btn

        //alert.dismiss(); //clicks on cancel btn




    }
}
