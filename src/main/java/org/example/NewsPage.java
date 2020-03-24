package org.example;

import org.openqa.selenium.By;

public class NewsPage extends Utils {
    LoadProp loadProp = new LoadProp();
    private By _news = By.xpath("//a[contains(@href,'about')and(@class='read-more')]");
    private By _title = By.xpath("//input[@class='enter-comment-title']");
    private By _comment = By.xpath("//textarea[@class='enter-comment-text']");
    private By _newcomment = By.xpath("//input[@name = 'add-comment']");
    private By _successmessage = By.xpath("//div[contains(text(),'successfully ')]");

    String title = loadProp.getProperty("title");
    String comment = loadProp.getProperty("comment");


    public void userClickOnDetails(){
        sleep(2);
        clickOnElement(_news);
        enterText(_title,title);
        enterText(_comment,comment);
        clickOnElement(_newcomment);

    }
    public void verifysuccessmessageofcomment(){
        String expected = "News comment is successfully added.";
        assertTextMessage(_successmessage,expected,"News comment is successfully added");

    }



}
