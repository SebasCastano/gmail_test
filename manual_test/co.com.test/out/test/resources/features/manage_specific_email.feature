#o	Reenviar correo
#o	Responder correo
#o	Imprimir correo
#o	Eliminar correo actual

@ManageSpecificEmail
Feature: manage specific Email

  @filterEmailByCriteriaWithoutAttachmentFile
  Scenario: search email by criteria without attachment file
    Given that user want to find an email
    When filter a email by sender, receiver and subject
    Then see the correct email by criteria

