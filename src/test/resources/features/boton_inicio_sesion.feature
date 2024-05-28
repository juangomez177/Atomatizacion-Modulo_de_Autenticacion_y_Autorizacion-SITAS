#Author: QA Team
#Language: es

Feature: Boton de inicio de sesion
  Como Usuario registrado
  Quiero tener un boton visible para iniciar sesion cuando accedo a la aplicacion
  Para poder iniciar sesion facilmente en micuenta con mis datos personales

  Scenario: Verificar la presencia del boton de inicio de sesion
    Given que estoy en cualquier pagina de la aplicacion
    When hago click en el boton de inicio de sesion
    Then deberia ser redirigido a la pagina de inicio de sesion