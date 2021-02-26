package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleSearchTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sila0\\Documents\\selenium\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
       // 1. Bir class oluşturun : GoogleSearchTest
        //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
          //      a.google web sayfasına gidin. https://www.google.com/
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //b. Search(ara) “city bike”
        WebElement searchGoogle=driver.findElement(By.name("q"));
        String aranankelime=("city bike");
        searchGoogle.sendKeys(aranankelime+Keys.ENTER);


        //c. Google'da görüntülenen ilgili sonuçların sayısını yazdırın
        WebElement goruntulemeSayi=driver.findElement(By.id("result-stats"));
        System.out.println("city bank icin bulunan arama sonucu "+goruntulemeSayi.getText());
        //d. “Shopping” e tıklayın.
        WebElement shoppingGoogle=driver.findElement(By.linkText("Alışveriş"));
        shoppingGoogle.click();
        //e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
        WebElement ilkUrun=driver.findElement(By.className("sh-np__product-title"));
        ilkUrun.click();

        Thread.sleep(7000);


        driver.quit();
    }


}
