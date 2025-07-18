Feature: E2E

  @E2E
  Scenario: Compra
    Given Login "https://www.saucedemo.com/"
    When Agregar dos productos al carrito
    And Visializar el carrito "Your Cart"
    And Completar el formulario de compra
    Then Finalizar la compra hasta la confirmación "Thank you for your order!"