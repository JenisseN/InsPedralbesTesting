Feature: Test pestañas Projectes de la web
  Description: Como usuario quiero acceder a todas las paginas de la pestaña Projectes de la web del Instituto Pedralbes

  Background:
    Given Me encuentro en la pagina home del institutpedralbes
    When Despliego la pestaña Projectes

  @TestPE
  Scenario: PP_1 - Quiero acceder a la pantalla Robotica desde la pantalla home
    Given Me encuentro en la pagina home de institutpedralbes
    When Despliego la pestaña Projectes
    And En Projectes hago click sobre el boton Robotica
    Then Accedo a la pantalla Robotica


  Scenario: PP_2 - Quiero acceder a la pantalla Qualitat desde la pantalla home
    Given Me encuentro en la pagina home de institutpedralbes
    When Despliego la pestaña Projectes
    And En Projectes hago click sobre el boton Qualitat
    Then Accedo a la pantalla Qualitat

  Scenario: PP_3 - Quiero acceder a la pantalla Internacional desde la pantalla home
    Given Me encuentro en la pagina home de institutpedralbes
    When Despliego la pestaña Projectes
    And En Projectes hago click sobre el boton Internacional
    Then Accedo a la pantalla Internacional


  Scenario: PP_4 - Quiero acceder a la pantalla Mobilitat Internacional desde la pantalla home
    Given Me encuentro en la pagina home de institutpedralbes
    When Despliego la pestaña Projectes
    And Despliego la pestaña Internacional y click sobre el boton Movilidad Internacional
    Then Accedo a la pantalla Movilidad Internacional


  Scenario: PP_5 - Quiero acceder a la pantalla InnovaFP desde la pantalla home
    Given Me encuentro en la pagina home de institutpedralbes
    When Despliego la pestaña Projectes
    And En Projectes hago click sobre el boton InnovaFP
    Then Accedo a la pantalla InnovaFP


  Scenario: PP_6 - Quiero acceder a la pantalla Empreneduria desde la pantalla home
    Given Me encuentro en la pagina home de institutpedralbes
    When Despliego la pestaña Projectes
    And En Projectes hago click sobre el boton Empreneduria
    Then Accedo a la pantalla Empreneduria


  Scenario: PP_7 - Quiero acceder a la pantalla Empreneduria desde la pantalla home
    Given Me encuentro en la pagina home de institutpedralbes
    When Despliego la pestaña Projectes
    And En Projectes hago click sobre el boton Escola empresa
    Then Accedo a la pantalla Escola empresa


  Scenario: PP_8 - Quiero acceder a la pantalla FP Dual desde la pantalla home
    Given Me encuentro en la pagina home de institutpedralbes
    When Despliego la pestaña Projectes
    And En Projectes hago click sobre el boton FP Dual
    Then Accedo a la pantalla FP Dual
