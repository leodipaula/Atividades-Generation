package lista02;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> vetorNumerosAleatorios = gerarVetorComNumerosAleatorios();

        while (!verificarChuteDoUsuario(sc, vetorNumerosAleatorios))
            ;

        sc.close();
    }

    private static boolean verificarChuteDoUsuario(Scanner sc, Set<Integer> vetorNumerosAleatorios) {
        System.out.println("\u001B[33mDigite um número de 1 a 99: \u001B[0m\n");
        int chuteDoUsuario = sc.nextInt();
        sc.nextLine();

        if (vetorNumerosAleatorios.contains(chuteDoUsuario)) {
            System.out.println("\n\u001B[32mVocê acertou!! \n\nO número " + chuteDoUsuario + " foi encontrado!"
                    + "\u001B[0m \n");
            return true;
        }
        System.out.println("\n\u001B[31mErrouuuu, o número " + chuteDoUsuario + " não foi encontrado, "
                + "tente outro número!\u001B[0m \n");
        return false;
    }

    private static Set<Integer> gerarVetorComNumerosAleatorios() {
        Set<Integer> vetorTemporario = new HashSet<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            vetorTemporario.add(random.nextInt(99));
        }

        return vetorTemporario;
    }
}
