package hotdeals;

import com.google.common.base.Verify;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Mouse;
import utilities.Utility;

public class HotDealsTest extends Utility {
    String baseUrl = "https://mobile.x-cart.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifySaleProductsArrangeAlphabetically() throws InterruptedException{
        // 1.1 Mouse hover on the “Hot deals” link
        Thread.sleep(600);
        mouseHooverToElement(By.xpath(("//li[@class='leaf has-sub']//span[text()='Sale']")));
        //  1.2 Mouse hover on the “Sale”  link and click
        Thread.sleep(1000);
        clickOnElement(By.xpath("//li[@class='leaf has-sub']//span[text()='Sale']"));
        //Verify the text “Sale”
        verrifyingText("Sale", By.xpath("//h1[@id='page-title']"), "Error, Message not displayed as expected");
        // 1.4 Mouse hover on “Sort By” and select “Name A-Z”
        mouseHooverToElement(By.xpath("//span[@class='sort-by-label']"));
        //1.5 Verify that the product arrange alphabetically
        verrifyingText("Name A-Z", By.id("//span[contains(text(),'Name A - Z')]"), "Error, Message not displayed as expected");

    }

    @Test
    public void verifySaleProductsPriceArrangeLowToHigh() throws InterruptedException {
        //        2.1 Mouse hover on the “Hot deals” link
        mouseHooverToElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]"));
        // 2.2 Mouse hover on the “Sale”  link and click
        mouseHoverAndClick(By.xpath("(//span[contains(text(),'Sale')])[2]"));
        // 2.3 Verify the text “Sale”
        verrifyingText("Sale", By.xpath("//h1[contains(text(),'Sale')]"), "Error, Message not displayed as expected");
        //  2.4 Mouse hover on “Sort By” and select “Price Low-High”
        mouseHoverAndClick(By.xpath("//a[contains(text(),'Price Low - High')]"));
        //  2.5 Verify that the product’s price arrange Low to High
        verrifyingText("Price Low - High", By.xpath("//span[contains(text(),'Price Low - High')]"), "Error, Message not displayed as expected");

    }

    @Test
    public void verifySaleProductsArrangeByRates() throws InterruptedException {

        //  3.1 Mouse hover on the “Hot deals” link
        mouseHooverToElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]"));

//        3.2 Mouse hover on the “Sale”  link and click
        mouseHoverAndClick(By.xpath("(//span[contains(text(),'Sale')])[2]"));

//        3.3 Verify the text “Sale”
        verrifyingText("Sale", By.xpath("//h1[contains(text(),'Sale')]"), "Error, Message not displayed as expected");
//        3.4 Mouse hover on “Sort By” and select “Rates”
        mouseHooverToElement(By.xpath("//span[@class='sort-by-label']"));
        mouseHoverAndClick(By.xpath("//a[contains(text(),'Rates')]"));
//        3.5 Verify that the product’s arrange Rates
        verrifyingText("Rates", By.xpath("//span[contains(text(),'Rates')]"), "Error, Message not displayed as expected");


    }

    @Test

    public void verifyBestSellersProductsArrangeByZToA() throws InterruptedException {
//        1.1 Mouse hover on the “Hot deals” link
        mouseHooverToElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]"));
//        1.2 Mouse hover on the “Bestsellers”  link and click
        mouseHoverAndClick(By.xpath("(//span[contains(text(),'Bestsellers')])[2]"));
//        1.3 Verify the text “Bestsellers”
        verrifyingText("Bestsellers", By.xpath("//h1[contains(text(),'Bestsellers')]"), "Error, Message not displayed as expected");
//        1.4 Mouse hover on “Sort By” and select “Name Z-A”
        mouseHoverAndClick(By.xpath("//a[contains(text(),'Price High - Low')]"));
//        1.5 Verify that the product arrange by Z to A
        verrifyingText("Price High - Low", By.xpath("//span[contains(text(),'Price High - Low')]"), "Error, Message not displayed as expected");


    }

    @Test
    public void verifyBestSellersProductsArrangeByRates() throws InterruptedException {

//		3.1 Mouse hover on the “Hot deals” link
        mouseHooverToElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]"));

//		3.2 Mouse hover on the “Bestsellers”  link and click
        mouseHoverAndClick(By.xpath("(//span[contains(text(),'Bestsellers')])[2]"));
//		3.3 Verify the text “Bestsellers”
        verrifyingText("Bestsellers", By.xpath("//h1[contains(text(),'Bestsellers')]"), "Error, Message not displayed as expected");
//            3.4 Mouse hover on “Sort By” and select “Rates”
        mouseHooverToElement(By.xpath("//span[@class='sort-by-label']"));
        mouseHoverAndClick(By.xpath("//a[contains(text(),'Rates')]"));
//            3.5 Verify that the product’s arrange Rates
        verrifyingText("Rates", By.xpath("//span[contains(text(),'Rates')]"), "Error, Message not displayed as expected");

    }
    @After
    public void tearDown(){
        closeBrowser();
    }

}









