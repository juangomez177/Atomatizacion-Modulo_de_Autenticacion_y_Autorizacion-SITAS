# Author: QA Team
# Language: es

Feature: Opciones de Inicio de Sesion con Google y Facebook
  Como usuario registrado
  Quiero tener opciones para iniciar sesion utilizando mi cuenta de Google o Facebook
  Para acceder rapidamente al sistema

  #Caso Ideal
  Scenario: Iniciar Sesion con Google
    Given que estoy en la pagina de inicio de sesion para opciones
    When hago clic en el boton de inicio de sesión con Google
    Then deberia ser redirigido automaticamente al flujo de autenticacion de Google para ingresar el "<correo>" y contrasena "<contrasena>" de Google
    And deberia de mostrar un mensaje inicio de sesion con Google es correcto

    Examples:
      | correo                  | contrasena       |
      | usuarioGoogle@gmail.com | ContraseñaValida |

  #Casos Excepciones
#  Scenario: Iniciar Sesion con Facebook
#    Given que estoy en la pagina de inicio de sesion
#    When hago clic en el boton de inicio de sesión con Facebook
#    Then deberia ser redirigido automaticamente al flujo de autenticacion de Facebook para ingresar el "<correo>" y contrasena "<contrasena>" de Facebook
#    And deberia de mostrar un mensaje inicio de sesion con Facebook es correcto
#
#  Scenario: Falla en la autenticacion
#    Given que estoy en la pagina de inicio de sesion
#    When intento autenticarme pero la autenticacion falla
#    Then se deberia lanzar un mensaje de error