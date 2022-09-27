package Zdeneme;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Deneme7 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //a. https://amazon.com adresine gidiniz.
        driver.get("https://amazon.com ");
        //b. arama kutusunu locate ediniz
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        //c. arama kutusuna "computer" yazdırınız ve enter yapınız
        aramaKutusu.sendKeys("computer", Keys.ENTER);

        //i. Username : testtechproed@gmail.com
        //ii. Password : Test1234!
        //e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        //f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        //3. Sayfada kac tane link oldugunu bulun
    }
}
