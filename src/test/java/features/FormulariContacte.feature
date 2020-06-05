Feature: Formulario de contacto
  Description: Como usuario quiero enviar un mensaje en el formulario de contacto de la pestaña On Som web del Instituto Pedralbes.

  Background:
    Given Me encuentro en la pagina home de institutpedralbes
    When Accedo a On Som y deslizo hacia abajo

  @TestFC
  Scenario Outline: FC_1 - Enviar un mensaje dejando todos los campos vacíos.
    Given Aparace el Formulari de Contacte
    When Hago click sobre el boton ENVIAR
    Then Deben aparecer los siguientes mensajes "<avisoCampoObligatorio>" y "<avisoCamposErroneos>"

    Examples: Mensajes
      | avisoCampoObligatorio    | avisoCamposErroneos                                                      |
      | El campo es obligatorio. | Uno o más campos tienen un error. Por favor revisa e inténtalo de nuevo. |


  Scenario Outline: FC_2 - Enviar un mensaje con más de 30 caracteres en los campos Nom, Correu, Assumpte y más de 500 caracteres en el campo Missatge.
    Given Aparace el Formulari de Contacte
    When Introduzco el siguiente texto en el campo El teu Nom: "<texto30>"
    And Introduzco el siguiente texto en el campo Correu: "<texto30>"
    And Introduzco el siguiente texto en el campo Assumpte: "<texto30>"
    And Introduzco el siguiente texto en el campo Missatge: "<texto500>"
    Then Los campos El teu Nom, Correu y Assumpte no pueden superar la cantidad de caracteres "<tamano30>" y "<tamano500>", el campo Missatge

    Examples: Mensajes
      | tamano30 | tamano500 | texto30                                                                   | texto500                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |
      | 30       | 500       | Lorem Ipsum is simply dummy text of the printing and typesetting industry | Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software |

  @TestFC
  Scenario Outline: FC_3 - Enviar un mensaje en el formulari de contacte con un correo invalido.
    Given Aparace el Formulari de Contacte
    When Introduzco el siguiente texto en el campo El teu Nom: "<textoTest>"
    And Introduzco el siguiente texto en el campo Correu: "<correo>"
    And Introduzco el siguiente texto en el campo Assumpte: "<textoTest>"
    And Introduzco el siguiente texto en el campo Missatge: "<textoTest>"
    When Hago click sobre el boton ENVIAR
    Then Deben aparecer los siguientes mensajes de error "<avisoCorreo>" y "<avisoCamposErroneos>"

    Examples: Datos de prueba de usuario
      | textoTest  | correo             | avisoCorreo                                                          | avisoCamposErroneos                                                      |
      | testestest | alguienejemplo.com | La dirección de correo electrónico que has introducido no es válida. | Uno o más campos tienen un error. Por favor revisa e inténtalo de nuevo. |








