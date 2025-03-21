package lista01;

import java.util.Random;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        int[] vetorRandom = gerarVetorComNumerosAleatoriosDe1Ate99();
        Scanner sc = new Scanner(System.in);

        while (!verificarSeUsuarioAcertou(receberNumeroDoUsuario(sc), vetorRandom))
            ;
        sc.close();
    }

    private static boolean verificarSeUsuarioAcertou(int numeroUsuario, int[] vetorRandom) {
        for (int i = 0; i < 10; i++) {
            if (vetorRandom[i] == numeroUsuario) {
                System.out.println(
                        "\n\u001B[32mVocê acertou!! \n\nO número " + numeroUsuario + " está na posição " + i
                                + "\u001B[0m \n");
                return true;
            }
        }
        System.out.println("\n\u001B[31mErrouuuu, tente outro número!\u001B[0m \n");
        return false;
    }

    private static int receberNumeroDoUsuario(Scanner sc) {
        int entrada;

        System.out.print("\u001B[33mDigite um número de 1 a 99: \u001B[0m\n");
        entrada = sc.nextInt();
        sc.nextLine();

        return entrada;
    }

    private static int[] gerarVetorComNumerosAleatoriosDe1Ate99() {
        Random random = new Random();
        int[] vetor = new int[10];

        for (int i = 0; i < 10; i++) {
            vetor[i] = random.nextInt(100);
        }

        return vetor;
    }
}
