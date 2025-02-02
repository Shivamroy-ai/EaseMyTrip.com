package org.example.stepdefinationfile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.business.SearchBusinessClass;
import org.example.pom.SearchListingPagePOM;
import org.example.utils.RunDriver;
import org.openqa.selenium.WebDriver;

public class SearchStepDefination {

    SearchBusinessClass searchBusinessClass =new SearchBusinessClass();
   public static  RunDriver runDriver=new RunDriver();
   public static   WebDriver driver;

    @Given("open browser hit website URL")
    public void open_browser_hit_website_url() {
      driver=runDriver.runDriver();
    }
    @Then("Select {string} FareType")
    public void select_fare_type(String fare) {

        SearchListingPagePOM searchListingPagePOM=new  SearchListingPagePOM(driver);
        boolean selected=  searchBusinessClass.selectTripType(fare);
//        Assert.assertEquals(true,selected);
    }
    @Then("Enter source and destination {string} and {string}")
    public void enter_source_and_destination_and(String source, String destination) {
        searchBusinessClass.selectSourceDepartureDate(source,destination);
    }
    @Then("Select Departure date {string} and {string}")
    public void select_departure_date(String sourceDate,String currency) {

        searchBusinessClass.selectOneWayDate(sourceDate,currency);
//        System.out.println(sourceDate);
    }
    @Then("Select Class and Traveler adult {int} and child {int} and Infent {int}")
    public void select_class_and_traveler_adult_and_child_and_infent(Integer adultAge, Integer childage, Integer infentAge)
    {
        SearchBusinessClass.selectPax(adultAge,childage,infentAge);
    }
    @Then("Select Cabin {string}")
    public void select_cabin(String cabin) {
        SearchBusinessClass.selectCabin(cabin);
    }
    @Then("Select Fare rule {string}")
    public void select_fare_rule(String fareRule) {
        SearchBusinessClass.selectFareRule(fareRule);
    }
    @Then("Hit the Search Functionality")
    public void hit_the_search_functionality() {

        SearchListingPagePOM.searchSoursebutton.click();
    }

    @Then("Select Chepeast and Fastest Flight {string}")
    public void select_chepeast_and_fastest_flight(String flightFilter)
        {
            SearchBusinessClass.filterCheapFase(flightFilter);
        }

    @Then("Select Price range")
    public void select_price_range()
    {
        // Current function have slider functionality
//         SearchBusinessClass.handelScroller();
    }
    @Then("Select Stops {string}")
    public void select_stops(String stop) {
       if(!stop.equals("")) SearchBusinessClass.selectStopCheck(stop);
    }
    @Then("Check and verify left Search and Result Sector is same {string} and {string}")
    public void check_and_verify_left_search_and_result_sector_is_same_and(String source, String destination)
    {
        SearchBusinessClass.checkSegmentFare(source,destination);
    }
    @Then("Select Airline {string}")
    public void select_airline(String airlinename)
    {
        SearchBusinessClass.selectAirline(airlinename);
    }

    @Then("Select Flight Sector;")
    public void select_flight_sector()
    {
        SearchBusinessClass.selectFlights();
    }
}
