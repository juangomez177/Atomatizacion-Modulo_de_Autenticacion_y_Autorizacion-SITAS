#Author: QA Team
#Language: es

Feature: Boton de registro
  Como usuario no registrado
  Quiero tener un boton visible en la barra de navegacion de opciones que me dirija a la pagina de registro
  Para poder crear una cuenta en la aplicacion web de manera rapida y sencilla

  #Caso Ideal
  Scenario: Usuario no registrado accede al boton de registro
    Given que estoy en cualquier pagina de la aplicacion para registrarme
    When hago clic en el boton de registro
    Then deberia ser redirigido a la pagina de registro