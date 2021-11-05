Feature: Buy in shirt store

  Scenario: Validate purchase order for shirts
    Given David is searching shirts on the shirt shop
    When he finds them he selects two of each and make purchase
    Then he should see that the value of the six shirts is correct

