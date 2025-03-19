package lista02;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        float num1 = 0, num2 = 0;
        Scanner sc = new Scanner(System.in);
        String mensagem = """
                \n###################################################

                Escolha dentre as opções abaixo:

                    1 - Soma
                    2 - Subtração
                    3 - Multiplicação
                    4 - Divisão

                ###################################################\n
                """;

        try {
            System.out.println("Digite o primeiro número: ");
            num1 = sc.nextFloat();

            System.out.println("Digite o segundo número: ");
            num2 = sc.nextFloat();

            System.out.println(mensagem);

            switch (sc.nextInt()) {
                case 1:
                    System.out.printf("\nResultado: %.1f\n\n", num1 + num2);
                    break;
                case 2:
                    System.out.printf("\nResultado: %.1f\n\n", num1 - num2);
                    break;
                case 3:
                    System.out.printf("\nResultado: %.1f\n\n", num1 * num2);
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("\nDividir por zero é crime!!!\n");
                    } else {
                        System.out.printf("\nResultado: %.1f\n\n", num1 / num2);
                    }
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
