package lista01;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> cores = new ArrayList<>(lerCoresDoUsuario(sc));

        System.out.println("\nListar todas as cores: \n");
        imprimirCores(cores);

        System.out.println("\nOrdenar as cores: \n");
        imprimirCoresOrdenadas(cores);

        sc.close();
    }

    private static void imprimirCoresOrdenadas(ArrayList<String> cores) {
        cores.sort(null);
        imprimirCores(cores);
    }

    private static void imprimirCores(ArrayList<String> cores) {
        cores.forEach(System.out::println);
    }

    private static ArrayList<String> lerCoresDoUsuario(Scanner sc) {
        ArrayList<String> coresTemporaria = new ArrayList<>();

        System.out.println("Digite as cores que deseja: \n");

        for (int i = 0; i < 5; i++)
            coresTemporaria.add(sc.nextLine());

        return coresTemporaria;
    }
}
