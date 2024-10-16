@Suite @amor
Feature: Productos de amor

  Background: Se deben seleccionar dos productos de la categoría amor

    Given el usuario navega al sitio web

  @amorProductos
  Scenario: Seleccionar dos productos de la categoría amor para agregarlos al carro de compras
    When  Realizar clic en la opción AMOR
    Then la aplicación debería mostrar el módulo de productos de amor




