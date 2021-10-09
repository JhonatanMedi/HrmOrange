#Proyecto de pruebas y cargado en Github
#18/09/2021
#Jhonatan Medina Blanco
Feature: Login

  @login
  Scenario Outline: login
    Given open navegador
    And fill out username <userName> and password <password>
    Then close navigator

    Examples: 
      | userName | password |
      | Admin    | admin123 |
