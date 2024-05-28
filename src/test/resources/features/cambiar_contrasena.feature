#Author: QA Team
#Language: es

Feature: Cambiar Contrasena
  Como usuario registrado
  Quiero cambiar mi contrasena
  Para mantener mi cuenta segura

# Caso Ideal
  Scenario: Cambiar Contrasena
    Given soy un usuario registrado y logeado con correo "<correo>"  y contrasena "<contrasena>"
    When intento cambiar mi contrasena accediento a la pestana de edicion de perfil
    Then doy click en el boton cambiar contrasena
    Then se me solicita ingresar mi contrasena actual "<contrasena>", contrasena nueva "<nuevaContrasena>" y confirmar la contrasena "<confirmContrasena>"
    And guardo los cambios con el boton guardar contrasena
    Then debería de mostrar un mensaje de contrasena cambiada correctamente

    Examples:
      | correo         | contrasena | nuevaContrasena | confirmContrasena |
      | user@gmail.com |            | 123             | 456               | 456 |

# Casos Excepciones
  Scenario: Cambiar Contrasena no es exitoso
    Given soy un usuario registrado y logeado con correo "<correo>"  y contrasena "<contrasena>"
    When intento cambiar mi contrasena accediento a la pestana de edicion de perfil
    Then doy click en el boton cambiar contrasena
    Then se me solicita ingresar mi contrasena actual, contrasena nueva y confirmar la contrasena
    And guardo los cambios con el boton guardar contrasena
    Then se muestra un mensaje de contrasena no cambiada por un error inesperado

  Scenario: Contrasena se cambio pero no se reflejan los cambios satisfactoriamente
    When Cambio mi contrasena dentro de las opciones de cambiar contrasena
    Then cierro la sesion para volver a acceder
    And intento acceder con la contrasena nueva pero aparece un error de contrasena incorrecta
