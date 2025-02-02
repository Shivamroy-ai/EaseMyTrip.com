package org.example.utils;
import org.apache.commons.io.FileUtils;
import org.example.stepdefinationfile.SearchStepDefination;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CommanFunctionFile
{

    public static void scrollWebPage(int x,int y)
    {
        JavascriptExecutor js=(JavascriptExecutor) SearchStepDefination.driver;

        js.executeScript("window.scrollTo(arguments[0], arguments[1]);", x, y);
    }
    public static String getCurrentPresentDate()
    {
        LocalDate localDate= LocalDate.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("d-MMM-yyyy");
        String date=localDate.format(formatter);
          return date;
    }

    public static FluentWait fluantWait(WebElement element)
    {
        FluentWait<WebDriver> fluentWait=new FluentWait<>(SearchStepDefination.driver)
                .withTimeout(Duration.ofSeconds(60))
                .pollingEvery(Duration.ofSeconds(3))
                .ignoring(NoSuchElementException.class);
        return fluentWait;
    }

    public static WebDriverWait explictWait(Integer time)
    {
        WebDriverWait wait=new WebDriverWait(SearchStepDefination.driver,Duration.ofSeconds(time));
          return wait;
    }
    public static Actions actionsFun()
    {
        Actions actions=new Actions(SearchStepDefination.driver);
        return actions;
    }

    public static void takeScreenshot(WebElement element) throws IOException {

        // Capture screenshot of the provided WebElement
        File screenshotFile = element.getScreenshotAs(OutputType.FILE);

        // Define destination path for the screenshot file
        File destinationFile = new File("org/example/screenshot");

         if (!destinationFile.exists())
         {
             destinationFile.mkdirs();
         }
         File file=new File(destinationFile,"ScreenShort.png");
        // Copy the screenshot to the destination
        FileUtils.copyFile(screenshotFile,file);

    }
}
