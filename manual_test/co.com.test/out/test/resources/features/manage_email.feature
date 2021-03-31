@ManageEmail
Feature: Manage emails

  @archiveEmail
  Scenario: archive specific email received
    Given that user selected an specific email
    When archive the email
    Then see a succesfull archive message
    And see a archived email in the tab all emails


  @markEmailAsSpam
  Scenario: mark a specific email as spam
    Given that user selected an specific email
    When mark an email as spam
    Then see a succesfull spammed email message
    And see the email in emails spam tab


  @markEmailAsUnread
  Scenario: mark a specific email as unread
    Given that user selected an specific email
    When mark an email as unread
    Then see a succesfull unread email message
    And see the email as unread


  @markEmailAsImportant
  Scenario: mark a specific email as important
    Given that user selected an specific email
    When mark an email as important
    Then see a succesfull important email message
    And see the email in emails important tab

  @muteEmail
  Scenario: mark a specific email as muted
    Given that user selected an specific email
    When mark an email as muted
    Then see a succesfull muted email message
    And see the email as muted in tab all emails



