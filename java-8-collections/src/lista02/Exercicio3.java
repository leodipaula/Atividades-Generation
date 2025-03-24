package lista02;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> numerosDoUsuario = lerEntradas(sc);
        listarDadosOrdenados(numerosDoUsuario);

        sc.close();
    }

    private static void listarDadosOrdenados(Set<Integer> numerosDoUsuario) {
        System.out.println("\nListar dados do Set:\n");
        numerosDoUsuario.forEach(System.out::println);
    }

    private static Set<Integer> lerEntradas(Scanner sc) {
        /*
         * TreeSet implementa a interface Iterable por herdar de AbstractSet.
         * Então já é possível imprimir os elementos sem chamar explícitamente o
         * .iterator()
         */
        Set<Integer> vetorTemporario = new TreeSet<>();

        System.out.println("Digite 10 números: \n");
        for (int i = 0; i < 10; i++) {
            vetorTemporario.add(sc.nextInt());
            sc.nextLine();
        }
        return vetorTemporario;
    }
}
