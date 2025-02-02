package org.example.business;

import org.example.enums.FareType;
import org.example.pom.SearchListingPagePOM;
import org.example.stepdefinationfile.SearchStepDefination;
import org.example.utils.CommanFunctionFile;
import org.example.utils.Constant;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SearchBusinessClass {



    public SearchBusinessClass() {

    }

    public static void handelScroller()
    {
//        CommanFunctionFile.scrollWebPage(0,300);
        CommanFunctionFile.explictWait(300).until(ExpectedConditions.visibilityOf(SearchListingPagePOM.slider));
        Point point=SearchListingPagePOM.sliderPoint.get(1).getLocation();
         int xcoodinate=point.getX();
         int ycoodinate=point.getY();
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        scroll(xcoodinate,ycoodinate);
    }

    private static void scroll(int x,int y)
    {
        Actions actions=CommanFunctionFile.actionsFun().clickAndHold(SearchListingPagePOM.sliderPoint.get(1));
            actions.moveToLocation( x,y).release().perform();
            scroll(x-5,y);
    }

    public static void selectStopCheck(String stop)  {

        CommanFunctionFile.scrollWebPage(0,500);
           int count=0;
        for (WebElement checkElement : SearchListingPagePOM.stopCheckBox)
        {
            String stops = stop.replaceAll(" ","").toUpperCase();
              count++;
            WebElement stopelement=
                    checkElement.findElement(By.xpath("(//div[@class=\"prc_val airl1-sec stpFlt\"]//div[@class=\"wid70\"]//input)["+count+"]"));
                String StopText=stopelement.getAttribute("id").replaceAll("chk","").toUpperCase();
            if(StopText.contentEquals(stops))
             {
                       checkElement.click();
                       break;
             }
        }
    }

    public static void checkSegmentFare(String source,String destination)  {

        List<WebElement>list=new ArrayList<>();
        int count=1;
       for (WebElement element : SearchListingPagePOM.sorce_destination)
       {
//           System.out.println(element.getText());
           if(count<=2) { list.add(element);}

           if(list.get(0).getText().equalsIgnoreCase(source) && list.get(1).getText().equalsIgnoreCase(destination))
           {
               try {
                   CommanFunctionFile.takeScreenshot(element);
               } catch (IOException e) {
                   throw new RuntimeException(e);
               }
           }

       }
    }

    public static void selectAirline(String airLineName)
    {
        Constant.selectAirlineName=airLineName;
        selectSingleFlight(Constant.selectAirlineName);


    }

    private static void selectSingleFlight(String airLineName) {
        if (SearchListingPagePOM.moreAirline.getText().contains("Show more airlines"))
        {
            SearchListingPagePOM.moreAirline.click();
        }
        deselectAirline(airLineName);
//        selectDeselectAirline(airLineName);
    }

    private static void selectDeselectAirline(String airLineName)
    {
        Actions actions=new Actions(SearchStepDefination.driver);
        List<WebElement> elements=SearchListingPagePOM.airlineName;

        for (int i=1;i<elements.size();i++)
        {
            String airline=elements.get(i).getText().toUpperCase();
            if(airline.replace(" ","").contentEquals(airLineName.toUpperCase()))
            {
                actions.moveToElement(elements.get(i)).click().build().perform();
                elements.get(0).click();
            }
        }
    }

    private static void deselectAirline(String Airines) {

        Actions actions=new Actions(SearchStepDefination.driver);
        List<WebElement> elements=SearchListingPagePOM.airlineName;

        for (int i=0;i<elements.size();i++)
        {
            actions.moveToElement(elements.get(i)).build().perform();

            String airline=elements.get(i).getText();
            if(airline.toUpperCase().replace(" ","").contentEquals(Airines.toUpperCase()))
            {
                WebElement selectOnly =SearchStepDefination.driver.findElement(By.xpath("(//div[@class=\"wid70 \"]//span/../..//div[@class=\"only\"])["+(i+1)+"]"));

                 JavascriptExecutor javascriptExecutor= (JavascriptExecutor) SearchStepDefination.driver;

                javascriptExecutor.executeScript("arguments[0].click();",selectOnly );
//                actions.click(elements.get(i)).click(SearchListingPagePOM.airlineName.get(SearchListingPagePOM.airlineName.size()-1)).build().perform();
                   break;
            }
        }

    }
    public static void selectFlights()
    {
        for (WebElement element : SearchListingPagePOM.selectFlight)
        {
            try {
                element.click();
                SearchListingPagePOM.email.sendKeys("Shivam@gmail.com");
                SearchListingPagePOM.emailVerifyButton.click();
            }catch (StaleElementReferenceException e)
            {
                e.getMessage();
            }
        }
    }




    public boolean selectTripType(String tripType) {
        FareType faretype = FareType.valueOf(tripType.toUpperCase());
        switch (faretype) {
            case ONEWAY: {
                if (!SearchListingPagePOM.onewayFlight.isSelected()) {
                    SearchListingPagePOM.onewayFlight.click();
                    return SearchListingPagePOM.onewayFlight.isSelected();
                }
                break;
            }
            case ROUNDTRIP: {
                if (!SearchListingPagePOM.roundTripFlight.isSelected()) {
                    SearchListingPagePOM.roundTripFlight.click();
                    return SearchListingPagePOM.roundTripFlight.isSelected();
                }
            }
            case MULTICITY: {
                if (!SearchListingPagePOM.multiCityFlight.isSelected()) {
                    SearchListingPagePOM.multiCityFlight.click();
                    return SearchListingPagePOM.multiCityFlight.isSelected();
                }
            }
        }
        return false;
    }
    public void selectSourceDepartureDate(String sector,String destination)
    {

//        Constant.wait.until(ExpectedConditions.visibilityOf(SearchListingPagePOM.sourceSector));
        enterSourceSector(sector,SearchListingPagePOM.sourceSector,SearchListingPagePOM.isSorceDropdownVisible
                ,SearchListingPagePOM.sourceDropdownSecterlist);

//        Constant.wait.until(ExpectedConditions.visibilityOf(SearchListingPagePOM.isDestinationSecterListVisible));
        enterSourceSector(destination,SearchListingPagePOM.destinationSector,SearchListingPagePOM.isDestinationSecterListVisible
        ,SearchListingPagePOM.destinationDropDownList);

    }
    private void enterSourceSector(String sector, WebElement searchSector,WebElement isSectorDropdownVisible,
                                   List<WebElement> sourceDropdownSecterlist) {

        Constant.getAction().moveToElement(searchSector).click().sendKeys(sector).sendKeys(Keys.ENTER).perform();
//        Constant.wait.until(ExpectedConditions.visibilityOfAllElements(isSectorDropdownVisible));

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (WebElement sourceitem:sourceDropdownSecterlist)
        {
            if (sourceitem.getText().contains(sector))
            {
//                System.out.println(sourceitem.getText());
                sourceitem.click();
                break;
            }
        }

    }
    public   void selectOneWayDate(String departuredate, String currency)
    {

             CommanFunctionFile.scrollWebPage(30, 200);
             String[] date = departuredate.split("-");

             if (SearchListingPagePOM.calanderMonth.get(0).getText().contains(date[1])) {
                 for (WebElement calDate : SearchListingPagePOM.selectfirstCalanderDate) {
                     String caldate = calDate.getText();
                     String[] caldate1 = calDate.getText().split("" + currency + "");
                     if (caldate1[0].trim().equalsIgnoreCase(date[0])) {
                         calDate.click();
                         break;
                     }
                 }
             } else if (SearchListingPagePOM.calanderMonth.get(1).getText().contains(date[1])) {
                 for (WebElement calDate : SearchListingPagePOM.selectsecondCalanderDate) {

                     String caldate = calDate.getText();
                     String[] caldate1 = calDate.getText().split("" + currency + "");
                     if (caldate1[0].trim().contains(date[0])) {
                         calDate.click();
                         break;
                     }
                 }
             }
    }
    public static void selectPax(Integer adult, Integer child, Integer infent)
    {
          SearchListingPagePOM.clickselectPax.click();
         if (SearchListingPagePOM.PaxNumberDropDown.isDisplayed())
         {
//             decreaseallAge();
             selectPaxNumber(adult,child,infent);
         }
    }

    public static void selectCabin(String cabin)
    {
      for (WebElement fetchcabin:SearchListingPagePOM.selectCabin)
      {
         String fetchText=  fetchcabin.getText();
          if (fetchcabin.getText().contains(cabin) ||fetchcabin.getText().equalsIgnoreCase(cabin))
           {
               fetchcabin.click();
               SearchListingPagePOM.selectPaxCabinButton.click();
               break;
           }
      }
    }

    private static void selectPaxNumber(Integer adult,Integer child,Integer infent)
    {
        for (int i=1;i<adult;i++)
        {
            SearchListingPagePOM.adultCountAdd.click();
            break;
        }
        for (int i=0;i<child;i++)
        {
            SearchListingPagePOM.childCountAdd.click();
            break;
        }
        for (int i=0;i<infent;i++)
        {
            SearchListingPagePOM.infentCountAdd.click();
            break;
        }
    }

    private static void decreaseallAge() {
        for (int i=0;i<9;i++)
        {
            SearchListingPagePOM.adultCountMinus.click();
            SearchListingPagePOM.childCountMinus.click();
            SearchListingPagePOM.infentCountMinus.click();
        }
    }

    public static void selectFareRule(String fareRule)
    {
        for (WebElement fare:SearchListingPagePOM.fareRule)
        {
            if(fare.getText().contains(fareRule))
            {
                fare.click();
                break;
            }
        }
    }

    public static void  filterCheapFase(String filter)
    {

      CommanFunctionFile.explictWait(300).until(ExpectedConditions.invisibilityOf(SearchListingPagePOM.loder));

          for (WebElement filterflight : SearchListingPagePOM.selectCheap_Fast)
          {
              String filterfare = filterflight.getText();
              if (filterfare.contains(filter.toUpperCase()))
              {
                  filterflight.click();
              }
          }

    }
}
