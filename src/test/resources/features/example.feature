Feature: validate form fields startsharp

  Scenario: validate form fields startsharp
    Given I have several record fields
    When I enter the data in each of the fields
    Then I will be able to register and validate the mandatory nature of the fields