package lista02;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = lerMatrizDoUsuario(sc);
        imprimirElementosDiagonalPrincipal(matriz);
        imprimirElementosDiagonalSecundaria(matriz);
        somaDeTodosElementosDiagonalPrincipal(matriz);
        somaDeTodosElementosDiagonalSecundaria(matriz);

        sc.close();
    }

    private static void somaDeTodosElementosDiagonalSecundaria(int[][] matriz) {
        int soma = 0;

        System.out.println("Soma dos elementos da diagonal secundária:");

        for (int i = 0, j = 2; i < 3; i++, j--)
            soma += matriz[i][j];

        System.out.println(soma + "\n");
    }

    private static void somaDeTodosElementosDiagonalPrincipal(int[][] matriz) {
        int soma = 0;

        System.out.println("\n\nSoma dos elementos da diagonal principal:");

        for (int i = 0, j = i; i < matriz.length; i++, j++)
            soma += matriz[i][j];

        System.out.println(soma + "\n");
    }

    private static void imprimirElementosDiagonalSecundaria(int[][] matriz) {
        System.out.println("\n\nDiagonal secundaria:");

        for (int i = 0, j = 2; i < 3; i++, j--)
            System.out.print(matriz[i][j] + " ");
    }

    private static void imprimirElementosDiagonalPrincipal(int[][] matriz) {
        System.out.println("\nDiagonal principal:");

        for (int i = 0, j = 0; i < matriz.length; i++, j++)
            System.out.print(matriz[i][j] + " ");
    }

    private static int[][] lerMatrizDoUsuario(Scanner sc) {
        int[][] matriz = new int[3][3];
        System.out.println("Digite os elementos da matriz: \n");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = sc.nextInt();
                sc.nextLine();
            }
        }
        return matriz;
    }
}
