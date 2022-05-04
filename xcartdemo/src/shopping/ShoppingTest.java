package shopping;

import com.google.common.base.Verify;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Mouse;
import utilities.Utility;

public class ShoppingTest extends Utility  {
      String baseUrl="https://mobile.x-cart.com";

      @Before
    public void setUp(){
          openBrowser(baseUrl);
      }
     @Test
    public void  verifyThatUserShouldPlaceOrderSuccessfullyForOllieTheAppControlledRobot() throws InterruptedException {

//    1.1 Mouse hover on the “Hot deals” link
         mouseHooverToElement(By.xpath("\"//ul[@class='nav navbar-nav top-main-menu']//span[@class='primary-title' and text()='Hot deals']"));

//		1.2 Mouse hover on the “Bestsellers”  link and click
         mouseHooverToElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[2]/a[1]/span[1]"));
         clickOnElement(By.xpath("(//span[contains(text(),'Bestsellers')])[2]"));
//		1.3 Verify the text “Bestsellers”
         verrifyingText("Bestsellers",By.xpath("//h1[@id='page-title']"), "Not displayed");
//            1.4 Mouse hover on “Sort By” and select “Name A-Z”
         mouseHooverToElement(By.xpath("//span[contains(text(),'Sort by:')]"));
         clickOnElement(By.xpath("//a[contains(text(),'Name A - Z')]"));
         Thread.sleep(2000);
//            1.5 Click on “Add to cart” button of the product “Ollie - The App Controlled Robot”
         clickOnElement(By.xpath("\\\"//button[contains(@class,'regular-button add-to-cart product-add2cart productid-16')]//span[contains(text(),'Add to cart')]"));
//            1.6 Verify the message “Product has been added to your cart” display in  green bar
         verrifyingText("Product has been added to your cart",By.xpath("//li[@class='info']"),"Error message not displayed as expected");
//1.7 Click on X sign to close the message
         clickOnElement(By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[1]/div[1]/div[1]/ul[1]"));
//1.8 Click on “Your cart” icon and Click on “View cart” button
         clickOnElement(By.xpath("//div[@title='Your cart']"));
         clickOnElement(By.xpath("//span[text()='View cart"));
         Thread.sleep(2000);
//1.9 Verify the text “Your shopping cart - 1 item”
         clickOnElement(By.xpath("//a[@class='regular-button cart']"));
         verrifyingText("Your shopping cart - 1 item",By.xpath("//h1[contains(text(),'Your shopping cart - 1 item"),"Product is  not displayed as expected");
//            1.10 Verify the Subtotal $99.00
         verrifyingText("Subtotal",By.xpath("//div[@class='subtotal']//span[@class='surcharge']"),"Subtotal is not correct");
//            1.11 Verify the total $106.23
         verrifyingText("$20.75",By.xpath("//li[@class='total']"),"Incorrect Total Amount");
//            1.12 Click on “Go to checkout” button
         clickOnElement(By.xpath("//span[contains(text(),'Go to checkout')]"));
//1.13 Verify the text “Log in to your account”
         verrifyingText("Log in to your account",By.xpath("//h3[contains(text(),'Log in to your account')]"),"Message is not displayed as expected");
//            1.14 Enter Email address
         sendKeysToElement(By.id("email"),"abc123@gmail.com");
//1.15 Click on “Continue” Button
         clickOnElement(By.xpath("//span[contains(text(),'Continue')]"));
//1.16 Verify the text “Secure Checkout”
         verrifyingText("Secure Checkout",By.xpath("//h1[contains(text(),'Secure Checkout')]"),"Message not displayed as expected");
//            1.17 Fill all the mandatory fields
         sendKeysToElement(By.id("shippingaddress-firstname"), "Tom");
        sendKeysToElement(By.id("shippingaddress-lastname"), "Patel");
         sendKeysToElement(By.id("shippingaddress-street"), "10 Wall Street");
         sendKeysToElement(By.xpath("//input[@id='shippingaddress-city']"), "London");
         selectByValueFromDropDown(By.id("shippingaddress-country-code"), "United Kingdom");
         sendKeysToElement(By.id("shippingaddress-custom-state"), "West Midlands");
         sendKeysToElement(By.id("shippingaddress-zipcode"), "3521");
//1.18 Check the check box “Create an account for later use”
         clickOnElement(By.id("create_profile"));
//            1.19 Enter the password
         sendKeysToElement(By.id("password"), "abc123");
//1.20 Select the Delivery Method to “Local Shipping”
         clickOnElement(By.id("method128"));
//            1.21 Select Payment Method “COD”
         clickOnElement(By.id("pmethod6"));
//            1.22 Verify the total $20.75
         verrifyingText("Place order: $20.75",By.xpath("//span[contains(text(),'$20.75')]"),"Error, Total amount is not displayed as expected");
//            1.23 Click on “Place Order” Button
         clickOnElement(By.xpath("//button[@class='btn regular-button regular-main-button place-order submit']"));
         Thread.sleep(1000);
//1.24 Verify the text “Thank you for your order”
         verrifyingText("Thank you for your order", By.id("page-title"), "Error, Page Title not displayed as expected");


    }
     @Test

    public void  verifyThatUserShouldClearShoppingCartSuccessfully() throws InterruptedException {
//		1.1 Mouse hover on the “Hot deals” link
         mouseHooverToElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[@class='primary-title' and text()='Hot deals']"));

//		1.2 Mouse hover on the “Bestseller”  link and click
         mouseHooverToElement(By.xpath("//span[contains(text(),'Bestsellers')])"));
         clickOnElement(By.xpath("//h1[@id='page-title']"));
//		1.3 Verify the text “Bestsellers”
         verrifyingText("Bestsellers",By.xpath("//h1[contains(text(),'Bestsellers')]"),"Message is not displayed as expected");
//            1.4 Mouse hover on “Sort By” and select “Name A-Z”
         mouseHooverToElement(By.xpath("//span[@class='sort-by-label']"));
         clickOnElement(By.xpath("//a[contains(text(),'Name A - Z')]"));
         Thread.sleep(3000);
//            1.5 Click on “Add to cart” button of the product “Vinyl Idolz: Ghostbusters”
         mouseHooverToElement(By.xpath("//a[@class='product-thumbnail next-previous-assigned'])"));
         clickOnElement(By.xpath("//button[contains(@class,'regular-button add-to-cart product-add2cart productid-13')]"));
//            1.6 Verify the message “Product has been added to your cart” display in  green bar
         verrifyingText("Product has been added to your cart",By.xpath("//li[@class='info']"),"Message is not displayed as expected");
//1.7 Click on X sign to close the message
         clickOnElement(By.xpath("/li[contains(text(),'Product has been added to your cart')]"));
//1.8 Click on “Your cart” icon and Click on “View cart” button
         clickOnElement(By.xpath("//div[@title='Your cart']"));
         clickOnElement(By.xpath("//span[contains(text(),'View cart')]"));
         Thread.sleep(1000);
//1.9 Verify the text “Your shopping cart - 1 item”
         clickOnElement(By.xpath("//a[@class='regular-button cart']"));
         verrifyingText("Your shopping cart - 1 item",By.xpath("//h1[@id='page-title']"),"Product is not displayed as expected");
//            1.10 Click on “Empty your cart” link
         clickOnElement(By.xpath("//a[contains(text(),'Empty your cart')]"));
//1.11 Verify the text “Are you sure you want to clear your cart?” on alert
//1.11 Verify the text “Are you sure you want to clear your cart?” on alert
         String actualMessage3 = alertText();
         String expectedMessage3 = "Are you sure you want to clear your cart?";
         Assert.assertEquals("Not navigate to page", expectedMessage3, actualMessage3);

         //1.12 Click “Ok” on alert
         alertHandle();
         Thread.sleep(1000);

         //1.13 Verify the message “Item(s) deleted from your cart”
         String actualMessage4 = getTextFromElement(By.xpath("//li[text()='Item(s) deleted from your cart']"));
         String expectedMessage4 = "Item(s) deleted from your cart";
         Assert.assertEquals("Not navigate to page", expectedMessage4, actualMessage4);

         //1.15 Verify the text “Your cart is empty”
         Thread.sleep(800);
         String actualMessage5 = getTextFromElement(By.xpath("//h1[text()='Your cart is empty']"));
         String expectedMessage5 = "Your cart is empty";
         Assert.assertEquals("Not navigate to page", expectedMessage5, actualMessage5);


     }

}
