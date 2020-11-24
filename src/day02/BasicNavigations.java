package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sila0\\Documents\\selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Youtube sayfasina gidelim
        driver.navigate().to("https://www.youtube.com");
        //Amazon sayfasina gidelim
        driver.navigate().to("https://www.amazon.com");
        //Tekrar youtube gidiniz
        driver.navigate().back();
        //terkrar amazona gidin
        driver.navigate().forward();
        //sayfayi refredh yapalim
        driver.navigate().refresh();
        //tam sayfa yapiniz
        driver.manage().window().maximize();
        //5 saniye beklet
        Thread.sleep(5000);


        driver.close();
    }
}
