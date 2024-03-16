@FlujosCrediviva
Feature: Realizar la busqueda de la pagina de Crediviva por Google
  Yo, como usuario de Crediviva
  al seleccionar la opción de blog en la pagina
  se debe validar que el texto "Blog crediviva" este visible

  Scenario Outline:
    Given Ingresar a la pagina de Google para realizar la busqueda "<URL>"
    And Digitar en el buscado la palabra de Crediviva "<txtCrediviva>"
    When Ir a la opcion de Blog de la pagina
    Then Validar que la palabra BLOG CREDIVIVA este visible en la pagina y tomar una captura de pantalla

    Examples:
    |URL|txtCrediviva|
    ##@externaldata@C:\Users\User\Documents\JavaSelenium\DataDrivenCrediviva.xlsx@Crediviva
|https://www.google.com/|Crediviva|
