Feature: Categoria Estudis
  Como usuario quiero saber los diferentes ciclos formativos que dispone el centro y como se trabajan.

  Scenario: Ingresar a la pantalla Introduccion ciclos desde la pantalla Home
    Given El usuario se encuenta en la pagina home de institutpedralbes
    When Hace click sobre la pestaña Estudis
    And En Estudis hace click sobre el boton Introduccio cicles
    Then Se debe redirigir a la pantalla Introduccio Cicles

  Scenario: Ingresar a la pantalla DAM Desemvolupament d'aplicaciones multiplataforma desde la pantalla home
    Given El usuario se encuenta en la pagina home de institutpedralbes
    When Hace click sobre la pestaña Estudis
    And En Estudis hace click sobre el boton DAM Desemvolupament d'aplicaciones multiplataforma
    Then Se debe redirigir a la pantalla DAM

  Scenario: Ingresar a la pantalla DAW Desemvolupament d'aplicaciones web desde la pantalla home
    Given El usuario se encuenta en la pagina home de institutpedralbes
    When Hace click sobre la pestaña Estudis
    And En Estudis hace click sobre el boton DAW Desemvolupament d'aplicaciones web
    Then Se debe redirigir a la pantalla DAW

  Scenario: Ingresar a la pantalla SMIX Sistemes microinformatics y xarxes desde la pantalla home
    Given El usuario se encuenta en la pagina home de institutpedralbes
    When Hace click sobre la pestaña Estudis
    And En Estudis hace click sobre el boton SMIX Sistemes microinformatics y xarxes
    Then Se debe redirigir a la pantalla SMIX

  Scenario: Ingresar a la pantalla DAM Videojuegos desde la pantalla home
    Given El usuario se encuenta en la pagina home de institutpedralbes
    When Hace click sobre la pestaña Estudis
    And En Estudis hace click sobre el boton DAM Videojocs
    Then Se debe redirigir a la pantalla DAM Videojocs

  Scenario: Ingresar a la pantalla ASIX Ciberseguretat desde la pantalla home
    Given El usuario se encuenta en la pagina home de institutpedralbes
    When Hace click sobre la pestaña Estudis
    And En Estudis hace click sobre el boton ASIX Ciberseguretat
    Then Se debe redirigir a la pantalla ASIX Ciberseguretat