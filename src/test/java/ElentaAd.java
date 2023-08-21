import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import java.time.Duration;

public class ElentaAd {
    public static WebDriver driver;
    public static WebDriverWait wait;
    @Test
    public void createAdvWithoutTitle(){
        driver.get("https://elenta.lt/patalpinti/ivesti-informacija?categoryId=BuitisLaisvalaikis_DrabuziaiAvalyne&actionId=Siulo&returnurl=%2F");
        driver.findElement(By.id("title")).sendKeys("Suknelė");
        driver.findElement(By.id("text")).sendKeys("Parduodama labai geros būklės šokių suknelė. Dydis 116. Tinka šokių varžyboms.");
        driver.findElement(By.id("price")).sendKeys("35");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+37060000000");
        driver.findElement(By.id("email")).sendKeys("viltet32@gmail.com");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("submit-button")));
        driver.findElement(By.id("submit-button")).click();
        String txt = "";
        try {
            txt = driver.findElement(By.xpath("//*[@id=\"forward-button\"]")).getText();
            System.out.println(txt);
        }catch(Exception e){
                    }
        Assert.assertEquals(txt,"value=\"toliau (peržiūrėti) »\"");
    }

    @BeforeClass
    public void before(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        acceptCookies();
    }
    public void acceptCookies(){
        driver.get("https://elenta.lt/");
        driver.findElement(By.className("fc-button-label")).click();
    }

    @AfterClass
    public void after(){
//        driver.quit();
    }
}
