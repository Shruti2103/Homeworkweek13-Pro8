package homepage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.Utility;

public class TopMenuTest extends Utility {

    String baseUrl = "https://mobile.x-cart.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserShouldNavigateToShippingPageSuccessfully() {
        //        1.1 Click on the “Shipping” link
        clickOnElement(By.xpath("(//span[contains(text(),'Shipping')])[2]"));
        //  1.2 Verify the text “Shipping”
        verrifyingText("Shipping", By.xpath("(//span[contains(text(),'Shipping')])[2]\")"), "Error, Message not displayed as expected");


    }

    @Test
    public void verifyUserShouldNavigateToNewPageSuccessfully() {
        //2.1 Click on the “New!” link
        clickOnElement(By.xpath("(//span[contains(text(),'New!')])[2]"));
        //2.2 Verify the text “New arrivals”
        verrifyingText("New arrivals", By.xpath("//h1[contains(text(),'New arrivals')]"), "Eror Message not Displyed ");


    }

    @Test
    public void verifyUserShouldNavigateToComingsoonPageSuccessfully() {
        //3.1 Click on the “Coming soon” link
        clickOnElement(By.xpath("(//span[contains(text(),'Coming soon')])[2]"));
        //3.2 Verify the text “Coming soon”
        verrifyingText("Coming soon", By.xpath("//h1[@class='title' and @ id='page-title']"), "Error Message not displayed");
    }

    @Test
    public void verifyUserShouldNavigateToContactUsPageSuccessfully() {
        //4.1 Click on the “Contact us” link
        clickOnElement(By.xpath("(//span[contains(text(),'Contact us')])[2]"));
        //4.2 Verify the text “Contact us
        verrifyingText("Contact us", By.xpath("//h1[contains(text(),'Contact us')]"), "Message not displayed as expecte");


    }

    @After
    public void tearDown() {
        closeBrowser();
    }


}
