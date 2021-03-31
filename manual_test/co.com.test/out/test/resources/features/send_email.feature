#Author: Sebastian Castaño Gonzalez
#language:en
@SendEmail
Feature: Send Email

  @sendEmailWithoutSubjet
  Scenario: send email successfull
    Given that user want send an email
    When send an email without subjet
    Then see a succesfull send message


  @sendEmailWithValidAttachment
  Scenario: send email with valid Attachment
    Given that user want send an email
    When send an email with valid attachment file
    Then see a succesfull send message


  @sendEmailWithInvalidAttachment
  Scenario: send email with invalid Attachment
    Given that user want send an email
    When send an email with invalid attachment file
    Then see a warning for invalid file

  @scheduledSendEmail
  Scenario: scheduled send email successfull
    Given that user want schedule send an email
    When schedule send an email with date and time valid
    Then see an email in the sent emails tab at time and date specificed
