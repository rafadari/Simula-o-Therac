# Simulação Therac-25

## Descrição
Este projeto simula um sistema de radioterapia inspirado no caso Therac-25, destacando o caso de falhas de validação de dose de radiação e como ela deveria ter respondido.

## Arquitetura
O modelo escolhido foi MVC (Model, Control e Visual) 
- model → entidades do sistema
- control → regras de negócio
- simulation → Criação da simulação
- Main - Execução da simulação

## Funcionamento
O sistema simula uma sessão de radioterapia onde uma dose incorreta é aplicada e o sistema detecta o erro e diferente de como era antes ele interrompe a sessão e emite um alerta.

## Como executar

```bash
javac Main.java
java Main
