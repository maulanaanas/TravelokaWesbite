import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PageObject {

    WebDriver webDriver;
    WebDriverWait wait;

    LocalDate today = LocalDate.now();
    LocalDate targetPickUpDate = today.plusDays(2);
    LocalDate targetDropOffDate = today.plusDays(3);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d");
    String targetPickUpDateStr =  targetPickUpDate.format(formatter);
    String targetDropOffDateStr = targetDropOffDate.format(formatter);

    public PageObject(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    By carsProduct = By.xpath("//div[@data-testid='product-pill-Rental Mobil']");
    By withoutDriverTab = By.xpath("//h4[normalize-space()='Tanpa Sopir']");
    By pickUpLocationField = By.xpath("//input[@data-testid='rental-search-form-location-input']");
    By pickUpLocationFieldConfirm = By.xpath("//div[@aria-label='Jakarta']//h3[@role='heading']");
    By pickUpDate = By.xpath("//input[@data-testid='rental-search-form-date-input-start']");
    By pickUpTime = By.xpath("//input[@data-testid='rental-search-form-time-input-start']");
    By confirmPickUpTime = By.xpath("//div[@class='css-1dbjc4n r-391gc0 r-1loqt21 r-1777fci r-tuq35u r-1otgn73 r-1i6wzkk r-lrvibr']//div[@class='css-901oao r-cwxd7f r-a5wbuh r-1b43r93 r-majxgm r-rjixqe r-q4m81j'][normalize-space()='9']");

    By donePickUpTime = By.xpath("//div[@class='css-901oao r-a5wbuh r-cygvgh r-b88u0q r-1iukymi r-q4m81j']");
    By dropOffDate = By.xpath("//input[@data-testid='rental-search-form-date-input-end']");
    By dropOffTime = By.xpath("//input[@data-testid='rental-search-form-time-input-end']");
    By confirmDropOffTime = By.xpath("//div[@class='css-1dbjc4n r-18u37iz r-xyw6el']//div[@class='css-1dbjc4n r-1loqt21 r-1777fci r-tuq35u r-1otgn73 r-1i6wzkk r-lrvibr']/div[.='11']");
    By doneDropOffTime = By.xpath("//div[@class='css-901oao r-a5wbuh r-cygvgh r-b88u0q r-1iukymi r-q4m81j']");
    By searchCarButton = By.xpath("//div[@data-testid='rental-search-form-cta']");
    By carProviderButton = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]/div[8]/div[1]/div[2]/div[1]");
    By carProviderList = By.xpath("//body/div[@id='__next']/div[@class='css-1dbjc4n r-1ihkh82']/div[@class='css-1dbjc4n r-1kihuf0 r-169s5xo r-uwe93p r-136ojw6']/div[@class='css-1dbjc4n r-1wzrnnt']/div[@class='css-1dbjc4n r-18u37iz r-1wtj0ep r-1ifxtd0 r-1g40b8q']/div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1h0z5md']/div[@class='css-1dbjc4n']/div[@class='css-1dbjc4n r-vmmdp4 r-1addiju r-nvplwv r-14lw9ot r-kdyh1x r-b4qz5r r-6koalj r-1d2f490 r-ek4qxl r-1udh08x r-95jzfe r-u8s1d r-9dmdro']/div[@class='css-1dbjc4n r-150rngu r-eqz5dr r-16y2uox r-1wbh5a2 r-1s2bzr4 r-1pxuy4t r-11yh6sk r-1rnoaur r-1sncvnh']/div[@class='css-1dbjc4n']/div[@class='css-1dbjc4n r-ymttw5 r-1f1sjgu']/div[1]/div[1]");
    By continueButton = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[5]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[3]/div[1]/div[2]/div[1]");
    By continueButtonProductDetail = By.xpath("//div[@class='css-901oao css-bfa6kz r-jwli3a r-a5wbuh r-cygvgh r-b88u0q r-1iukymi r-q4m81j'][normalize-space()='Lanjutkan']");
    By pickUpLocation = By.xpath("//div[@class='css-901oao r-a5wbuh r-majxgm r-fdjqy7'][normalize-space()='Kantor Rental']");
    By kantorRental = By.xpath("//div[@class='css-901oao css-bfa6kz r-13awgt0 r-a5wbuh r-majxgm r-1m04atk r-fdjqy7']");
    By alamSutera = By.xpath("//div[contains(text(),'Pool Smart Rent Car Tangerang (Mall Alam Sutera)')]");
    By dropOffLocation = By.xpath("//div[@class='css-1dbjc4n r-14lw9ot r-kdyh1x r-b4qz5r r-1ifxtd0 r-nsbfu8 r-184en5c']//div[@class='css-901oao r-a5wbuh r-majxgm r-fdjqy7'][normalize-space()='Lokasi Lainnya']");
    By dropOffLocationField = By.xpath("//div[@class='css-1dbjc4n r-14lw9ot r-kdyh1x r-da5iq2']//div[@class='css-1dbjc4n']//div[@class='css-1dbjc4n']//input[@placeholder='Cari lokasi atau alamat']");
    By confirmDropOffLocationField = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]");
    By buttonBookNow = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[5]/div[3]/div[1]/div[2]/div[1]");


    public void rentACarWithoutDriver() throws InterruptedException {
        webDriver.findElement(carsProduct).click();
//        webDriver.findElement(withoutDriverTab).click();
        Thread.sleep(2000);
        webDriver.findElement(pickUpLocationField).sendKeys("Jakarta");
        webDriver.findElement(pickUpLocationFieldConfirm).click();

        webDriver.findElement(pickUpDate).click();
        Thread.sleep(2000);
        String dataTestIdPickUp = "date-cell-" + targetPickUpDate.format(DateTimeFormatter.ofPattern("d-M-yyyy"));
        WebElement dateCellPickUp = webDriver.findElement(By.cssSelector("div[data-testid='" + dataTestIdPickUp + "']"));
        dateCellPickUp.click();

        webDriver.findElement(pickUpTime).click();
        Thread.sleep(2000);
        webDriver.findElement(confirmPickUpTime).click();
        Thread.sleep(2000);
        webDriver.findElement(donePickUpTime).click();

        webDriver.findElement(dropOffDate).click();
        Thread.sleep(2000);
        String dataTestIdDropOff = "date-cell-" + targetDropOffDate.format(DateTimeFormatter.ofPattern("d-M-yyyy"));
        WebElement dateCellDropOff = webDriver.findElement(By.cssSelector("div[data-testid='" + dataTestIdDropOff + "']"));
        Thread.sleep(2000);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) webDriver;
        jsExecutor.executeScript("arguments[0].click();", dateCellDropOff);

        webDriver.findElement(dropOffTime).click();
        Thread.sleep(2000);
        webDriver.findElement(confirmDropOffTime).click();
        Thread.sleep(2000);
        webDriver.findElement(doneDropOffTime).click();
        Thread.sleep(2000);
        webDriver.findElement(searchCarButton).click();
        Thread.sleep(5000);
        webDriver.findElement(carProviderButton).click();
        Thread.sleep(2000);
        webDriver.findElement(carProviderList).click();
        Thread.sleep(2000);
        webDriver.findElement(carProviderButton).click();
        Thread.sleep(2000);
        webDriver.findElement(continueButton).click();
        Thread.sleep(2000);
        webDriver.findElement(continueButtonProductDetail).click();
        Thread.sleep(5000);
        webDriver.findElement(pickUpLocation).click();
        Thread.sleep(2000);
        webDriver.findElement(kantorRental).click();
        Thread.sleep(2000);
        webDriver.findElement(alamSutera).click();
        Thread.sleep(2000);
        webDriver.findElement(dropOffLocation).click();
        Thread.sleep(2000);
        webDriver.findElement(dropOffLocationField).click();
        Thread.sleep(2000);
        webDriver.findElement(confirmDropOffLocationField).click();
        Thread.sleep(5000);
        webDriver.findElement(buttonBookNow).click();
        Thread.sleep(5000);

    }

}
