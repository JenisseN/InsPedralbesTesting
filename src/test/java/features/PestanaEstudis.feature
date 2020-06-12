
Feature: Test pestañas Estudis de la web
  Description: Como usuario quiero acceder a todas las paginas de la pestaña
                Estudis de la web del Instituto Pedralbes

  Background:
    Given Me encuentro en la pagina home de institutpedralbes
    When Despliego la pestaña Estudis


  Scenario: PE_1 - Quiero acceder a la pantalla Introduccion ciclos desde la pantalla Home
    Given Me encuentro en la pagina home de institutpedralbes
    When Despliego la pestaña Estudis
    And En Estudis hago click sobre el boton Introduccio cicles
    Then Accedo a la pantalla Introduccio Cicles

  @TestPE
  Scenario: PE_2 - Quiero acceder a la pantalla DAM Desemvolupament d'aplicaciones multiplataforma desde la pantalla home
    Given Me encuentro en la pagina home de institutpedralbes
    When Despliego la pestaña Estudis
    And En Estudis hago click sobre el boton DAM Desemvolupament d'aplicaciones multiplataforma
    Then Accedo a la pantalla DAM


  Scenario: PE_3 - Quiero accedera la pantalla DAW Desemvolupament d'aplicaciones web desde la pantalla home
    Given Me encuentro en la pagina home de institutpedralbes
    When Despliego la pestaña Estudis
    And En Estudis hago click sobre el boton DAW Desemvolupament d'aplicaciones web
    Then Accedo a la pantalla DAW


  Scenario: PE_4 - Quiero acceder a la pantalla SMIX Sistemes microinformatics y xarxes desde la pantalla home
    Given Me encuentro en la pagina home de institutpedralbes
    When Despliego la pestaña Estudis
    And En Estudis hago click sobre el boton SMIX Sistemes microinformatics y xarxes
    Then Accedo a la pantalla SMIX

  @TestPE
  Scenario: PE_5 - Quiero acceder a la pantalla DAM Videojuegos desde la pantalla home
    Given Me encuentro en la pagina home de institutpedralbes
    When Despliego la pestaña Estudis
    And En Estudis hago click sobre el boton DAM Videojocs
    Then Accedo a la pantalla DAM Videojocs

  Scenario: PE_6 - Quiero acceder a la pantalla ASIX Ciberseguretat desde la pantalla home
    Given Me encuentro en la pagina home de institutpedralbes
    When Despliego la pestaña Estudis
    And En Estudis hago click sobre el boton ASIX Ciberseguretat
    Then Accedo a la pantalla ASIX Ciberseguretat


  Scenario: PE_7 - Quiero acceder a la pantalla PFI desde la pantalla home
    Given Me encuentro en la pagina home de institutpedralbes
    When Despliego la pestaña Estudis
    And En Estudis hago click sobre el boton PFI
    Then Accedo a la pantalla PFI


  Scenario: PE_8 - Quiero acceder a la pantalla Equip impulsor ESO desde la pantalla home
    Given Me encuentro en la pagina home de institutpedralbes
    When Despliego la pestaña Estudis
    And En Estudis hace hago sobre el boton Equip Impulsor ESO
    Then Accedo a la pagina externa https://sites.google.com/inspedralbes.cat/equipimpulsor/inici





