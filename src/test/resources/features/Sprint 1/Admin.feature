#Proyecto de pruebas y cargado en Github
#18/09/2021
#Jhonatan Medina Blanco
Feature: Administrator

  @UserManagement
  Scenario Outline: User Management
    Given open navegador
    And fill out username <userName> and password <password>
    Then to access on the option admin and search user <user> and rol <useRol>
    Then close navigator

    Examples: 
      | userName | password | user          | useRol |
      | Admin    | admin123 | Dominic.Chase | Admin  |
      | Admin    | admin123 | David.Morris  | ESS    |
