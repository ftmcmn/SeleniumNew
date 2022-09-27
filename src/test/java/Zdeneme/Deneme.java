package Zdeneme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Deneme {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

       // driver.get("https://techproeducation.com");

        driver.manage().window().maximize();


        //driver.manage().window().fullscreen();

        driver.navigate().to("https://amazon.com");

      //  driver.navigate().back();

     //   driver.navigate().forward();
     //   Thread.sleep(4000);

      //  driver.navigate().refresh();

        if (driver.getPageSource().contains("getway")){
            System.out.println("kelime vardır");
        }else System.out.println("kelime yoktur");


        if (driver.getTitle().equals("Amazon.com. Spend less. Smile more.")){
            System.out.println("test passed");
        }else System.out.println("test failed");

        System.out.println(driver.getTitle());

       // driver.findElement(By.id("twotabsearchtextbox")).sendKeys("nutella");
       // driver.findElement(By.id("nav-search-submit-button")).click();



       // driver.close();








    }
}
