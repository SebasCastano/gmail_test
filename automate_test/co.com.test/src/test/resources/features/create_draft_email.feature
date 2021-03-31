Feature: Make draft email

  Scenario: create a draft email
    Given that user want write an draft email
    When write a draft message with the text draft message text
    Then see the number draft message increment