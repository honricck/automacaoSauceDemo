@sauceDemo
Feature: Teste Automacao
  Scenario: Validar titulo do pedido na tela de checkout
    Given realize login no site sauce demo
    And estou na tela inicial
    When seleciono a blusa noir jacket
    And escolho o tamanho "L"
    And escolho a cor "Blue"
    And clico no botão adicionar ao carrinho
    And clico no botão do menu checkout
    Then verifico se o titulo do pedido esta correto
