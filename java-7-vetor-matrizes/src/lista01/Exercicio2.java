package lista01;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = ler10Numeros(sc);
        elementosIndicesImpares(vetor);
        elementosIndicesPares(vetor);
        somaEMediaDosNumerosDoVetor(vetor);

        sc.close();
    }

    private static void somaEMediaDosNumerosDoVetor(int[] vetor) {
        int soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        System.out.println("\n\nSoma: " + soma);
        System.out.printf("\nMédia: %.2f \n", (float) soma / vetor.length);
    }

    private static void elementosIndicesPares(int[] vetor) {
        System.out.println("\n\nElementos índices pares: ");

        for (int i = 0; i < vetor.length; i += 2) {
            System.out.print(vetor[i] + " ");
        }
    }

    private static void elementosIndicesImpares(int[] vetor) {
        System.out.println("\nElementos índices ímpares: ");

        for (int i = 1; i < vetor.length; i += 2) {
            System.out.print(vetor[i] + " ");
        }
    }

    private static int[] ler10Numeros(Scanner sc) {
        int[] vetorTemporario = new int[10];
        System.out.println("Digite 10 números: \n");

        for (int i = 0; i < 10; i++) {
            vetorTemporario[i] = sc.nextInt();
            sc.nextLine();
        }

        return vetorTemporario;
    }
}
