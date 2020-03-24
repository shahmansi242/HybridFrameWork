package org.example;

import org.openqa.selenium.By;

public class Catagories extends Utils {
    private By _noteBooks = By.linkText("Notebooks");
    private By _appleMac = By.linkText("Apple MacBook Pro 13-inch");
    private By _email = By.xpath("//input[contains(@onclick,'/productemailafriend/')]");


    //Verify user on computer catagories page
    public void verifyUserOnComputerCatagoriesPage()
    {
        assertURL("computers");
    }
    // verify user click on notebook
    public void userClickOnNoteBook(){

        clickOnElement(_noteBooks);

    }
    //verify user click on apple mac products
    public void userClickOnAppleMac()

    {
        clickOnElement(_appleMac);
    }
    public void UserClickOnEmailAFriend() {
        //click email refer
        clickOnElement(_email);

    }
}

