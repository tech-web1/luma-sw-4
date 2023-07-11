package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.MenPage;
import com.softwaretestingboard.magento.testbase.BaseTest;

public class MenTest extends BaseTest {

    MenPage menPage=new MenPage();

    public void userShouldAddProductSuccessFullyToShoppingCart(){
        //* Mouse Hover on Men Menu
        menPage.mouseHoverOnMenMenu();
        //* Mouse Hover on Bottoms
        menPage.mouseHoverOnMenBottoms();
        //* Click on Pants
        menPage.clickOnPants();
        //* Mouse Hover on product name
        menPage.mouseHoverAndClick();
        //‘Cronus Yoga Pant’ and click on size 32.
        menPage.clickOnSize();
        //* Mouse Hover on product name Cronus Yoga Pant and click on colour Black.
        menPage.clickOnColour();
        //* Mouse Hover on product name Cronus Yoga Pant and click on Add To Cart Button.
        menPage.addToCartButton();
        //* Verify the text
        //‘You added Cronus Yoga Pant to your shopping cart.’
        //* Click on ‘shopping cart’ Link into
        menPage.clickOnShoppingCart();

        //message
        //* Verify the text ‘Shopping Cart.’
        //* Verify the product name ‘Cronus Yoga Pant’
        //* Verify the product size ‘32’
        //* Verify the product colour ‘Black’

    }
}
