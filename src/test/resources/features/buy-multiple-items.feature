
Feature: Compra de multiples productos en demoblaze

Scenario: Compra de multiples productos
  Given el usuario inicia sesion en demoblaze
  When agrega dos productos al carrito
  And realiza el checkout
  Then la compra debe ser exitosa


