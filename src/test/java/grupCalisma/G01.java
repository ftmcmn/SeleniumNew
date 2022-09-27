package grupCalisma;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class G01 {
    public static void main(String[] args) {

        //1. Amazon soyfasina gidelim. https://www.amazon.com/
        //2. Sayfanin konumunu ve boyutlarini yazdirin
        //3. Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        //4. Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        //5. Sayfayi kapatin

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //1. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //2. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());
        //3. Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        driver.manage().window().setPosition(new Point(70,50));
        driver.manage().window().setSize(new Dimension(700,500));
        //4. Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
       // System.out.println("yeni konum : "+driver.manage().window().getPosition());
       // System.out.println("yeni boyut : "+driver.manage().window().getSize());

        if (driver.manage().window().getPosition().equals(new Point(70,50))){
            System.out.println("sayfa istenilen konumda, test passed");
        }else System.out.println("test failed");

        if (driver.manage().window().getSize().equals(new Dimension(700,500))){
            System.out.println("sayfa istenilen boyutta, test passed");
        }else System.out.println("test failed");

        //5. Sayfayi kapatin
        driver.close();
    }
}
