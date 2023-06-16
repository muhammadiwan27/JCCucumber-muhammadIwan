Feature: Item page
  Scenario: Item Summary Test
    When User click button homepage
    And User click item 1
    And User choose item 1 color
    And User choose item 1 size
    Then User add item 1 to cart
    And User click button homepage 1
    And User click item 2
    And User choose item 2 color
    And User choose item 2 size
    Then User add item 2 to cart
