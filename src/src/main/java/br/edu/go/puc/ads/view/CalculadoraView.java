package br.edu.go.puc.ads.view;


import java.util.Scanner;

import br.edu.go.puc.ads.controller.CalculadoraController;

public class CalculadoraView {

    private static final Scanner scanner = new Scanner(System.in);

    public static void iniciar() {

        CalculadoraController calculadora = new CalculadoraController();
        
        System.out.println("Bem-vindo à Calculadora!");
        System.out.println("Escolha uma operação:");
        System.out.println("[1] Somar");
        System.out.println("[2] Subtrair");
        System.out.println("[3] Multiplicar");
        System.out.println("[4] Dividir");
        System.out.println("[X] Sair");

        while (true) {
            System.out.print("\nDigite sua opção: ");
            String opcao = scanner.next().toUpperCase();

            if (opcao.equals("X")) {
                System.out.println("Obrigado por usar a Calculadora! Até mais!");
                break;
            }

            System.out.print("Digite o primeiro valor: ");
            double primeiroValor = scanner.nextDouble();
            
            System.out.print("Digite o segundo valor: ");
            double segundoValor = scanner.nextDouble();

            switch (opcao) {
                case "1":
                    System.out.println("Resultado: " + calculadora.Somar(primeiroValor, segundoValor));
                    break;
                case "2":
                    System.out.println("Resultado: " + calculadora.Subtrair(primeiroValor, segundoValor));
                    break;
                case "3":
                    System.out.println("Resultado: " + calculadora.multiplicar(primeiroValor, segundoValor));
                    break;
                case "4":
                    if (segundoValor != 0) {
                        System.out.println("Resultado: " + calculadora.dividir(primeiroValor, segundoValor));
                    } else {
                        System.out.println("Erro: Divisão por zero não permitida!");
                    }
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

        scanner.close();
    }
}