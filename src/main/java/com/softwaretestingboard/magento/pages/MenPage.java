package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class MenPage extends Utility {
    By MenMenu =By.xpath("//span[normalize-space()='Men']");

    By Bottoms=By.xpath("//a[@id='ui-id-18']");

    By Pants=By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");

    By YogaPant=By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    By Size = By.xpath("//div[@class='swatch-option text'])[1]");

    By Colour=By.xpath("//div[@class='swatch-option color'])[1]");

    By Cart=By.xpath("//a[normalize-space()='Cronus Yoga Pant']");

    By ShoppingCart=By.xpath("//a[normalize-space()='shopping cart']");






    public void mouseHoverOnMenMenu(){
        mouseHoverToElement(MenMenu);
    }
    public void mouseHoverOnMenBottoms(){
        mouseHoverToElement(Bottoms);
    }
    public void clickOnPants(){
        mouseHoverToElementAndClick(Pants);
    }
    public void mouseHoverAndClick(){
        mouseHoverToElementAndClick(YogaPant);
    }
    public void clickOnSize(){
        clickOnElement(Size);
    }
    public void clickOnColour(){
        clickOnElement(Colour);
    }
    public  void addToCartButton(){
        mouseHoverToElement(Cart);
    }
    public void clickOnShoppingCart(){
        clickOnElement(ShoppingCart);
    }
}
