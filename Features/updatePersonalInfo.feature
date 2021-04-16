Feature: Update Personal Information

  @UpdatepersonalInfo
  Scenario Outline: Successful in Updating Firstname of a customer

    Given User Launch Chrome browser
    When User opens the URL "url"
    And User enters Email as "<Email>" and Password as "<Password>"
    And Click on Login button
    Then User will be navigated to "My account - My Store"
    When User clicks on My personal information menu
    And update Firstname as "<Firstname>" and Current Password as "<Password>"
    Then click on Save button
    Then User can view confirmation message "Your personal information has been successfully updated"
    And close the browser

    Examples:
      | Email                         | Password |Firstname|
      |webtestautomation1207@gmail.com|  Ramesh@001|Ramesh Reddy|








