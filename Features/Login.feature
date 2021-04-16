Feature: Login
  @Login
  Scenario Outline: Successful login with Valid credentials

    Given User Launch Chrome browser
    When User opens the URL "url"
    And User enters Email as "<Email>" and Password as "<Password>"
    And Click on Login button
    Then User will be navigated to "My account - My Store"
    When User clicks on Signout link
    Then User will be navigated to "Login - My Store"
    And close the browser

    Examples:
      | Email                         | Password |
      |webtestautomation1207@gmail.com|  Ramesh@001|
      #|webtestautomation1207@gmail.com|  Ramesh@01|
