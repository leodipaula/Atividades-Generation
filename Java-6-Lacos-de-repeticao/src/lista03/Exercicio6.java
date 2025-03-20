package lista03;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        lerNumerosEImprimirMediaDosNumerosMultiplosDe3();
    }

    private static void lerNumerosEImprimirMediaDosNumerosMultiplosDe3() {
        Scanner sc = new Scanner(System.in);
        int somaDosMultiplosDe3 = 0, numero = 0, contador = 0;

        try {
            do {
                System.out.print("\nDigite um número: ");
                numero = sc.nextInt();
                sc.nextLine();

                if (numero % 3 == 0 && numero != 0) {
                    somaDosMultiplosDe3 += numero;
                    contador++;
                    continue;
                }
            } while (numero != 0);

            System.out.printf("\nA media dos números múltiplos de 3 é: %.1f",
                    somaDosMultiplosDe3 / (float) contador);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}
