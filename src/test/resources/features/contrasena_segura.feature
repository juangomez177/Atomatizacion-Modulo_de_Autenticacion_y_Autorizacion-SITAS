#Author: QA Team
#Language: es

Feature: Contrasena Segura
  Como Administrador de la aplicacion web
  Quiero establecer y exigir políticas de creacion de contraseaas seguras
  Para asegurar que todas las cuentas de usuario,esten protegidas con contrasenas robustas

  #Caso Ideal
  Scenario: Verificar el cumplimiento de las politicas de contrasena
    Given que estoy en la pagina pricipal de la aplicacion de la pestana de resitro
    When ingreso una cotrasena generica "<contrasena>" que no cumple los estandares
    And doy click al boton de registrar cuenta
    Then deberia ver un mensaje de advertencia indicando que la contrasena no es segura

    Examples:
      | contrasena |
      | 123        |

  # Casos Excepciones
  Scenario: Se permite la creacion de una cuenta con contrasena debil
    Given que estoy en la pagina pricipal de la aplicacion
    When accedo a la pestana de resitro
    And ingreso una cotrasena generica "<contrasena>" que no cumple los estandares
    When doy click al boton de registrar cuenta
    Then nose muestra  un mensaje de advertencia y se permite que la cuenta pueda seguir creandose