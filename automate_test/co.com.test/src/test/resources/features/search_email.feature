@SearchEmail
Feature: Search Email

  @searchEmailByKeyword
  Scenario: search email by keyword
    When filter a email by keyword search test email
    Then see a expected message