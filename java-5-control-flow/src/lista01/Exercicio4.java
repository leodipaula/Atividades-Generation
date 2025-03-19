package lista01;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        String caract1 = "", caract2 = "", caract3 = "";
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro caractere, sem acentos: ");
            caract1 = sc.nextLine();

            System.out.println("Digite o segundo caractere, sem acentos: ");
            caract2 = sc.nextLine();

            System.out.println("Digite o terceiro caractere, sem acentos: ");
            caract3 = sc.nextLine();

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            e.printStackTrace();
        }

        verificarAnimalEscolhido(caract1, caract2, caract3);

        sc.close();
    }

    private static void verificarAnimalEscolhido(String caract1, String caract2, String caract3) {
        if (caract1.equalsIgnoreCase("vertebrado"))
            if (caract2.equalsIgnoreCase("ave"))
                System.out.println(caract3.equalsIgnoreCase("carnivoro") ? "\nÁguia" : "\nPomba");
            else
                System.out.println(caract3.equalsIgnoreCase("onivoro") ? "\nHomem" : "\nVaca");

        else if (caract1.equalsIgnoreCase("invertebrado"))
            if (caract2.equalsIgnoreCase("inseto"))
                System.out.println(caract3.equalsIgnoreCase("hematofago") ? "\nPulga" : "\nLagarta");
            else
                System.out.println(caract3.equalsIgnoreCase("hematofago") ? "\nSanguessuga" : "\nMinhoca");
        else
            System.out.println("Caracteres inválidos.");
    }
}
