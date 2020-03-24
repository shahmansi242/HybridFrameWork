package org.example;

import org.openqa.selenium.By;

public class ProductDetailPage extends Utils {
    private By _noteBooks = By.linkText("Notebooks");
    private By _appleMac = By.linkText("Apple MacBook Pro 13-inch");
    private By _email = By.xpath("//input[contains(@onclick,'/productemailafriend/')]");
    private By _friendEmail = By.xpath("//input[@class='friend-email']");
    private By _yourEmail = By.xpath("//input[@class='your-email']");
    private By _sendEmail = By.xpath("//input[@name = 'send-email']");

    String expectedError = "Only registered customers can use email a friend feature";
    private By _emailErrorMessage = By.xpath("//div[contains(@class,'message-error')]/ul/li");




    //Verify user on computer catagories page
    public void verifyUserOnComputerCatagoriesPage()
    {
        assertURL("computers");
    }
    // user click on notebooks
    public void userClickOnNoteBook(){
        sleep(2);
        clickOnElement(_noteBooks);
    }
    // user click on apple mac
    public void userClickOnAppleMac() {
        sleep(2);

        clickOnElement(_appleMac);
    }
    //Refer to friend
    public void UserReferToFriend() {
        //click email refer
        clickOnElement(_email);
        //Enter friend email id
        enterText(_friendEmail, "amit11@yahoo.co.uk");
        //enter your email id
        enterText(_yourEmail, "radha11@yahoo.co.uk");
        //click send email button
        clickOnElement(_sendEmail);
    }
    public void verifyUserSeeErrorMessage()
    {
        //     assertTextMessage("Your message not display",expected,_emailErrorMessage);
        assertTextMessage(_emailErrorMessage,expectedError,"Your message not display");
    }



}
