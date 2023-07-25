Feature: As a user i wnt to check visa requirement status for different nationality

  Scenario: As a Chilean wants to come to UK for more than six months for  work reason
    Given I am on Homepage of check-Uk -visa
    When I click on start button
    And I Select nationality'Chile'
    And I click on continue button
    And I select reason 'Work,academic visit or business'
    And I click on continue button
    And I select intense to stay for 'longer than six months'
    And I click on continue button
    Then I verify result "You need a visa to work in health and care"