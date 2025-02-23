Feature:  Search Functionality

  Scenario: Check and verify search Functionality

    Given open browser hit website URL
    Then  Select "ONEWAY" FareType
    Then  Enter source and destination "DXB" and "BOM"
    Then  Select Departure date '29-MAR-2025' and "₹"
    Then  Select Class and Traveler adult 1 and child 1 and Infent 2
    Then  Select Cabin "Economy"
    Then  Select Fare rule "Student"
    Then  Hit the Search Functionality
    And   Select Chepeast and Fastest Flight "Fastest"
    And   Select Price range
    And   Select Stops ""
    And   Check and verify left Search and Result Sector is same "DXB" and "BOM"
    And   Select Airline "Air India"
    And   Select Flight Sector;





