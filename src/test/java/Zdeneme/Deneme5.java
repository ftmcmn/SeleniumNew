package Zdeneme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Deneme5 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // 1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //2- Add Element butonuna basin
        int counter = 0;
        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
        counter++;

        // 3- 10 kez Add element butonuna basildigini test ediniz
        while (counter <= 9) {
            Thread.sleep(250);
            driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
            counter++;
        }

        //4- Delete butonu gorunmeyene kadar basiniz ve  Delete butonunun gorunmedigini test ediniz

        while (true) {
            try {
                Thread.sleep(250);
                driver.findElement(By.xpath("//button[@class='added-manually']")).click();
            } catch (Exception e) {
                System.out.println("Is Delete buttton display? : PASS");
                break;
            }

        }

        // 6- Sayfayi Kapatiniz
        driver.close();

    }
}

