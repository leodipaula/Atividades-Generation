package lista02;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[][] matrizDeNotas = lerNotas(sc);
        imprimirMediaDeCadaParticipante(matrizDeNotas);
        sc.close();
    }

    private static float[][] lerNotas(Scanner sc) {
        float[][] notas = new float[10][4];

        System.out.println("Digite as notas dos alunos:");

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                notas[i][j] = sc.nextFloat();
            }
        }

        return notas;
    }

    private static void imprimirMediaDeCadaParticipante(float[][] matrizDeNotas) {
        float[] mediasDeCadaAluno = new float[10];
        int i = 0;

        for (var todosBimestresDoAluno : matrizDeNotas) {
            float somaDosBimestres = 0;
            for (var nota : todosBimestresDoAluno) {
                somaDosBimestres += nota;
            }
            mediasDeCadaAluno[i++] = somaDosBimestres / todosBimestresDoAluno.length;
        }

        System.out.println("\nMédias dos alunos:\n");
        for (int j = 0; j < mediasDeCadaAluno.length; j++)
            System.out.printf("Média do aluno %d: %.1f\n", j + 1, mediasDeCadaAluno[j]);
    }
}
