package grupCalisma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class G02 {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //1. facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        driver.get("https://facebook.com");
        //oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        String gercekBaslik=driver.getTitle();
        if (gercekBaslik.equals("facebook")){
            System.out.println("sayfa basligi dogru");
        }else System.out.println(gercekBaslik);
        //2.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
        //yazdirin.
        String gercekUrl=driver.getCurrentUrl();
        if (gercekUrl.contains("facebook")){
            System.out.println("test passed");
        }else System.out.println(gercekUrl);
        //3.https://www.walmart.com/ sayfasina gidin.

        driver.navigate().to("https://www.walmart.com/");
        //4. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String sayfaBaslik=driver.getTitle();
        if (sayfaBaslik.contains("Walmart.com")){
            System.out.println("test passed");
        }else System.out.println("test failed");
        //5. Tekrar “facebook” sayfasina donun
        driver.navigate().back();
        //6. Sayfayi yenileyin
        driver.navigate().refresh();
        //7. Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();
        Thread.sleep(3000);
        //8.Browser’i kapatin
        driver.close();


    }
}
