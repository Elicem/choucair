Feature: Login

  @loginsuccessful
  Scenario Outline: login successful
    Given El usuario ingresa a la aplicacion
    When El usuario ingresa <user> y <password>
    Examples:
      | user  | password |
      | admin | serenity |