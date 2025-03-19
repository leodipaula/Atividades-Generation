package lista01;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        int idade = 0;
        String nome = "";
        boolean primeiraDoacao = false;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite o nome do doador: ");
            nome = sc.nextLine();

            System.out.println("Digite a idade do doador: ");
            idade = sc.nextInt();
            sc.nextLine();

            System.out.println("O doador já fez alguma doação de sangue? (true/false)");
            primeiraDoacao = sc.nextBoolean();

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            e.printStackTrace();
        }

        verificarSePodeDoarSangue(idade, nome, primeiraDoacao);

        sc.close();
    }

    private static void verificarSePodeDoarSangue(int idade, String nome, boolean primeiraDoacao) {
        if (idade >= 18 && idade < 60 || idade >= 60 && idade <= 69 && !primeiraDoacao)
            System.out.println(nome + " está apto a doar sangue!");
        else
            System.out.println(nome + " não está apto a doar sangue!");

    }
}
