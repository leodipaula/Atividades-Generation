import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        double nota1, nota2, nota3, nota4, media;

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite a primeira nota: ");
            nota1 = scanner.nextDouble();

            System.out.println("Digite a segunda nota: ");
            nota2 = scanner.nextDouble();

            System.out.println("Digite a terceira nota: ");
            nota3 = scanner.nextDouble();

            System.out.println("Digite a quarta nota: ");
            nota4 = scanner.nextDouble();

            media = calcularMedia(nota1, nota2, nota3, nota4);
            System.out.printf("Média: %.1f \n", media);
        } catch (Exception e) {
            System.out.println("Erro ao ler os valores: " + e.getMessage());
            System.out.println(
                    "Talvez você tenha digitado um tipo não numérico \nou usado ponto ao invés da vírgula para separar as casas decimais.");
            e.printStackTrace();

        }
        scanner.close();
    }

    private static double calcularMedia(double nota1, double nota2, double nota3, double nota4) {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }
}
