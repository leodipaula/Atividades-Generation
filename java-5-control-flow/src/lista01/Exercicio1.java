package lista01;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite o valor de A: ");
            a = sc.nextInt();
            sc.nextLine();

            System.out.println("Digite o valor de B: ");
            b = sc.nextInt();
            sc.nextLine();

            System.out.println("Digite o valor de C: ");
            c = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            e.printStackTrace();
        }

        verificarSeSomaDeABEhMaiorQueC(a, b, c);

        sc.close();

    }

    private static void verificarSeSomaDeABEhMaiorQueC(int a, int b, int c) {
        int soma = a + b;
        if (soma > c)
            System.out.println("A soma de A e B é maior que C");
        else if (soma < c)
            System.out.println("A soma de A e B é menor a C");
        else
            System.out.println("A soma de A e B é igual a C");

    }
}
