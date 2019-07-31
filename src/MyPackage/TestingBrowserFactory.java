package MyPackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    public class TestingBrowserFactory {
        public static void main(String[] args) {
//        WebDriver driver = new ChromeDriver();
            //getDriver is a static method
            //so we don't need to create an object
            //to use that method
            //in order to call static members
            //we use classname not object name
            WebDriver driver = BrowserFactory.getDriver("chrome");
            driver.manage().window().maximize(); // command to maximize browser
            driver.get("http://practice.cybertekschool.com");
        }

}
