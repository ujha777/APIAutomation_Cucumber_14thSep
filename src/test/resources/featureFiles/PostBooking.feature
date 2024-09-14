Feature: Create Booking and Get Booking ID
  Scenario Outline: Verify POST Request method should work successfully
    Given create a booking with url "<basePath>"
    Then status code for post request "<responseCode>"
    Examples:
      |basePath  |responseCode|
      |/booking  |200        |