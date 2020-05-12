Feature: Test pestañas de la web
  Description: Como usuario quiero acceder a todas las pestañas del home de la web del Instituto Pedralbes

 // Background:
    //Given Me encuentro en la pagina home de institutpedralbes

  Scenario: Quiero acceder a la pantalla Introduccion ciclos desde la pantalla Home
    Given Me encuentro en la pagina home de institutpedralbes
    When Hago click sobre la pestaña Estudis
    And En Estudis hago click sobre el boton Introduccio cicles
    Then Accedo a la pantalla Introduccio Cicles

  Scenario: Quiero acceder a la pantalla DAM Desemvolupament d'aplicaciones multiplataforma desde la pantalla home
    Given Me encuentro en la pagina home de institutpedralbes
    When Hago click sobre la pestaña Estudis
    And En Estudis hago click sobre el boton DAM Desemvolupament d'aplicaciones multiplataforma
    Then Accedo a la pantalla DAM

  Scenario: Quiero accedera la pantalla DAW Desemvolupament d'aplicaciones web desde la pantalla home
    Given Me encuentro en la pagina home de institutpedralbes
    When Hago click sobre la pestaña Estudis
    And En Estudis hago click sobre el boton DAW Desemvolupament d'aplicaciones web
    Then Accedo a la pantalla DAW

  Scenario: Quiero acceder a la pantalla SMIX Sistemes microinformatics y xarxes desde la pantalla home
    Given Me encuentro en la pagina home de institutpedralbes
    When Hago click sobre la pestaña Estudis
    And En Estudis hago click sobre el boton SMIX Sistemes microinformatics y xarxes
    Then Accedo a la pantalla SMIX

  Scenario: Quiero acceder a la pantalla DAM Videojuegos desde la pantalla home
    Given Me encuentro en la pagina home de institutpedralbes
    When Hago click sobre la pestaña Estudis
    And En Estudis hago click sobre el boton DAM Videojocs
    Then Accedo a la pantalla DAM Videojocs

  @SmokeTest
  Scenario: Quiero acceder a la pantalla ASIX Ciberseguretat desde la pantalla home
    Given Me encuentro en la pagina home de institutpedralbes
    When Hago click sobre la pestaña Estudis
    And En Estudis hago click sobre el boton ASIX Ciberseguretat
    Then Accedo a la pantalla ASIX Ciberseguretat

  @Test
  Scenario: Quiero acceder a la pantalla PFI desde la pantalla home
    Given Me encuentro en la pagina home de institutpedralbes
    When Hago click sobre la pestaña Estudis
    And En Estudis hago click sobre el boton PFI
    Then Accedo a la pantalla PFI

 @Test
  Scenario: Quiero acceder a la pantalla Equip impulsor ESO desde la pantalla home
    Given Me encuentro en la pagina home de institutpedralbes
    When Hago click sobre la pestaña Estudis
    And En Estudis hace hago sobre el boton Equip Impulsor ESO
    Then Accedo a la pagina externa https://sites.google.com/inspedralbes.cat/equipimpulsor/inici

  Scenario: Quiero acceder a la pantalla Robotica desde la pantalla home
    Given Me encuentro en la pagina home de institutpedralbes
    When Despliego la pestaña Projectes
    And En Projectes hago click sobre el boton Robotica
    Then Accedo a la pantalla Robotica

  Scenario: Quiero acceder a la pantalla Qualitat desde la pantalla home
    Given Me encuentro en la pagina home de institutpedralbes
    When Despliego la pestaña Projectes
    And En Projectes hago click sobre el boton Qualitat
    Then Accedo a la pantalla Qualitat


  Scenario: Quiero acceder a la pantalla Internacional desde la pantalla home
    Given Me encuentro en la pagina home de institutpedralbes
    When Despliego la pestaña Projectes
    And En Projectes hago click sobre el boton Internacional
    Then Accedo a la pantalla Internacional


  Scenario: Quiero acceder a la pantalla Mobilitat Internacional desde la pantalla home
    Given Me encuentro en la pagina home de institutpedralbes
    When Despliego la pestaña Projectes
    And Despliego la pestaña Internacional y click sobre el boton Movilidad Internacional
    Then Accedo a la pantalla Movilidad Internacional


  Scenario: Quiero acceder a la pantalla InnovaFP desde la pantalla home
    Given Me encuentro en la pagina home de institutpedralbes
    When Despliego la pestaña Projectes
    And En Projectes hago click sobre el boton InnovaFP
    Then Accedo a la pantalla InnovaFPÇ

  Scenario: Quiero acceder a la pantalla Empreneduria desde la pantalla home
    Given Me encuentro en la pagina home de institutpedralbes
    When Despliego la pestaña Projectes
    And En Projectes hago click sobre el boton Empreneduria
    Then Accedo a la pantalla Empreneduria

  Scenario: Quiero acceder a la pantalla Empreneduria desde la pantalla home
    Given Me encuentro en la pagina home de institutpedralbes
    When Despliego la pestaña Projectes
    And En Projectes hago click sobre el boton Escola empresa
    Then Accedo a la pantalla Escola empresa


  Scenario: Quiero acceder a la pantalla FP Dual desde la pantalla home
    Given Me encuentro en la pagina home de institutpedralbes
    When Despliego la pestaña Projectes
    And En Projectes hago click sobre el boton FP Dual
    Then Accedo a la pantalla FP Dual





