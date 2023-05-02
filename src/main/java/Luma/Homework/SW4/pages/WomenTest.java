package Luma.Homework.SW4.pages;

import Luma.Homework.SW4.utilities.Utility;
import org.openqa.selenium.By;

public class WomenTest extends Utility {


    By womenMenuobj = By.cssSelector("a[id='ui-id-4'] span:nth-child(1)");

    By womenTopsobj = By.cssSelector("a[id='ui-id-9'] span:nth-child(1)");

    By womenJacketobj = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");

    By womenProductNameFilterobj = By.xpath("(//select[@id='sorter'])[1]");

    // Mouse Hover on Women Menu
    public void womenMenu() {
        mouseHoverToElement(womenMenuobj);
    }

    // Mouse Hover on Tops
    public void womenTops() {
        mouseHoverToElement(womenTopsobj);
    }

    // Click on Jackets
    public void womenJacketobj() {
        mouseHoverToElementAndClick(womenJacketobj);
    }

    //Select Sort By filter “Product Name”
    public void womenProductNameFilter(String text){
        selectByVisibleTextFromDropDown(womenProductNameFilterobj,text);
    }

}
