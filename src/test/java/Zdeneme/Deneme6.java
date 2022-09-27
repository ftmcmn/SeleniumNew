package Zdeneme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Deneme6 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       //2- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");
       //3- Browseri tam sayfa yapin
        driver.manage().window().maximize();
       //4)Sayfayi “refresh” yapin
        driver.navigate().refresh();
       //5)Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String baslik=driver.getTitle();
        if (baslik.contains("Spend less")){
            System.out.println("test passed");
        }else System.out.println("test failed");
       //6)Gift Cards sekmesine basin
        driver.findElement(By.xpath("(//*[@class='nav-a  '])[4]")).click();
        Thread.sleep(300);
       //7)Birthday butonuna basin
       driver.findElement(By.xpath("//img[@alt='Birthday gift cards']")).click();
       //8)Best Seller bolumunden ilk urunu tiklayin
        driver.findElement(By.xpath("(//img[@alt='Amazon.com eGift Card'])[1]")).click();
        Thread.sleep(300);
       //9- Gift card details’den 25 $’i secin
        driver.findElement(By.cssSelector("#gc-mini-picker-amount-1")).click();
        Thread.sleep(300);
       //10-Urun ucretinin 25$ oldugunu test edin
        if (driver.findElement(By.cssSelector("#gc-live-preview-amount")).isDisplayed()){
            System.out.println("ürün ücreti 25$");
        }else System.out.println("ürün ücreti 25$ degil");
        Thread.sleep(300);
       //0-Sayfayi kapatin
        driver.close();

    }
}
