#Proyecto de pruebas y cargado en Github
#14/08/2021
#Jhonatan Medina Blanco
Feature: Leave

  @Leave
  Scenario Outline: Leave lists
    Given open navegador
    And fill out username <userName> and password <password>
    Then Select list sub unit <subUnit>
    And search on the table <nameSearch> select in the action <actions>
    Then close navigator

    Examples: 
      | userName | password | subUnit         | nameSearch  | actions |
      | Admin    | admin123 | Human Resources | Garry White | Approve |
