
Feature: Prueba de todos los links de la pagina web de el instituto Pedralbes

  Scenario: Quiero acceder a todos los links y obtener los links rotos
    Given Me encuentro en la pagina home de institutpedralbes
    When Hago click sobre todas las pestañas
    Then Debo encontrarme en la pantalla de cada pestaña