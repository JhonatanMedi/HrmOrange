#Proyecto de pruebas y cargado en Github
#14/08/2021
#Jhonatan Medina Blanco
Feature: employee

  @employee
  Scenario Outline: Add employee
    Given open navegador
    And fill out username <userName> and password <password>
    And to access on the option add employee
    Then fill out first name <firtName> and last name <lastName>
    Then close navigator

    Examples: 
      | userName | password | firtName | lastName |
      | Admin    | admin123 | Jhonatan | Medina   |
