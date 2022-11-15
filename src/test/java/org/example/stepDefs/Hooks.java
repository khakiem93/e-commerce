package org.example.stepDefs;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
public class Hooks {
   public static WebDriver driver ;
    @Before
    public void open_browser() throws InterruptedException {
        String ChromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\Browsers\\chromedriver.exe";
        System.out.println(ChromePath);
        System.setProperty("webdriver.chrome.driver", ChromePath);
        driver = new ChromeDriver();
         driver.navigate().to("https://demo.nopcommerce.com/");
//        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // create object
    }
    @After
   public void quitDriver() throws InterruptedException {
Thread.sleep(3000);
driver.quit();
 }


}
