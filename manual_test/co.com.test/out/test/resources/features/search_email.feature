@SearchEmail
Feature: Search Email

  @filterEmailByCriteriaWithoutAttachmentFile
  Scenario: search email by criteria without attachment file
    Given that user want to find an email
    When filter a email by sender, receiver and subject
    Then see the correct email by criteria


  @filterEmailByCriteriaWithAttachmentFile
  Scenario: search email by criteria with attachment file
    Given that user want to find a email
    When filter a email by sender, receiver, subject and attachment file
    Then see the correct email by criteria