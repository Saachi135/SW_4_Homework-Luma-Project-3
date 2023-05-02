package Luma.Homework.SW4.pages;

import Luma.Homework.SW4.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class GearTest extends Utility {
    By gearMenu=By.cssSelector("a[id='ui-id-6'] span:nth-child(2)");
    By bags=By.cssSelector("a[id='ui-id-25'] span");
    By nameOvernightDuffle = By.xpath("//a[contains(text(),'Overnight Duffle ')]");
    By textOvernightDuffle = By.xpath("//span[contains(text(),'Overnight Duffle')]");
    By quantity = By.id("qty");
    By addToCartButton = By.id("product-addtocart-button");
    By textaddedDuffle = By.xpath("//div[contains(text(),'You added Overnight Duffle to your ')]");
    By linkShoppingCart=By.xpath("//a[text()='shopping cart']");
    By textCronusYogaPant=By.cssSelector("td[class='col item'] strong[class='product-item-name']");
    By textQuantity3= By.xpath("//input[@title='Qty']");
    By textProductPrice=By.xpath("//td[@class='col subtotal']//span[@class='price']");
    By changeQuantity5=By.cssSelector("td[class='col qty'] input[class*='input-text qty']");
    By updateShoppingCartButton=By.xpath("//span[text()='Update Shopping Cart']");
    By textProductPrice225=By.xpath("//span[@class='cart-price']//span[@class='price'][text()='$225.00']");

    public void hoverOnGearMenu(){
        mouseHoverToElement(gearMenu);
    }
    public void clickOnBags(){
        clickOnElement(bags);
    }
    public void clickOnOvernightDuffle() {
        clickOnElement(nameOvernightDuffle);
    }

    public String getTextOvernightDuffle() {
        return getTextFromElement(textOvernightDuffle);
    }

    public void changeQuantity() {
        sendTextToElement(quantity, Keys.DELETE + "3");
    }

    public void clickOnAddToCartButton() {
        clickOnElement(addToCartButton);
    }

    public String gettextaddedDuffle() {
        return getTextFromElement(textaddedDuffle);
    }

    public void clickOnShoppingCartLink(){
        clickOnElement(linkShoppingCart);
    }

    public String gettextCronusYogaPant() {
        return getTextFromElement(textCronusYogaPant);
    }

    public String getTextQuantity3() {
        return getAttributeValue(textQuantity3,"value");
    }

    public String getTextProductPrice(){
        return getTextFromElement(textProductPrice);
    }

    public void changeQuantityTo5(){
        sendTextToElement(changeQuantity5, Keys.DELETE+"5");
    }

    public void clickOnUpdateShoppingCartButton(){
        clickOnElement(updateShoppingCartButton);
    }

    public String getTextProductPrice225(){
        return getTextFromElement(textProductPrice225);
    }
}
