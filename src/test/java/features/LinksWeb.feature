
Feature: Test links validos
  Description: Como usuario quiero saber los links validos y rotos de la web del instituto Pedralbes


  Scenario: LK_1 - Quiero acceder a todos los links y obtener los links rotos
    Given Verifico todos los links de la web
    Then Debo listar links rotos y validos

