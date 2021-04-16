Feature: Order a TShirt
  @OrderTshirt
  Scenario Outline: Successfully ordering Tshirt and viewing the order

    Given User Launch Chrome browser
    When User opens the URL "url"
    And User enters Email as "<Email>" and Password as "<Password>"
    And Click on Login button
    Then User will be navigated to "My account - My Store"
    When User clicks on T-shirts link
    And User selects the Quick view option
    When User clicks on More button
    And clicks on Add to cart button
    Then User clicks on Proceed to checkout button
    When User clicks on Cart menu
    Then User clicks on Proceed to checkout button in Summary Page
    Then User clicks on Proceed to checkout button in Address Page
    And Users ticks the checkbox for terms and conditions
    Then User clicks on Proceed to checkout button in Shipping Page
    And User chooses the Payment Option as paymentoption
    Then User clicks on Confirm my Order button
    When User clicks on Back to Orders button
    Then User clicks on Signout link
    And close the browser

    Examples:
      | Email | Password |
      |webtestautomation1207@gmail.com|  Ramesh@001|





