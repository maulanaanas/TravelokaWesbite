import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumTest {

    WebDriver webDriver;

    @Before
    public void openWebBrowser(){
        ChromeOptions chrome_options = new ChromeOptions();
        chrome_options.addArguments("--remote-allow-origins=*");
        System.out.println("Before Test");

        System.setProperty("webdriver.chrome.driver", "C:\\ANAS\\chromedriver.exe");
        webDriver = new ChromeDriver(chrome_options);

        webDriver.manage().window().maximize();
        webDriver.get("https://www.traveloka.com/id-id");

    }

    @Test
    public void testTraveloka() throws InterruptedException {
        PageObject pageObject = new PageObject(webDriver);
        Assert.assertEquals("Traveloka - Diskon s.d Rp1 Juta Tiket Pesawat, Hotel & Aktivitas", webDriver.getTitle());

        pageObject.rentACarWithoutDriver();
//        Thread.sleep(2000);
//        Assert.assertEquals("KoltiTrade | Koltiva", webDriver.getTitle());
//        Thread.sleep(2000);
    }

    @After
    public void closeWebBrowser(){
//        webDriver.quit();
    }
}
