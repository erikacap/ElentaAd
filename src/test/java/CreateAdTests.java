import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.time.Duration;

public class CreateAdTests {
    public static WebDriver driver;
    public static WebDriverWait wait;

    @Test
    public void createAdPossitiveTestUntilPhoto() {
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
            txt = driver.findElement(By.xpath("//*[@id=\"fileinput-label\"]/span")).getText();
        } catch (Exception e) {
        }
        Assert.assertEquals(txt, "įkelkite nuotraukas");
    }

    @Test
    public void createAdWithoutTitleTest() {
        driver.get("https://elenta.lt/patalpinti/ivesti-informacija?categoryId=BuitisLaisvalaikis_DrabuziaiAvalyne&actionId=Siulo&returnurl=%2F");
        driver.findElement(By.id("title")).sendKeys("");
        driver.findElement(By.id("text")).sendKeys("Parduodama labai geros būklės šokių suknelė. Dydis 116. Tinka šokių varžyboms.");
        driver.findElement(By.id("price")).sendKeys("35");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+37060000000");
        driver.findElement(By.id("email")).sendKeys("viltet32@gmail.com");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("submit-button")));
        driver.findElement(By.id("submit-button")).click();
        String txt = "";
        try {
            txt = driver.findElement(By.xpath("//*[@id=\"te\"]")).getText();
        } catch (Exception e) {
        }
        Assert.assertEquals(txt, "Įveskite skelbimo pavadinimą");
    }

    @Test
    public void createAdWithoutDescriptionTest() {
        driver.get("https://elenta.lt/patalpinti/ivesti-informacija?categoryId=BuitisLaisvalaikis_DrabuziaiAvalyne&actionId=Siulo&returnurl=%2F");
        driver.findElement(By.id("title")).sendKeys("Suknelė");
        driver.findElement(By.id("text")).sendKeys("");
        driver.findElement(By.id("price")).sendKeys("35");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+37060000000");
        driver.findElement(By.id("email")).sendKeys("viltet32@gmail.com");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("submit-button")));
        driver.findElement(By.id("submit-button")).click();
        String txt = "";
        try {
            txt = driver.findElement(By.xpath("//*[@id=\"txte\"]")).getText();
        } catch (Exception e) {
        }
        Assert.assertEquals(txt, "Įveskite skelbimo aprašymą");
    }

    @Test
    public void createAdWithoutPhoneNoTest() {
        driver.get("https://elenta.lt/patalpinti/ivesti-informacija?categoryId=BuitisLaisvalaikis_DrabuziaiAvalyne&actionId=Siulo&returnurl=%2F");
        driver.findElement(By.id("title")).sendKeys("Suknelė");
        driver.findElement(By.id("text")).sendKeys("Parduodama labai geros būklės šokių suknelė. Dydis 116. Tinka šokių varžyboms.");
        driver.findElement(By.id("price")).sendKeys("35");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("");
        driver.findElement(By.id("email")).sendKeys("viltet32@gmail.com");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("submit-button")));
        driver.findElement(By.id("submit-button")).click();
        String txt = "";
        try {
            txt = driver.findElement(By.xpath("//*[@id=\"ce\"]")).getText();
        } catch (Exception e) {
        }
        Assert.assertEquals(txt, "Įveskite telefono numerį");
    }

    @Test
    public void createAdWithShortPhoneNoTest() {
        driver.get("https://elenta.lt/patalpinti/ivesti-informacija?categoryId=BuitisLaisvalaikis_DrabuziaiAvalyne&actionId=Siulo&returnurl=%2F");
        driver.findElement(By.id("title")).sendKeys("Suknelė");
        driver.findElement(By.id("text")).sendKeys("Parduodama labai geros būklės šokių suknelė. Dydis 116. Tinka šokių varžyboms.");
        driver.findElement(By.id("price")).sendKeys("35");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+3706888");
        driver.findElement(By.id("email")).sendKeys("viltet32@gmail.com");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("submit-button")));
        driver.findElement(By.id("submit-button")).click();
        String txt = "";
        try {
            txt = driver.findElement(By.xpath("//*[@id=\"pe\"]")).getText();
        } catch (Exception e) {
        }
        Assert.assertEquals(txt, "Blogas tel. numeris");
    }

    @Test
    public void createAdWithoutEmailServerTest() {
        driver.get("https://elenta.lt/patalpinti/ivesti-informacija?categoryId=BuitisLaisvalaikis_DrabuziaiAvalyne&actionId=Siulo&returnurl=%2F");
        driver.findElement(By.id("title")).sendKeys("Suknelė");
        driver.findElement(By.id("text")).sendKeys("Parduodama labai geros būklės šokių suknelė. Dydis 116. Tinka šokių varžyboms.");
        driver.findElement(By.id("price")).sendKeys("35");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+37060000000");
        driver.findElement(By.id("email")).sendKeys("viltet32gmail.com");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("submit-button")));
        driver.findElement(By.id("submit-button")).click();
        String txt = "";
        try {
            txt = driver.findElement(By.xpath("//*[@id=\"ee\"]")).getText();
        } catch (Exception e) {
        }
        Assert.assertEquals(txt, "Blogas el. pašto adresas");
    }

    @Test
    public void createAdWithMaxLengthEmailTest() {
        driver.get("https://elenta.lt/patalpinti/ivesti-informacija?categoryId=BuitisLaisvalaikis_DrabuziaiAvalyne&actionId=Siulo&returnurl=%2F");
        driver.findElement(By.id("title")).sendKeys("Suknelė");
        driver.findElement(By.id("text")).sendKeys("Parduodama labai geros būklės šokių suknelė. Dydis 116. Tinka šokių varžyboms.");
        driver.findElement(By.id("price")).sendKeys("35");
        driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        driver.findElement(By.id("phone")).sendKeys("+37060000000");
        driver.findElement(By.id("email")).sendKeys("viltet3244444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("submit-button")));
        driver.findElement(By.id("submit-button")).click();
        String txt = "";
        try {
            txt = driver.findElement(By.xpath("//*[@id=\"ee\"]")).getText();
        } catch (Exception e) {
        }
        Assert.assertEquals(txt, "Blogas el. pašto adresas");
    }

    @BeforeClass
    public void before() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        acceptCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void acceptCookies() {
        driver.get("https://elenta.lt/");
        driver.findElement(By.className("fc-button-label")).click();
    }

    @AfterClass
    public void after() {
        driver.quit();
    }
}
