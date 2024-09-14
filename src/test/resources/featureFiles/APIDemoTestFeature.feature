Feature: Verify the email and password
  Scenario Outline: Verify Rest API POST Call
    Given create a user  with "<url>" with "<username>" and "<password>"
    Then status code should be "<response code>"
    Examples:
      |url              |username          |password|response code|
      |/register/preprod|eve.holt@reqres.in|pistol   |201|