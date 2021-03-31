@ManageEmail
Feature: Manage email

  @deleteEmail
  Scenario: delete specific email received
    Given that user select an email
    When delete the email
    Then see a succesful delete message