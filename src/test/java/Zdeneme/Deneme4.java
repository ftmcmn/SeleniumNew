package Zdeneme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Deneme4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


   // 1-https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
   // 2- Add Element butonuna 10 kez basinız
        WebElement addE=driver.findElement(By.xpath("//*[text()='Add Element']"));
        for (int i = 0; i <10 ; i++) {
            addE.click();
        }
   // 3- 10 kez Add element butonuna basıldığını test ediniz
        List<WebElement> addBasList=driver.findElements(By.xpath("//*[@class='added-manually']"));
        for (int i = 0; i <10 ; i++) {

            System.out.println(addBasList.get(i).isDisplayed());

        }
   // 4 -Delete butonuna görünmeyene kadar basınız
        List<WebElement> addDelete=driver.findElements(By.xpath("//*[@class='added-manually']"));
        for (int i = 0; i <10 ; i++) {

            addDelete.get(i).click();

        }

   // 5- Delete butonunun görünmediğini test ediniz
        try {
            System.out.println(driver.findElement(By.xpath("//*[@class='added-manually']")).isDisplayed());
        } catch (Exception e) {
            System.out.println("delete butonu görünmüyor");
        }
     /* if (driver.findElement(By.xpath("//*[@class='added-manually']")).isDisplayed()){
          System.out.println("test failed");
      }else System.out.println("test passed");
*/
   // 6- Sayfayı kapatınız
        driver.close();

    }

}
