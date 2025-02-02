package org.example.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchListingPagePOM {

//    WebDriver driver=new Constant().getChromeDriver();
    public  SearchListingPagePOM(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public SearchListingPagePOM()
    {

    }
    @FindBy(xpath = "//li[contains(@id,'oway')]")
   public static WebElement  onewayFlight;

    @FindBy(xpath = "//li[contains(@id,'rtrip')]")
    public static WebElement roundTripFlight;

    @FindBy(xpath = "//li[contains(@id,'mcity')]")
    public static WebElement multiCityFlight;

    @FindBy(xpath = "//input[contains(@tabindex,\"1\" ) ]")
    public static WebElement sourceSector;

    @FindBy(xpath = "//div[@id=\"fromautoFill\"]//div[@class=\"topCityhd\"]")
    public static WebElement isSorceDropdownVisible;

    @FindBy(xpath = "//img[@alt=\"Flight\"]/../div//span[contains(@id,\"spn\")]")
    public static List<WebElement> sourceDropdownSecterlist;

    @FindBy(xpath = " //input[@id=\"Editbox13_show\"]")
    public static WebElement destinationSector;

    @FindBy(xpath = "//div[@id=\"toautoFill\"]")
    public static WebElement checkDestinationSector;

    @FindBy(xpath = "//div[@id=\"toautoFill\"]//div[@class=\"topCityhd\"]")
    public static WebElement isDestinationSecterListVisible;

    @FindBy(xpath = "//div[@id='toautoFill']//span[@class='flsctrhead']")
    public static List<WebElement> destinationDropDownList;

    @FindBy(xpath = "//div[@class=\"month2\"]")
    public static List<WebElement> calanderMonth;

    @FindBy(xpath = "//div[@class=\"box\"]//li[@class!=\"old-dt\"]")
    public static List<WebElement> selectfirstCalanderDate;



    @FindBy(xpath = "//div[@class=\"box1\"]//li[@class!=\"old-dt\"]")
    public static List<WebElement> selectsecondCalanderDate;

    @FindBy(xpath = "//img[@id=\"img2Prv\"]")
    public static WebElement calanderPreviousbutton;

    @FindBy(xpath = "//img[@id=\"img2Nex\"]")
    public static WebElement calanderNextbutton;

    //======================== Select Pax Number ================

   @FindBy(xpath = "//p[@id=\"ptravlrNo\"]")
    public static WebElement clickselectPax;

   @FindBy(xpath = "//div[@id=\"myDropdown_n\"]")
   public static WebElement PaxNumberDropDown;
    @FindBy(xpath = "//input[@id=\"optAdult\"]")
    public static WebElement adultPaxNumber;

    @FindBy(xpath = "//input[@id=\"optAdult\"]/../button[contains(@class,\"sub minus_boxADt\")]")
    public static WebElement adultCountMinus;
    @FindBy(xpath = "//input[@id=\"optAdult\"]/../button[contains(@id,\"add\")]")
    public static WebElement adultCountAdd;
    @FindBy(xpath = "//input[@id=\"optChild\"]")
    public static WebElement childCountNumber;

    @FindBy(xpath = "//input[@id=\"optChild\"]/../button[contains(@class,\"sub minus_box1\")]")
    public static WebElement childCountMinus;

    @FindBy(xpath = "//input[@id=\"optChild\"]/../button[contains(@id,\"add\")]")
    public static WebElement childCountAdd;

    @FindBy(xpath = "//input[@id=\"optInfant\"]")
    public static WebElement infentageNumber;

    @FindBy(xpath = "//input[@id=\"optInfant\"]/../button[contains(@class,\"sub minus_box1\")]")
    public static WebElement infentCountMinus;

    @FindBy(xpath = "//input[@id=\"optInfant\"]/../button[contains(@id,\"add\")]")
    public static WebElement infentCountAdd;

//-==Cabin ===


    @FindBy(xpath = "//label[@id=\"lbEconomy\"]")
    public static WebElement economyCabin;
    @FindBy(xpath = "//label[@id=\"lbPremiumEconomy\"]")
    public static WebElement PremiumEconomyCabin;
    @FindBy(xpath = "//label[@id=\"lbBusiness\"]")
    public static WebElement lbBusinessCabin;
    @FindBy(xpath = "//label[@id=\"lbFirstClass\"]")
    public static WebElement firstClassCabin;

    @FindBy(xpath = "//label[contains(@class,\"optCabin\")]")
     public static List<WebElement> selectCabin;

    @FindBy(xpath = "//a[@id=\"traveLer\"]")
    public static WebElement selectPaxCabinButton;

    @FindBy(xpath = "//label[contains(@class,\"cscshw\")]")
    public static List<WebElement> fareRule;

    @FindBy(xpath = "//button[@class=\"srchBtnSe\"]")
   public static WebElement searchSoursebutton;

    @FindBy(xpath = "//span[@class=\"cheptxt\"]")
    public static List<WebElement> selectCheap_Fast;

    @FindBy(xpath = "//div[contains(text(),'Just a moment')]")
     public static WebElement loder;

    @FindBy(xpath = "//div[@class=\"rightList\"]")
    public static WebElement listofFlight;

    @FindBy(xpath = "//div[@id=\"slider-rangeOWINT\"]/span")
    public static List<WebElement> sliderPoint;

    @FindBy(xpath = "//input[@id=\"amount_rangeOWINT\"]")
   public static WebElement scrollerPrice;

    @FindBy(xpath = "//div[@id=\"slider-rangeOWINT\"]/div[contains(@class,\"widget-header\")]")
    public static WebElement slider;

    @FindBy(xpath = "//div[@class=\"prc_val airl1-sec stpFlt\"]//div[@class=\"wid70\"]")
    public static List<WebElement> stopCheckBox;

    @FindBy(xpath = "//div[contains(@class, 'fltData')]//span[@ng-bind=\"GetFltDtl(s.FL[0]).OG\"] | //div[contains(@class, 'fltData')]//span[@ng-bind=\"GetFltDtl(s.FL[s.FL.length-1]).DT\"]")
    public static List<WebElement> sorce_destination;

    @FindBy(xpath = "//div[@id=\"divAirlinefilter\"]//div[@class=\"wid70 \"]")
    public static List<WebElement> airlineDiv;

    @FindBy(xpath = "//div[@id=\"divAirlinefilter\"]//div[@class=\"wid70 \"]//span[@class=\"t-elips ng-binding\"]")
    public static List<WebElement> airlineName;

    @FindBy(xpath = "//div[@id=\"divAirlinefilter\"]//div[@class=\"wid70 \"]//input[@type=\"checkbox\"]")
     public static List<WebElement> airlineCheckBox;
    @FindBy(xpath = "//a[@id=\"divAirlineMAfilter\"]")
    public static WebElement moreAirline;

    @FindBy(xpath = "//div[@class=\"only\"]")
    public static List<WebElement> selectOnly;



    @FindBy(xpath = "//div[@class=\"flgi-rm3\"]")
    public static List<WebElement> selectFlight;

    @FindBy(xpath = "//input[@type=\"email\"]")
    public static WebElement email;

    @FindBy(xpath = "//span[contains(@id,\"spnVerifyEmail\")]")
    public static WebElement emailVerifyButton;

    @FindBy(xpath = "//select[contains(@id,\"titleAdult\")]")
    public static WebElement adutTitle;
     @FindBy(xpath = "//input[contains(@id,\"txtFNAdult\")]")
     public static List<WebElement> adultFirstName;
     @FindBy(xpath = "//input[contains(@id,\"txtLNAdult\")]")
     public static List<WebElement> adultLastName;

     @FindBy(xpath = "//input[contains(@id,\"txtEmailAdult\")]")
     public static List<WebElement> adultEmail;

     @FindBy(xpath = "//input[contains(@id,\"txtCPhoneAdult\")]")
     public static List<WebElement> adultContact;

     @FindBy(xpath = "//select[contains(@id,\"divDOBDayAdult\")]")
    public static List<WebElement> adultDOBDay;

     @FindBy(xpath = "//select[contains(@id,\"divDOBMonAdult\")]")
    public static List<WebElement> adultDOBMonth;

     @FindBy(xpath = "//select[contains(@id,\"divDOBYarAdult\")]")
     public static List<WebElement> adultDOBYear;

     @FindBy(xpath = "//input[contains(@id,\"txtPassAdult\")]")
     public static List<WebElement> adultPassportNumber;

     @FindBy(xpath = "//select[contains(@id,\"passEXDayAdult\")]")
     public static List<WebElement> adultPassExpDay;

    @FindBy(xpath = "//select[contains(@id,\"passEXMonAdult\")]")
    public static List<WebElement> adultPassExpMonth;

     @FindBy(xpath = "//select[contains(@id,\"passEXYearAdult\")]")
     public static List<WebElement> adultPassExpYear;

     @FindBy(xpath = "//select[contains(@id,\"titleChild\")]")
     public static List<WebElement> childTitle;

     @FindBy(xpath = "//input[contains(@name,\"txtFNChild\")]")
     public static List<WebElement> childFirstName;

      @FindBy(xpath = "//input[contains(@id,\"txtLNChild\")]")
      public static List<WebElement> childLastName;

      @FindBy(xpath = "//select[contains(@id,\"divDOBDayChild\")]")
      public static List<WebElement> childDayDOB;

      @FindBy(xpath = "//select[contains(@id,\"divDOBMonChild\")]")
      public static List<WebElement> childMonthDOB;

      @FindBy(xpath = "//select[contains(@id,\"divDOBYarChild\")]")
      public static List<WebElement> childYearDOB;

      @FindBy(xpath = "//input[contains(@id,\"txtPassChild\")]")
     public static List<WebElement> childPassNo;

      @FindBy(xpath = "//select[contains(@id,\"passEXDayChild\")]")
     public static List<WebElement> childDayPasExp;

      @FindBy(xpath = "//select[contains(@id,\"passEXMonChild\")]")
     public static List<WebElement> getChildMonthDOBPasExp;

      @FindBy(xpath = "//select[contains(@id,\"passEXYearChild\")]")
      public static List<WebElement> childYearPasExp;

      @FindBy(xpath = "//select[contains(@id,\"titleInfant\")]")
      public static List<WebElement> infantTitle;

      @FindBy(xpath = "//input[contains(@id,\"txtFNInfant\")]")
      public static List<WebElement> infantFirstName;

      @FindBy(xpath = "//input[contains(@id,\"txtLNInfant\")]")
     public  static List<WebElement> infantLastName;

      @FindBy(xpath = "//select[contains(@id,\"divDOBDayInfant\")]")
      public static List<WebElement> infantDayDOB;

 @FindBy(xpath = "//select[contains(@id,\"divDOBMonInfant\")]")
 public static List<WebElement> infantMontDOB;

 @FindBy(xpath = "//select[contains(@id,\"divDOBYarInfant\")]")
 public static List<WebElement> infantYearDOB;

 @FindBy(xpath = "//input[contains(@id,\"txtPassInfant\")]")
 public static List<WebElement> infantPassNumber;


 @FindBy(xpath = "//select[contains(@id,\"passEXDayInfant\")]")
 public static List<WebElement> infantDayPassExp;

 @FindBy(xpath = "//select[contains(@id,\"passEXMonInfant\")]")
 public static List<WebElement> infantMontPassExp;

 @FindBy(xpath = "//select[contains(@id,\"passEXYearInfant\")]")
 public static List<WebElement> infantYearPassExp;

 @FindBy(xpath = "//input[@id=\"txtCPhone\"]")
 public static WebElement GSTPhoneNo;




}
