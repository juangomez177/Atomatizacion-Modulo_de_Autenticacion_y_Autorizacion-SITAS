#Author: QA Team
#Language: es

Feature: Asignar permisos de administrador
  Como administrador de la app web
  Quiero poder asignar permisos de administrador a algún usuario registrado
  Para poder dar permisos de administrador a las cuentas del equipo de administración de la app web

  #Caso Ideal
  Scenario Outline: Asignar permisos de administrador a un usuario
    Given que el administrador ha iniciado sesion en la aplicación web con correo "<correo>" y contrasena "<contrasena>"
    When el administrador accede a la seccion de administracion de usuarios
    And selecciona al usuario al que desea asignar permisos de administrador
    And selecciona la opcion para asignar permisos de administrador asignando un rol "<rol>" al usuario seleccionado
    And da click al boton de guardar cambios
    Then deberia de aparecer un mensaje de confirmacion que el rol ha sido cambiado correctamente

    Examples:
      | correo          | contrasena    | rol           |
      | user@gmail.com  | contrasena123 | Usuario       |
      | admin@gmail.com | contrasena123 | Administrador |
      | user2@gmail.com | contrasena123 | Super Usuario |

   #Casos Excepciones
#  Scenario: Asignar permisos de administrador a un usuario no es exitoso
#    Given que el administrador ha iniciado sesion en la aplicación web con correo "<correo>" y contrasena "<contrasena>"
#    When el administrador accede a la seccion de administracion de usuarios
#    And selecciona al usuario al que desea asignar permisos de administrador asignando un rol "<rol>"
#    And selecciona la opcion para asignar permisos de administrador
#    And da click al boton de guardar cambios
#    Then aparece un mensaje error en el cambio de rol del usuario