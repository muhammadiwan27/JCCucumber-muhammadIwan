Feature: Checkout page
  Scenario: Checkout Summary Test
  When User click cart page
  And User click checkout
  And User enter valid first name
  And User enter valid last name
  And User enter company name
  And User select country
  And User enter street address
  And User enter city name
  And User select province
  And User enter postcode
  And User enter phone number
  And User enter email address
  And User select terms and condition
  Then User click place order