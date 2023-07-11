package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class WomenPage extends Utility {
    By womenMenu = By.xpath("//span[normalize-space()='Women']");
    By tops = By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");
    By jacket = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");
    By productFilter = By.xpath("(//select[@id='sorter'])[1]");

    By productPrice=By.xpath("(//select[@id='sorter'])[1])");

    public void mouseHoverOnWomenMenu(){
        mouseHoverToElement(womenMenu);
    }
    public void mouseHoverOnTops(){
        mouseHoverToElement(tops);
    }
    public void clickOnJacket(){
        mouseHoverToElementAndClick(jacket);
    }
    public void selectProduct(){
        selectByVisibleTextFromDropDown(productFilter,"Product Name");
    }
   public void  selectProductPrice(){
        selectByVisibleTextFromDropDown(productPrice,"Price");
   }



}
