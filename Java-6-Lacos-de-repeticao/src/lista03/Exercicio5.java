package lista03;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        lerNumerosEImprimirSomaDosNumerosInteiros();
    }

    private static void lerNumerosEImprimirSomaDosNumerosInteiros() {
        Scanner sc = new Scanner(System.in);
        int somaDosInteiros = 0, numero = 0;

        try {
            do {
                System.out.print("\nDigite um número: ");
                numero = sc.nextInt();
                sc.nextLine();

                if (numero > 0) {
                    somaDosInteiros += numero;
                    continue;
                }
            } while (numero != 0);

            System.out.println("\nA soma dos números inteiros positivos digitados é: " + somaDosInteiros);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}
