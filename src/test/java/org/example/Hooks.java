package org.example;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.sun.deploy.cache.Cache.copyFile;

public class Hooks extends Utils {
    BrowserSelector browserSelector = new BrowserSelector();
    private String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());


    @After
    public void closeBrowser(Scenario scenario) {
        if (scenario.isFailed()) {
            String screenshotName = scenario.getName().replaceAll("[.,:;?!]", "") + timeStamp + ".png";
            try {
                // This takes a screenshot from the driver at save it to the specified location
                File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                //Building uo the destination path for the screenshot to the cucumber-report folder
                //Also make sure to crest a folder 'screenshot'with in the cucumber-report folder
                File destinationPath = new File(System.getProperty("user.dir") + "/target/Destination/screenshots/" + screenshotName);
                //Copy taken screenshot from source location to destination location
                copyFile(sourcePath, destinationPath);
                scenario.write("...Scenario Failed...please see attached screenshot for the error/issue");
                //attach the screenshot to our report
                scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");

            } catch (IOException e) {


            }

           // browserSelector.closeBrowser();

        }
    }
    @Before
    public void openBrowser ()
    {

        browserSelector.openBrowser();


    }

}




