package lista02;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        float saldo = 1000;
        Scanner sc = new Scanner(System.in);
        String mensagem = """
                \n###################################################

                Escolha dentre as opções abaixo:

                    1 - Saldo
                    2 - Saque
                    3 - Depósito

                ###################################################\n
                """;

        try {
            System.out.println(mensagem);
            switch (sc.nextInt()) {
                case 1:
                    System.out.printf("\nOperação - Saldo\n Saldo: R$ %.2f\n\n", saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor do saque: ");
                    float saque = sc.nextFloat();
                    if (saque > saldo) {
                        System.out.println("Saldo insuficiente!");
                    } else {
                        saldo -= saque;
                        System.out.printf("\nOperação - Saque\nNovo Saldo: R$ %.2f\n\n", saldo);
                    }
                    break;
                case 3:
                    System.out.println("Digite o valor do depósito: ");
                    float deposito = sc.nextFloat();
                    saldo += deposito;
                    System.out.printf("\nOperação - Depósito\n Novo Saldo: R$ %.2f\nSaldo: R$ %.2f\n\n", deposito,
                            saldo);
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
