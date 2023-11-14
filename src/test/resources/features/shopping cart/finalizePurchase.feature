Feature: finalizePurchase
  Scenario: successful finalize purchase
    Given the user has an active session
    When clicks on the shopping cart button
    And click the finalize purchase button
    Then is redirected to purchase resume page
