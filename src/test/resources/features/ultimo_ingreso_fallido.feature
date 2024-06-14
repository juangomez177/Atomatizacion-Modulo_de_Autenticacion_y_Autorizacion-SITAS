#Author: QA Team
#Language: es

Feature: Ultimo ingreso fallido
  Como administrador web
  Quiero que despues de 3 intentos de inicio de sesion fallidos por parte de un usuario, se bloquee el ingreso
  Para asegurar la seguridad de las cuentas por ingreso con fuerza bruta

  #Caso Ideal
  Scenario: Bloqueo de cuenta despues de 3 intentos fallidos
    Given que estoy en la pagina de Inicio de Sesion
    When ingreso un correo electronico "<correo>" y contrasena "<contrasena>" incorrectos por 3 <veces>
    Then la cuenta del usuario se bloquea automaticamente, mostrando un mensaje de cuenta boqueada

    Examples:
      | correo                   | contrasena           | veces |
      | userIncorrecto@gmail.com | contrasenaIncorrecta | 3     |

  #Casos Excepciones
#  Scenario: No se bloquea la cuenta despues de 3 intentos fallidos
#    Given que el usuario intenta iniciar sesion con credenciales incorrectas dos veces
#    When el usuario intenta iniciar sesion con credenciales incorrectas por tercera vez
#    Then nuevamente se pide el inicio de sesion, sin saltar el bloqueo de la cuenta ni el mensaje de bloqueo
#    And se permite ingresar indefinidamente las credenciales sin restricción de bloqueo

