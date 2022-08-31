Feature: Search by keyword

  Scenario: Check out Cart
    Given Quynh open HomePage
    When Quynh looks up
    And Quynh click chosen product
    And Quynh add to Cart
    And Quynh verify product "Bronco Jerky Salmon Dog Treat 70g"
    And Quynh click check out

  Scenario: Check out Shipping Address
    Given Quynh open HomePage
    When Quynh looks up
    And Quynh click chosen product
    And Quynh add to Cart
    And Quynh click check out
    And Quynh add shipping address
    And Quynh verify Shipping Address



