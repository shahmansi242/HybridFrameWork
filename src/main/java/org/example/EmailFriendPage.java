package org.example;

import org.openqa.selenium.By;

public class EmailFriendPage extends Utils {
    LoadProp loadProp = new LoadProp();
    private By _friendEmail = By.xpath("//input[@class='friend-email']");
    private By _textBox = By.xpath("//*[@id='PersonalMessage']");
    private By _sendEmail = By.name("send-email");

    private String friendEmail = loadProp.getProperty( "friendEmail");

    private String message = loadProp.getProperty( "message");

    private By _emailSuccessMessage = By.xpath("//div[@class='result']");
    String expected = "Your message has been sent.";


    public void verifyUserOnEmailAFriendPage()
    {
        assertURL("productemailafriend");
    }

    public  void emailAFriendDetails(){
        sleep(2);
        enterText(_friendEmail,friendEmail);
        enterText(_textBox,message);
        clickOnElement(_sendEmail);
    }

    public  void verifyUserSeeSuccessMessageOfEmailAFriend(){
        assertTextMessage(_emailSuccessMessage,expected,"Your message has not been sent");

    }


}
