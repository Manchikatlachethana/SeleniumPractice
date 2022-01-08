import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchers {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=SignUp");
        //1.xpath
        driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys("Tommy");

        //2.id
        driver.findElement(By.id("lastName")).sendKeys("Roy");

        //3.name
        driver.findElement(By.name("Username")).sendKeys("tommyroy000");

        //5.partiallinkText----for links(but not used much)
        //driver.findElement(By.partialLinkText("2-Step")).click();

        //6.cssSelector
        //if id is there then #idvalue
        //if class is there then .idvalue
        driver.findElement(By.cssSelector("#passwd > div.aCsJod.oJeWuf > div > div.Xb9hP > input")).sendKeys("password");
        driver.findElement(By.cssSelector("#confirm-passwd > div.aCsJod.oJeWuf > div > div.Xb9hP > input")).sendKeys("password");
        //7.className
        driver.findElement(By.className("VfPpkd-muHVFf-bMcfAe")).click();
        Thread.sleep(2000);

        //4.linkText---for links
        driver.findElement(By.linkText("Help")).click();



       //driver.quit();


    }
}
