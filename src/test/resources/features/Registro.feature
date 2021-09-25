#Proyecto de pruebas y cargado en Github
#18/09/2021
#Jhonatan Medina Blanco
Feature: ingresar a la pagina OrangeHrm

  @Caso1
  Scenario Outline: ingresar credenciales
    Given abrir el navegador
    When diligencie los campos nombre <userName> y contraseña <contrasena>
    Then haga en el boton admin y buscar usuario <usuario> y rol <useRol>

    Examples: 
      | userName | contrasena | usuario       | useRol |
      | Admin    | admin123   | Dominic.Chase | Admin  |
      | Admin    | admin123   | David.Morris  | ESS    |

  @Caso2
  Scenario Outline: agregar emplado rol admintrador
    Given abrir el navegador
    When diligencie los campos nombre <userName> y contraseña <contrasena>
    Then al hacer en el boton pim y hacer clic add employee nombre <nombre> apellido <apellido>

    Examples: 
      | userName | contrasena | nombre   | apellido |
      | Admin    | admin123   | Jhonatan | medina   |
