package org.example.utils;

import org.example.stepdefinationfile.SearchStepDefination;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

public class Constant {

    private final String propertiesFileURL="C:\\Users\\Vyom\\OneDrive\\Software Testing\\EaseMyTrripBDDFrameWork\\src\\main\\java\\org\\example\\propertiesfiles\\globaldate.properties";
   public static WebDriverWait wait=new WebDriverWait(SearchStepDefination.driver, Duration.ofSeconds(40));

   public static  String selectAirlineName;
   public static Set<String> windowID;
    public String getPropertiesFileURL()
    {
        return propertiesFileURL;
    }
    public  Constant()  { }
    public  Constant(ChromeDriver driver)
    {
        RunDriver.webDriver=driver;
    }

    public WebDriver getChromeDriver()
    {
        return RunDriver.webDriver;
    }


    public static Actions getAction()
    {return new Actions(SearchStepDefination.driver);}

    public static Wait getFluentWait(int timeout,int polling)
    {
        Wait wait=new FluentWait(SearchStepDefination.driver)
                .withTimeout(Duration.ofSeconds(timeout))
                .pollingEvery(Duration.ofSeconds(polling))
                .ignoring(NoSuchElementException.class);
        return wait;
    }


}
