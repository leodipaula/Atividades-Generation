package lista01;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        int numero = 0;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite um número: ");
            numero = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            e.printStackTrace();
        }

        verificarSeNumeroEhPar(numero);

        sc.close();
    }

    private static void verificarSeNumeroEhPar(int numero) {
        if (numero % 2 == 0)
            System.out.println("O número é par e " + (numero > 0 ? "positivo" : "negativo"));
        else
            System.out.println("O número é ímpar e " + (numero > 0 ? "positivo" : "negativo"));

    }
}
