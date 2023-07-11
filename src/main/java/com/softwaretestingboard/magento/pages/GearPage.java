package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class GearPage extends Utility {
    By GearMenu=By.xpath("//span[normalize-space()='Gear']");
    By Bags=By.xpath("//span[normalize-space()='Bags']");

    By Duffle=By.xpath("//a[normalize-space()='Overnight Duffle'");

    By Cart=By.xpath("//button[@id='product-addtocart-button']");

    By ShoppingCart=By.xpath("//a[normalize-space()='shopping cart']");








    public void mouseHoverOnGearMenu(){
        mouseHoverToElement(GearMenu);
    }
    public void mouseHoverToElementAndClick(){
        mouseHoverToElementAndClick(Bags);
    }

    public void clickOnProduct(){
        clickOnElement(Duffle);
    }
    public void addToCartButton(){
        clickOnElement(Cart);
    }
    public void shoppingCartLink(){
        clickOnElement(ShoppingCart);
    }
}
