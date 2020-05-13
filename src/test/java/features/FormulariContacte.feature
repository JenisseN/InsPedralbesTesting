
Feature: Formulario de contacto
  Description: Como usuario quiero enviar un mensaje en el formulario de contacto de la pestaña On Som web del Instituto Pedralbes

  Background:
    Given Me encuentro en la pagina home de institutpedralbes
    When Hago click sobre la pestaña On Som


  @SmokeTest
  Scenario Outline: Enviar un mensaje dejando todos los campos vacíos.
    And En On Som hago click sobre el boton ENVIAR
    Then Aparece mensaje "<mensajeT>" debajo de todos los campos y "<mensajeTT>".

    Examples: Mensajes
      |  mensajeT               | mensajeTT                                                                |
      | "El campo es obligatorio" | "Uno o más campos tienen un error. Por favor revisa e inténtalo de nuevo." |

  @SmokeTest
  Scenario Outline: Enviar un mensaje con más de 30 caracteres en los campos Nom, Correu, Assumpte y más de 500 caracteres en el campo Missatge.
    Then Introduzco el siguiente texto en el campo El teu Nom: "<frase30>"
    And Introduzco el siguiente texto en el campo Correu: "<frase30>"
    Then Introduzco el siguiente texto en el campo Assumpte: "<frase30>"
    And Introduzco el siguiente texto en el campo Missatge: "<frase500>"
    Then Leo los campos para contar los caracteres introducidos Debe haber treinta caracteres, en el campo Nom, Correu, Assumpte y quinientas caracteres en el campo Missatge.

    Examples: Textos
      | frase30  | frase500 |
      | Lorem Ipsum is simply dummy text of the printing and typesetting industry | "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software |


  @SmokeTest
  Scenario Outline: Enviar un mensaje en el formulari de contacte con un correo invalido
    Then Introduzco el siguiente texto en el campo El teu Nom "<campos>"
    And Introduzco el siguiente texto en el campo Correu "<correo>"
    Then Introduzco el siguiente texto en el campo Assumpte "<campos>"
    And Introduzco el siguiente texto en el campo Missatge "<campos>"
    When Hago click sobre el boton ENVIAR
    Then Debe aparecer el siguiente mensaje: "<mensajeC>" y "<mensajeT>"

    Examples: Datos
      | campos     | correo             | mensajeC                                                             | mensajeT                                                                 |
      | testestest | alguienejemplo.com | La dirección de correo electrónico que has introducido no es válida. | Uno o más campos tienen un error. Por favor revisa e inténtalo de nuevo. |

  @SmokeTest
  Scenario Outline: Enviar un mensaje en el formulari de contacte con un correo valido
    Then Introduzco el siguiente texto en el campo El teu Nom "<texto>"
    And Introduzco el siguiente texto en el campo Correu "<correo>"
    Then Introduzco el siguiente texto en el campo Assumpte "<texto>"
    And Introduzco el siguiente texto en el campo Missatge "<texto>"
    When Hago click sobre el boton ENVIAR
    Then Debe aparecer el siguiente mensaje "<mensaje>" .

    Examples: Datos
      | texto      | correo                    | mensaje                                  |
      | testestest | alguienprueba@hotmail.com | Gracias por tu mensaje. Ha sido enviado. |

















