Feature: Fetch all Booking Id
  Scenario Outline: Verify Get Request method should work successfully
    Given create a request with url "<basePath>"
    Then status code for get request "<responseCode>"
    Examples:
      |basePath  |responseCode|
      |/booking  |200        |