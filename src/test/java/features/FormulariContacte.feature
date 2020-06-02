
Feature: Formulario de contacto
  Description: Como usuario quiero enviar un mensaje en el formulario de contacto de la pestaña On Som web del Instituto Pedralbes.

  Background:
    Given Me encuentro en la pagina home de institutpedralbes
    When Hago click sobre la pestaña On Som y deslizo hacia abajo


  Scenario Outline: FC_1 - Enviar un mensaje dejando todos los campos vacíos.
    And Hago click sobre el boton ENVIAR
    Then Deben aparecer los siguientes mensajes "<mensaje1>" y "<mensaje2>"

    Examples: Mensajes
      | mensaje1                 | mensaje2                                                                 |
      | El campo es obligatorio. | Uno o más campos tienen un error. Por favor revisa e inténtalo de nuevo. |

  @SmokeTest
  Scenario Outline: FC_2 - Enviar un mensaje con más de 30 caracteres en los campos Nom, Correu, Assumpte y más de 500 caracteres en el campo Missatge.
    And Introduzco el siguiente texto en el campo El teu Nom: "<campo>"
    And Introduzco el siguiente texto en el campo Correu: "<campo>"
    And Introduzco el siguiente texto en el campo Assumpte: "<campo>"
    And Introduzco el siguiente texto en el campo Missatge: "<campoMissatge>"
    Then Leo los campos, cuento los caracteres introducidos y debe haber "<cantidad1>" caracteres en el campo Nom, Correu, Assumpte y "<cantidad2>" en el campo Missatge.

    Examples: Mensajes
     | cantidad1   | cantidad2 | campo                                                                     | campoMissatge                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |
     | 30          | 50        | Lorem Ipsum is simply dummy text of the printing and typesetting industry | Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software |

  @SmokeTest
  Scenario Outline: FC_3 - Enviar un mensaje en el formulari de contacte con un correo invalido.
    And Introduzco el siguiente texto en el campo El teu Nom: "<campo>"
    And Introduzco el siguiente texto en el campo Correu: "<campoCorreo>"
    And Introduzco el siguiente texto en el campo Assumpte: "<campo>"
    And Introduzco el siguiente texto en el campo Missatge: "<campo>"
    When Hago click sobre el boton ENVIAR
    Then Deben aparecer los siguientes mensajes de error "<mensaje1>" y "<mensaje2>"

    Examples: Datos de prueba de usuario
      | campo      | campoCorreo        | mensaje1                                                             | mensaje2                                                                 |
      | testestest | alguienejemplo.com | La dirección de correo electrónico que has introducido no es válida. | Uno o más campos tienen un error. Por favor revisa e inténtalo de nuevo. |



















