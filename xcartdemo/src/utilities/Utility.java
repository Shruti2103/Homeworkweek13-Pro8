package utilities;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utility extends BaseTest {

    // This method will click on element
    public void clickOnElement(By by){
        WebElement link=driver.findElement(by);

    }
    // This method will get text from element
    public String getTextFromElement(By by){
        return driver.findElement(by).getText();
    }
   // This method will sendKeys in to element
    public void sendKeysToElement(By by,String text){
        driver.findElement(by).sendKeys(text);
    }
    //This method for visible text in dropdown
    public void selectByvisibleTextFromDropDown(By by, String text){
        WebElement dropDown =driver.findElement(by);
        Select select= new Select(dropDown);
        select.selectByVisibleText(text);


    }
    //This method for value from dropdown

       public void selectByValueFromDropDown(By by,String text){
         WebElement dropDown=driver.findElement(by);
         Select select=new Select(dropDown);
         select.selectByValue(text);

       }

      // This method is for mouseHoover on element
    public void mouseHooverToElement(By by){
        Actions actions=new Actions(driver);
        actions.moveToElement(driver.findElement(by)).perform();



    }
      // This method will verify text displayed on web page
      public void verrifyingText(String expectedMessage, By by, String displayMessage){
        String actualMessage=getTextFromElement(by);
          Assert.assertEquals(displayMessage,expectedMessage,actualMessage);



      }
    // This method will mouse hover and click the element
    public void mouseHoverAndClick(By by) throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement mouseHoover = driver.findElement(by);
        Thread.sleep(3000);
        actions.moveToElement(mouseHoover).click().build().perform();
    }
    //This method will remove alert
    public String alertText(){
        Alert alert = driver.switchTo().alert(); //Creating Alert object reference and switch to alert
        return alert.getText();
    }
    public void alertHandle(){
        Alert alert = driver.switchTo().alert(); //Creating Alert object reference and switch to alert
        alert.accept();
    }



}
