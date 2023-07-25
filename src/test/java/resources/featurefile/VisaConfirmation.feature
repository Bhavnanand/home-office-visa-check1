Feature: As a user i wnt to check visa requirement status for different nationality
  Scenario: I am an Australia Coming ToUKForTourism().
    Given I am on Homepage of check- uk- visa
    When I click on start Button
    And I select a nationality "Australia"
    And I click on next step Button
    And  I select reason tourism
    And I click on continue Button
    Then I got result "You will not need a Visa to come to the UK "


