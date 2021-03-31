@SendEmail
Feature: Send Email

  @sendEmailSuccessful
  Scenario: send Email successful
    Given that user want send an email
    When send an email with required fields
      | receiver           | subject    | message            |
      | gregearg@gmail.com | email test | message email test |
    Then see a successful send message


  @sendEmailWithoutReceiver
  Scenario: send Email without receiver
    Given that user want send an email
    When send an email without receiver
      | receiver | subject    | message            |
      |          | email test | message email test |
    Then see a warning for missing receiver