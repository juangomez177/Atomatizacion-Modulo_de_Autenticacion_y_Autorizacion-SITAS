# Author: QA Team
# Language: es

Feature: Iniciar Sesion en la Aplicacion Web
  Como usuario registrado
  Quiero acceder a una pestana para ingresar mis credenciales
  Para poder iniciar sesion en la aplicacion web

  # Caso Ideal
  Scenario Outline: Iniciar Sesion con Credenciales Validas
    Given que estoy en la pagina de inicio de sesion
    When ingreso mi correo electronico "<correo>" y contrasena "<contrasena>"
    And hago clic en el boton Iniciar Sesion
    Then deberia ser mostrar un mensaje de confirmacion para ser redirigido a la pagina principal

    Examples:
      | correo              | contrasena       |
      | usuario@example.com | ContraseñaValida |

  # Casos Excepciones
  Scenario: Iniciar Sesion con Credenciales No Validas
    Given que estoy en la pagina de inicio de sesion
    When ingreso credenciales no validas, como un correo electronico "<correo>" y contrasena "<contrasena>"
    And hago clic en el boton Iniciar Sesion
    Then deberia lanzarse un mensaje de error de credenciales invalidas

    Examples:
      | correo                          | contrasena       |
      | usuarioNoRegistrado@example.com | ContraseñaValida |
