# Author: QA Team
# Language: es

Feature: Actualizacion de Datos Personales
  Como usuario registrado
  Quiero poder acceder al modo de modificacion dentro de mi perfil en la aplicacion web
  Para poder actualizar mis datos personales y guardar los cambios
  Y asi mantener mis datos actualizados

#Caso Ideal
  Scenario: Acceso al modo de edicion de perfil
    Given soy un usuario logueado con correo "<correo>" y contrasena "<contrasena>"
    When accedo a la Edicion de Perfil en la aplicacion web
    Then deberia de ver un boton para editar mi perfil
    And al dar click al boton de edicion
    When podria modifico mis datos personales como Nombre "<nombre>", Apellido "<apellido>", Correo Electronico "<correo>", Pais "<pais>" y Telefono "<telefono>"
    And al dar click en el boton guardar cambios
    Then deberia de actualizarse mis datos personales en el sistema, mostrando un mensaje de exito

    Examples:
      | nombre | apellido | correo                 | pais | telefono   | contrasena        |
      | Juan   | Perez    | juan.perez@example.com | +57  | 3001234567 | SecurePassword123 |

#Casos Excepciones
  Scenario: No se encuentra el boton de edicion del perfil
    Given soy un usuario logueado con correo "<correo>" y contrasena "<contrasena>"
    When accedo a la Edicion de Perfil en la aplicacion web
    Then no veo el boton para editar mi perfil
    And no seria posible acceder al modo de edicion

  Scenario: Falla al guardar los cambios en el perfil
    Given soy un usuario logueado con correo "<correo>" y contrasena "<contrasena>"
    When accedo a la Edicion de Perfil en la aplicacion web
    Then deberia de ver un boton para editar mi perfil
    And al dar click al boton de edicion
    When podria modifico mis datos personales como Nombre "<nombre>", Apellido "<apellido>", Correo Electronico "<correo>", Pais "<pais>" y Telefono "<telefono>"
    And al dar click en el boton guardar cambios
    Then recibo un mensaje de error indicando que no se pudieron guardar los cambios
    Then mis datos personales no podrian se actualizados