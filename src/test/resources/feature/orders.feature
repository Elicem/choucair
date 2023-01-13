@Orders
Feature: Modulo Ordenes

  @AddOrder
  Scenario Outline: Crear una nueva orden
    Given El usuario ingresa a la aplicacion
    When El usuario ingresa <user> y <password>
    And el usuario visualiza el Dashboard y hace clic en mas info
    And el usuario visualiza el modulo de ordenes y hace clic en el botón nueva orden
    And el usuario llena los campos obligatorios del formulario y hace clic en grabar
    Then el usuario visualiza mensaje exitoso <mensaje exitoso>

    Examples:
      | user  | password | mensaje exitoso |
      | admin | serenity | Save success    |

  @AddOrderFailed
  Scenario Outline: Crear una nueva orden errada
    Given El usuario ingresa a la aplicacion
    #When El usuario ingresa <user> y <password>
    And el usuario visualiza el Dashboard y hace clic en mas info
    And el usuario visualiza el modulo de ordenes y hace clic en el botón nueva orden
    And el usuario hace clic en grabar
    Then el usuario visualiza mensaje fallido <mensaje fallido>

    Examples:
      | user  | password | mensaje fallido                                                                       |
      | admin | serenity | Please validate empty or invalid inputs (marked with red) before submitting the form. |

