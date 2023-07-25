Feature: As a user i wnt to check visa requirement status for different nationality
 Scenario: I as a Columbian National Coming ToTheUKTo Join A Partner For A Long Stay They Do Have An Article10Or20Card()
 Given I am on homepage of check-uk-vis
   When I click on start button
   And  I select nationality  'Columbia'
   And I click on continue button
   And I select reason 'Join partner or family for a long stay'
   And I click on option continue
   And I Select state 'My partner of family member have uk immigration status 'yes'
   And I click on continue button
   Then I verify result 'You ll need a visa to join your family or partner in the UK'







