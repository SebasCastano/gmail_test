@ManageSpecificEmail
Feature: manage specific Email

  @forwardCurrentEmail
  Scenario: forward an specific email
    Given that user is located in a specific email
    When forward the specific email
    Then see a succesful send message
    And see to message as thread

  @replyCurrentEmail
  Scenario: replay an specific email
    Given that user is located in a specific email
    When replay the specific email
    Then see a succesful send message
    And see to message as thread

  @printCurrentEmail
  Scenario: print an specific email
    Given that user is located in a specific email
    When print the specific email
    Then see a preview printed message

  @deleteCurrentEmail
  Scenario: delete an specific email
    Given that user is located in a specific email
    When delete the specific email
    Then see a succesful deleted email message
    And see a deleted email in trash
