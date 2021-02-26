package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sila0\\Documents\\selenium\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
       // 1. Bir class oluşturun : Locators_css
        //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
              //  a. Verilen web sayfasına gidin.
              //  http://a.testaddressbook.com/sign_in
        driver.get("http://a.testaddressbook.com/sign_in");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // b. Locate email textbox
        WebElement emailBox=driver.findElement(By.xpath("//input[@ type='email']"));
        emailBox.sendKeys("testtechproed@gmail.com");
        // c. Locate password textbox ve
        WebElement paswwordBox=driver.findElement(By.xpath("//*[@ placeholder='Password']"));
        paswwordBox.sendKeys("Test1234!");
        // d. Locate signin buttone.
        WebElement signButton=driver.findElement(By.xpath("//input[@ type='submit']"));
        signButton.click();
        // Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesinitıklayıni.
        // Username : testtechproed@gmail.com.
        // Password : Test1234!

        WebElement kullaniciAdi=driver.findElement(By.xpath("//span[@ class='navbar-text']"));
        if (kullaniciAdi.isDisplayed()){
            System.out.println("Kullanici adi testtechproed@gmail.com PASS");
        }else{
            System.out.println("Kullanici adi testtechproed@gmail.com FAILED");
        }


        driver.quit();
    }
}
