@register

  Feature: Register user should able to buy product successfully

    Scenario: Register user should buy product successfully

      Given User is on Registration Page
      And User enter all mandatory fields details
      And click on HomePage
      And click on one of the feature product
      And select processor and software
      And click on Add to cart
      And click on shopping cart after build a computer
      And select agreed terms and condition
      And click on checkout
      And fill all mandatory fields on checkout page and click on continue
      And select shipping method and click on continue
      And select payment by credit card and click on continue
      When select mast card and enter all card details and click on continue
      Then click on confirm after payment


