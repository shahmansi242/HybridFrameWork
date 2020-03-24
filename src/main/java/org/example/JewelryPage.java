package org.example;

import org.openqa.selenium.By;

public class JewelryPage extends Utils {
    private By _product1 = By.xpath("//input[contains(@onclick, '/compareproducts/add/40')]");
    private By _product2 = By.xpath("//input[contains(@onclick,'/compareproducts/add/41')]");
    private By _comparisonLink = By.xpath("//a[text()='product comparison']");
    private By _product = By.xpath("//input[@value='Add to cart']");
    private By _addtocart = By.xpath("//span[@class='cart-label']");
    private By _checkbox = By.xpath("//input[@id='termsofservice']");
    private By _checkout = By.xpath("//button[@type='submit']");

    //verify that user os on jewelry category page
    public void verifyUserIsOnJewelryPage(){
        assertURL("jewelry");
    }
    // user choose product to compare
    public void chooseProductsToCompare(){
        sleep(2);

        clickOnElement(_product1);
        sleep(2);
        clickOnElement(_product2);
        sleep(2);

        clickOnElement(_comparisonLink);
    }
    // user click on add to cart product
    public void addToCartProduct(){
        sleep(2);
        clickOnElement(_product);

        clickOnElement(_addtocart);
        sleep(2);
        clickOnElement(_checkbox);
        sleep(2);
        clickOnElement(_checkout);

    }


}
