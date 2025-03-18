import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        float n1, n2, n3, n4;

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite a primeira nota: ");
            n1 = scanner.nextFloat();

            System.out.println("Digite a segunda nota: ");
            n2 = scanner.nextFloat();

            System.out.println("Digite a terceira nota: ");
            n3 = scanner.nextFloat();

            System.out.println("Digite a quarta nota: ");
            n4 = scanner.nextFloat();

            System.out.printf("Diferença: %.1f \n", calcularDiferenca(n1, n2, n3, n4));
        } catch (Exception e) {
            System.out.println("Erro ao ler os valores: " + e.getMessage());
            System.out.println(
                    "Talvez você tenha digitado um tipo não numérico \nou usado ponto ao invés da vírgula para separar as casas decimais.");
            e.printStackTrace();
        }
    }

    private static float calcularDiferenca(float n1, float n2, float n3, float n4) {
        return (n1 * n2) - (n3 * n4);
    }
}
