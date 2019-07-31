package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myclass {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver",
                "/Users/nurimanuyghur/documents/SeleniumStuff/Drivers/chromedriver");


        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");

        WebElement input = driver.findElement(By.id("twotabsearchtextbox"));
        input.sendKeys("hairspay");

        driver.findElement(By.className("nav-input")).click();


        driver.close();




    }
}
