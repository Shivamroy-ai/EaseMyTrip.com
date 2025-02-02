package org.example.utils;

import io.opentelemetry.api.logs.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class RunDriver {

    public  static WebDriver webDriver;
    public WebDriver runDriver()
    {

        String driver=getReadPropertiesFile().getBrowser();
        switch (driver)
        {
            case "chrome" :
            {
                ChromeOptions chromeOptions=new ChromeOptions();
                chromeOptions.addArguments("--disable-notifications");
                webDriver=new ChromeDriver(chromeOptions);
                setimplicitwait_runBaseURL();
                break;
            }
            case "firefox" :
            {
               webDriver= new FirefoxDriver();
                setimplicitwait_runBaseURL();
                break;
            }
            default:
            {    }
        }
        return webDriver;
    }

    public void setimplicitwait_runBaseURL()
    {
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        String baseURL=getReadPropertiesFile().getBaseURL();
        webDriver.get(baseURL);
        webDriver.manage().window().maximize();
    }

    public ReadPropertiesFile getReadPropertiesFile()
    {
        return new ReadPropertiesFile();
    }

}
