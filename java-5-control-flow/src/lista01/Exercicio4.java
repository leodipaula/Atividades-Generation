package lista01;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        String caractere1 = "", caractere2 = "", caractere3 = "";
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite a primeira característica, sem acentos: ");
            caractere1 = sc.nextLine();

            System.out.println("Digite a segunda característica, sem acentos: ");
            caractere2 = sc.nextLine();

            System.out.println("Digite a terceira característica, sem acentos: ");
            caractere3 = sc.nextLine();

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            e.printStackTrace();
        }

        verificarAnimalEscolhido(caractere1, caractere2, caractere3);

        sc.close();
    }

    private static void verificarAnimalEscolhido(String caractere1, String caractere2, String caractere3) {
        if (caractere1.equalsIgnoreCase("vertebrado"))
            if (caractere2.equalsIgnoreCase("ave"))
                System.out.println(caractere3.equalsIgnoreCase("carnivoro") ? "\nÁguia" : "\nPomba");
            else
                System.out.println(caractere3.equalsIgnoreCase("onivoro") ? "\nHomem" : "\nVaca");

        else if (caractere1.equalsIgnoreCase("invertebrado"))
            if (caractere2.equalsIgnoreCase("inseto"))
                System.out.println(caractere3.equalsIgnoreCase("hematofago") ? "\nPulga" : "\nLagarta");
            else
                System.out.println(caractere3.equalsIgnoreCase("hematofago") ? "\nSanguessuga" : "\nMinhoca");
        else
            System.out.println("Caracteres inválidos.");
    }
}
