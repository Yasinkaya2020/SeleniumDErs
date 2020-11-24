package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitleAndURL {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sila0\\Documents\\selenium\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //Google sayfasina gidelim
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        //Sayfa basliginin (title) "google" oldugunu dogrulayin
         String actualResult=driver.getTitle();
         String expectedResult="google";

         if (actualResult.equals(expectedResult)){
             System.out.println("Page title testi PASS");
         }else {
             System.out.println("Page atitle testi FAILED");
             System.out.println("Actual Page Title :" + actualResult);
         }
         //NAVIGAETE TO youtube HOMEPAGE https://www.youtube.com
        driver.navigate().to("https://www.youtube.com");
        String actualURL=driver.getCurrentUrl();

        //Verify if youtube homepage is"www.youtube.com"(beklenen sonuc)
        //aktuel url=https://www.youtube.com beklenen url=www.youtube.com
        String expectedURL="www.youtube.com";

        if (actualURL.equals(expectedURL)){
            System.out.println("URL testi PASS");
        }else {
            System.out.println("URL testi FAILED");
            System.out.println("Actual URL:"+actualURL);
        }






         driver.close();
    }

}
