@register @checkout

  Feature: User should able to checkout successfully without register

    Scenario: user should successfully checkout without register

      Given click on one of the feature product
      And select processor and software
      And click on Add to cart
      And click on shopping cart after build a computer
      And select agreed terms and condition
      And click on checkout
      And click on checkout as Guest
      And fill all mandatory fields on checkout page as guest and click on continue
      And select shipping method and click on continue
      And select payment by credit card and click on continue
      When select mast card and enter all card details and click on continue
      Then click on confirm after payment