@register @test1
Feature: As a User, I want to Register so I can use all the facilities available on my account

  Scenario: User should go on Register page and enter mandatory details and see the registration successful message.
    Given User is on Registration Page
    When User enter all mandatory fields details
    Then User should see message Your Registration Completed