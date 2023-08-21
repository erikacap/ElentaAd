import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Adv {
    public static WebDriver driver;
    @Test
    public void sandbox() throws InterruptedException {
        driver.get("https://elenta.lt/patalpinti/ivesti-informacija?categoryId=BuitisLaisvalaikis_DrabuziaiAvalyne&actionId=Siulo&returnurl=%2F");
        WebElement title = driver.findElement(By.id("title"));
        title.sendKeys("Suknelė");
        driver.findElement(By.id("text")).sendKeys("Parduodama labai geros būklės šokių suknelė. Dydis 116. Tinka šokių varžyboms.");
        driver.findElement(By.id("price")).sendKeys("35");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+37060000000");
        driver.findElement(By.id("email")).sendKeys("viltet32@gmail.com");
        driver.findElement(By.id("submit-button")).click();

    }
    @BeforeClass
    public void before() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        acceptCookies();
    }
    public void acceptCookies() {
        driver.get("https://elenta.lt/");
        driver.findElement(By.className("fc-button-label")).click();
    }

}
