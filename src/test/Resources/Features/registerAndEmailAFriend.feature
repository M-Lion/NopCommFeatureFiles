@register @test2

  Feature: Register user should able to refer a product to friend

    Scenario: User should be able to register successfully and refer a product to friend via email

      Given User is on Registration Page
      When User enter all mandatory fields details
      And User should see message Your Registration Completed
      And click on HomePage
      And click on one of the feature product
      And click email a friend
      And enter friends email and personal message
      And click send
      Then User should see the message Your Email Sent