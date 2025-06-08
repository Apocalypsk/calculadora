# calculadora
*Este projeto visa testar conceitos básicos de desenvolvimento de software, versionamento de código e testes de software(unitários e funcionais).*


## Como esse projeto foi consturido :

- Java
- Maven
- Junit 5
- Arquitetura MVC

## Comandos do projeto 
-  Para executar a aplicação : ```mvn clean compile exec:java```
-  Para Executar os testes : ``` mvn clean test```
-  Para fazer build do projeto : ```mvn clean install```

## Exemplo de execução :
```
Bem-vindo à Calculadora!
Escolha uma operação:
[1] Somar
[2] Subtrair
[3] Multiplicar
[4] Dividir
[X] Sair

Digite sua opção: 1
Digite o primeiro valor: 1
Digite o segundo valor: 2
Resultado: 3.0

Digite sua opção: 0
Digite o primeiro valor: 0
Digite o segundo valor: 0
Opção inválida! Tente novamente.

Digite sua opção: 4
Digite o primeiro valor: 0
Digite o segundo valor: 0
Erro: Divisão por zero não permitida!

Digite sua opção: x
Obrigado por usar a Calculadora! Até mais!
```
