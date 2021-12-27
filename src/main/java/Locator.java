import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Locator {
    public static void main(String[] args) throws InterruptedException {
        
        System.setProperty("webdriver.chrome.driver", "/Users/chethanamanchikatla/Documents/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();  // launch chrome
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.get("https://www.matrimony.com/");
        Thread.sleep(1000);
        String text = driver.findElement(By.xpath("//dl[@id=\"REGISTERED_BY_DIV\"]/dt/label")).getText();
        System.out.println(text);

        WebElement profileFor = driver.findElement(By.xpath("//select[@id=\"REGISTERED_BY\"]"));
        Select select = new Select(profileFor);
//        List<WebElement> profileForList = select.getOptions();
//        profileForList.stream().forEach(item->{
//            System.out.println(item.getText());
//        });
        select.selectByValue("1");

        WebElement element = driver.findElement(By.xpath("//input[@id =\"NAME\"]"));
        element.sendKeys("aaaaaa");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@id=\"gendermale\"]")).click();
        Thread.sleep(1000);

        WebElement dd = driver.findElement(By.xpath("//select[@id=\"DOBDAY\"]"));
        Select ddselect = new Select(dd);
        ddselect.selectByValue("1");

        WebElement mm = driver.findElement(By.xpath("//select[@id=\"DOBMONTH\"]"));
        Select mmselect = new Select(mm);
        mmselect.selectByValue("1");

        WebElement yy = driver.findElement(By.xpath("//select[@id=\"DOBYEAR\"]"));
        Select yyselect = new Select(yy);
        yyselect.selectByValue("1996");
        Thread.sleep(1000);

        WebElement religion = driver.findElement(By.xpath("//select[@id=\"RELIGION\"]"));
        Select regSelect = new Select(religion);
        regSelect.selectByValue("1");

        WebElement mTongue = driver.findElement(By.xpath("//select[@id=\"MOTHERTONGUE\"]"));
        Select mtSelect = new Select(mTongue);
        mtSelect.selectByValue("48");
        Thread.sleep(2000);

        WebElement caste = driver.findElement(By.xpath("//select[@name=\"CASTE_NORMAL\"]"));
        Select casSelect = new Select(caste);
        casSelect.selectByValue("9");
//        List<WebElement> c = casSelect.getOptions();
//        c.stream().forEach(item->{
//            System.out.println(item.getText());
//        });

        WebElement country = driver.findElement(By.xpath("//select[@id=\"COUNTRY\"]"));
        Select counSelect = new Select(country);
        counSelect.selectByValue("98");

        WebElement mbnum = driver.findElement(By.xpath("//select[@id=\"M_COUNTRYCODE\"]"));
        Select mnumSelect = new Select(mbnum);
        mnumSelect.selectByValue("98");

        WebElement mno = driver.findElement(By.xpath("//input[@id=\"MOBILENO\"]"));
        mno.sendKeys("9876543210");

        WebElement email = driver.findElement(By.xpath("//input[@id=\"EMAIL\"]"));
        email.sendKeys("abc@gmail.com");

        WebElement pass = driver.findElement(By.xpath("//input[@id=\"PASSWORD\"]"));
        pass.sendKeys("abcd");

        driver.findElement(By.xpath("//input[@id=\"TERMS\"]")).click();
        Thread.sleep(5000);

        //driver.findElement(By.className("bm-reg-button")).click()  //input[@class="bm-reg-button"]

        driver.quit();



    }
}
