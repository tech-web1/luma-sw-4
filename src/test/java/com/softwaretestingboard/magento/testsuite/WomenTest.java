package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.WomenPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.annotations.Test;

public class WomenTest extends BaseTest {
    WomenPage womenPage=new WomenPage();

    @Test
    public void verifyTheSortByProductNameFilter(){
        //* Mouse Hover on Women Menu
        womenPage.mouseHoverOnWomenMenu();

        //* Mouse Hover on Tops
        womenPage.mouseHoverOnTops();

        //* Click on Jackets
        womenPage.clickOnJacket();

        //* Select Sort By filter “Product Name”
        womenPage.selectProduct();

        //* Verify the products name display in alphabetical order
    }
    @Test
    public void verifyTheSortByPriceFilter(){
        //* Mouse Hover on Women Menu
        womenPage.mouseHoverOnWomenMenu();

        //* Mouse Hover on Tops
        womenPage.mouseHoverOnTops();

        //* Click on Jackets
        womenPage.clickOnJacket();

        //Select sort By filter Price
        womenPage.selectProductPrice();


    }

}
