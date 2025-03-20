package lista01;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Tupla tupla = lerEntradaDoUsuario();
        verificarSeOIntervaloContemMultiplosDe5EDe3(tupla.numero1, tupla.numero2);
    }

    private record Tupla(int numero1, int numero2) {
    }

    private static Tupla lerEntradaDoUsuario() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2) {
            System.out.println("\nIntervalo inválido!");
            System.exit(numero1);
        }

        scanner.close();
        return new Tupla(numero1, numero2);
    }

    private static void verificarSeOIntervaloContemMultiplosDe5EDe3(int numero1, int numero2) {
        for (int i = numero1; i <= numero2; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println(i + " é múltiplo de 3 e 5");
            }
        }
    }
}
