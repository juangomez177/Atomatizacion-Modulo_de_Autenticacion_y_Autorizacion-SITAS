#Author: QA Team
#Language: es

Feature: Barra de Navegacion
  Como Administrador de la aplicacion web
  Quiero que exista una barra de navegacion
  Para que los usuarios puedan navegar en la app web entre las distintas opciones

#Caso Ideal
  Scenario: Funcionalidad de la Barra de Navegación
    Given que estoy en una pagina de la aplicacion web
    When observo la barra de navegacion junto con las distintas opciones
    And doy clik al boton del moludo "<modulo>" que redirige a Busqueda de vuelos
    Then deberia de ser redirigido a la pagina de Busqueda de vuelos
    And doy clik al boton del moludo "<modulo>" que redirige a Checking
    Then deberia de ser redirigido a la pagina de Checking
    And doy clik al boton del moludo "<modulo>" que redirige a Reserva
    Then deberia de ser redirigido a la pagina de Reserva

    Examples:
      | modulo             |
      | Busqueda de vuelos |
      | Checking           |
      | Reserva            |

#Casos Excepciones
  Scenario: Visualización de la barra de navegación en las páginas de inicio de sesión y registro
    Given que estoy en una pagina de la aplicacion web
    When quiero observar la barra de navegacion
    Then la barra de navegación no esta presente en la pagina