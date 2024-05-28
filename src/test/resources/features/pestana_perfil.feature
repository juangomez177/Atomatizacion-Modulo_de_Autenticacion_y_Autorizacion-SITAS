# Author: QA Team
# Language: es

Feature: Acceso a la Pestaña de Perfil
  Como usuario registrado
  Quiero acceder a mi perfil para ver mis datos personales
  Para conocer mi informacion y datos precisos

#Caso Ideal
  Scenario: Visualizar Datos Personales
    Given que ya estoy autenticado en la plataforma con correo "<correo>" y contrasena "<contrasena>"
    When hago clic en el icono de perfil en la barra de navegacion
    Then se despliega el menu con varias opciones, incluida la opcion de Editar Perfil
    And al hacer clic en Editar Perfil
    Then se dirige a la pestana de perfil cargando los datos actuales del usuario con Nombre "<nombre>", Apellido "<apellido>", Correo Electronico "<correo>", Pais "<pais>", Telefono "<telefono>" y Contrasena "<contrasena>"

    Examples:
      | nombre | apellido | correo                 | pais | telefono   | contrasena        |
      | Juan   | Perez    | juan.perez@example.com | +57  | 3001234567 | SecurePassword123 |


#Casos Excepciones
  Scenario: No es posible visualizar datos del usuario
    Given que ya estoy autenticado en la plataforma
    When hago clic en el icono de perfil en la barra de navegacion
    Then se despliega el menu con varias opciones, incluida la opcion de Editar Perfil
    And al hacer clic en Editar Perfil se dirigira al usuario a la pestana de perfil
    Then no se muestra informacion del usuario