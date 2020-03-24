package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils {
    private By _registerLInk = By.linkText("Register");
    private By _jewelryLink = By.xpath("//ul[contains(@class,'notmobile')]//li//a[contains(text(),'Jewelry')]");
    private By _computer = By.linkText("Computers");
    private By _viewNewsArchive = By.xpath("//a[contains(text(),'Archive')]");




    // verify that user click on register button
    public void clickonregisterbutton()  {
        sleep(1);
        clickOnElement(_registerLInk);
    }
      // verify user is on home page
    public void verifyUserIsOnHomePage()
    {
        assertURL("demo.nopcommerce");
    }
    //verify that user click on jewellery category
    public void clickOnJewellery()
    {
        clickOnElement(_jewelryLink);
    }
    //verify that user click on computer category
    public void clickOnComputerCategory()
    {
        clickOnElement(_computer);
    }
    //verify that user click on News Archive
    public void clickOnViewNewsArchive()
    {
        clickOnElement(_viewNewsArchive);
    }




}
