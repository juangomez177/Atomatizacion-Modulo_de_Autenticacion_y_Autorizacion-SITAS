#Author: QA Team
#Language: es

Feature: Formulario de registro
  Como Administrador de la aplicacion web
  Quiero una  pestana de registro que cuente con todos los campos necesarios para adicionar la informacion y que el ingreso de estos sea obligatorio
  Para tener la informacion completa y precisa de los usuarios de la aplicacion web.

  #Caso Ideal
  Scenario Outline: Verificar registro exitoso
    Given que estoy en la pagina de registro
    When ingreso todos los campos obligatorios con nombre "<nombre>", apellido "<apellido>", tipo documento "<tipoDocumento>", documento "<documento>", correo "<correo>", contrasena "<contrasena>", pais "<pais>", telefono "<telefono>"
    And doy click en el boton Crear cuenta
    Then deberia ver un mensaje de exito indicando que la cuenta ha sido creada

    Examples:
      | nombre | apellido | tipoDocumento | documento | correo                 | contrasena        | pais | telefono   |
      | Juan   | Perez    | CC            | 123456789 | juan.perez@example.com | SecurePassword123 | +57  | 3001234567 |

  #Casos Excepciones
  Scenario: Verificar campos obligatorios en el formulario de registro
    Given que estoy en la pagina de registro
    When intento enviar el formulario sin completar todos los campos obligatorios
    Then deberia ver un mensaje de error indicando los campos faltantes

  Scenario: Verificar limites de caracteres en campos de registro
    Given que estoy en la pagina de registro
    When intento ingresar mas caracteres de los permitidos en los campos de nombre, apellido o correo electronico
    Then deberia ver un mensaje de error indicando los limites de caracteres
