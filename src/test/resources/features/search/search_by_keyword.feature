Feature: Search by keyword

  Scenario: Searching for a term
    Given Quynh is researching things on the internet
    When I looks up "Cucumber"
    Then I should see information about "Cucumber"

