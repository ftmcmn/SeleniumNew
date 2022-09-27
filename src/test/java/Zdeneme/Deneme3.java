package Zdeneme;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Deneme3 {
    public static void main(String[] args) {
        //1. Launch browser
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");
        //3. Verify that home page is visible successfully
        //driver.navigate().to("http://automationexercise.com");
        System.out.println(driver.findElement(By.cssSelector("a[style='color: orange;']")).isDisplayed());
        //4. Click on 'Products' button
        driver.findElement(By.xpath("//i[@class='material-icons card_travel']")).click();
        //5. Verify user is navigated to ALL PRODUCTS page successfully
        System.out.println(driver.findElement(By.xpath("//h2[@class='title text-center']")).isDisplayed());
        //6. Enter product name in search input and click search button
        driver.findElement(By.cssSelector("input[id='search_product']")).sendKeys("blue top");
        driver.findElement(By.cssSelector("#submit_search")).click();

        //7. Verify 'SEARCHED PRODUCTS' is visible
        System.out.println(driver.findElement(By.cssSelector(".product-overlay")).isDisplayed());

        //8. Verify all the products related to search are visible

        driver.findElement(By.xpath("(//*[@class='pull-right'])[1]")).click();

        driver.findElement(By.xpath("//*[text()=' Contact us']")).click();

    }
}
