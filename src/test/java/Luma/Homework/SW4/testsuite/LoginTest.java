package Luma.Homework.SW4.testsuite;

import Luma.Homework.SW4.pages.GearTest;
import Luma.Homework.SW4.pages.MenTest;
import Luma.Homework.SW4.pages.WomenTest;
import Luma.Homework.SW4.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    WomenTest womenTest = new WomenTest();

    MenTest menTest = new MenTest();

    GearTest gearTest = new GearTest();

    @Test
    public void verifyTheSortByProductNameFilter() {

        // Mouse Hover on Men Menu
        womenTest.womenMenu();

        // Mouse Hover on Bottoms
        womenTest.womenTops();

        // Click on Jackets
        womenTest.womenJacketobj();

        // Select Sort By filter “Product Name”
        womenTest.womenProductNameFilter("Product Name");
    }

    @Test
    public void verifyTheSortByPriceFilter() {
        // Mouse Hover on Men Menu
        womenTest.womenMenu();

        // Mouse Hover on Bottoms
        womenTest.womenTops();

        // Click on Jackets
        womenTest.womenJacketobj();

        // Select Sort By filter “Product Name”
        womenTest.womenProductNameFilter("Price");
    }

    @Test
    public void userShouldAddProductSuccessFullyToShoppinCart() {
        //1. userShouldAddProductSuccessFullyToShoppinCart()
        menTest.mouseHoverToMenMenu();                                                                      //* Mouse Hover on Men Menu

        menTest.mouseHoverToMenTops();                                                                      //* Mouse Hover on Bottoms

        menTest.clickOnPants();                                                                             //* Click on Pants

        menTest.hoverAndClickProduct();                                                                      //* Mouse Hover on product name ‘Cronus Yoga Pant’ and click on size 32.

        menTest.hoverAndClickProductColour();                                                                //* Mouse Hover on product name ‘Cronus Yoga Pant’ and click on colour Black.

        menTest.hoverAndClickOnAddToCartButton();                                                            //* Mouse Hover on product name ‘Cronus Yoga Pant’ and click on ‘Add To Cart’ Button.
        Assert.assertEquals(menTest.getTextAddedPantToShoppingCart(), "You added Cronus Yoga Pant to your shopping cart.", "Error");   //* Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’
        menTest.clickOnShoppingCart();                                                                       //* Click on ‘shopping cart’ Link into message
        Assert.assertEquals(menTest.getTextShoppingCart(), "Shopping Cart", "Error");          //* Verify the text ‘Shopping Cart.’
        Assert.assertEquals(menTest.getTextCronusYogaPant(), "Cronus Yoga Pant", "Error");     //* Verify the product name ‘Cronus Yoga Pant’
        Assert.assertEquals(menTest.getTextSize32(), "32", "Error");                           //* Verify the product size ‘32’
        Assert.assertEquals(menTest.getTextBlack(), "Black", "Error");                         //* Verify the product colour ‘Black’
    }

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() {
        //1. userShouldAddProductSuccessFullyToShoppingCart()
        gearTest.hoverOnGearMenu();                                                                          //* Mouse Hover on Gear Menu

        gearTest.clickOnBags();                                                                              //* Click on Bags

        gearTest.clickOnOvernightDuffle();                                                                   //* Click on Product Name ‘Overnight Duffle’
        Assert.assertEquals(gearTest.getTextOvernightDuffle(), "Overnight Duffle", "Error");   //* Verify the text ‘Overnight Duffle’

        gearTest.changeQuantity();                                                                           //* Change Qty 3

        gearTest.clickOnAddToCartButton();                                                                   //* Click on ‘Add to Cart’ Button.
        Assert.assertEquals(gearTest.gettextaddedDuffle(), "You added Overnight Duffle to your shopping cart.", "Error");   //* Verify the text ‘You added Overnight Duffle to your shopping cart.’

        gearTest.clickOnShoppingCartLink();                                                                  //* Click on ‘shopping cart’ Link into message
        Assert.assertEquals(gearTest.gettextCronusYogaPant(), "Overnight Duffle", "Error");    //* Verify the product name ‘Overnight Duffle’
        Assert.assertEquals(gearTest.getTextQuantity3(), "3", "Error");                        //* Verify the Qty is ‘3’
        Assert.assertEquals(gearTest.getTextProductPrice(), "$135.00", "Error");               //* Verify the product price ‘$135.00’
        gearTest.changeQuantityTo5();                                                                        //* Change Qty to ‘5’
        gearTest.clickOnUpdateShoppingCartButton();                                                          //* Click on ‘Update Shopping Cart’ button
        Assert.assertEquals(gearTest.getTextProductPrice225(), "$225.00", "Error");            //* Verify the product price ‘$225.00’
    }
}