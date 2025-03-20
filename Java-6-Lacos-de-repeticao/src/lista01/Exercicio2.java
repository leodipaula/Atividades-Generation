package lista01;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        lerEntradaDoUsuarioEVerificarParidades();
    }

    private static void lerEntradaDoUsuarioEVerificarParidades() {
        Scanner sc = new Scanner(System.in);
        int contadorPares = 0, contadorImpares = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número: ");

            if (sc.nextInt() % 2 == 0) {
                contadorPares++;
            } else {
                contadorImpares++;
            }
        }
        System.out.println("\nQuantidade de números pares: " + contadorPares);
        System.out.println("\nQuantidade de números ímpares: " + contadorImpares);
        sc.close();
    }
}
