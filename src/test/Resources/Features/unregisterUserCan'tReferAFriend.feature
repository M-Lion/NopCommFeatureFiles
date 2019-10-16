@register

  Feature: Unregister user should not able to refer a product to friend

    Scenario: Unregister user try to refer a product to friend but unsuccessful

      Given click on one of the feature product
      And click email a friend
      And enter Friends email address
      And enter your email address
      And enter personal message
      When click on send email
      Then user should see failure message

