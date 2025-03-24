package lista01;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> vetorNumerosAleatorios = new ArrayList<>(gerarVetorComNumerosAleatorios());
        while (!verificarChuteDoUsuario(sc, vetorNumerosAleatorios))
            ;

        sc.close();
    }

    private static boolean verificarChuteDoUsuario(Scanner sc, ArrayList<Integer> vetorNumerosAleatorios) {
        System.out.println("\u001B[33mDigite um número de 1 a 99: \u001B[0m\n");
        int chuteDoUsuario = sc.nextInt();
        sc.nextLine();

        if (vetorNumerosAleatorios.contains(chuteDoUsuario)) {
            System.out.println("\n\u001B[32mVocê acertou!! \n\nO número " + chuteDoUsuario + " está na posição "
                    + vetorNumerosAleatorios.indexOf(chuteDoUsuario) + ": " + vetorNumerosAleatorios
                    + "\u001B[0m \n");
            return true;
        }
        System.out.println("\n\u001B[31mErrouuuu, o número " + chuteDoUsuario + " não foi encontrado, "
                + "tente outro número!\u001B[0m \n");
        return false;

    }

    private static ArrayList<Integer> gerarVetorComNumerosAleatorios() {
        ArrayList<Integer> vetorTemporario = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            vetorTemporario.add(random.nextInt(99));
        }

        return vetorTemporario;
    }
}
