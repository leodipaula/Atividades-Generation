import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        float salario = 0, abono = 0;

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o Salário: ");
            salario = scanner.nextFloat();

            System.out.println("Digite o Abono: ");
            abono = scanner.nextFloat();
        } catch (Exception e) {
            System.out.println("Erro ao ler os valores: " + e.getMessage());
            System.out.println(
                    "Talvez você tenha digitado um tipo não numérico \nou usado ponto ao invés da vírgula para separar as casas decimais.");
            e.printStackTrace();
        }

        System.out.println("Novo salário: " + calcularAbono(salario, abono));

        scanner.close();
    }

    private static float calcularAbono(float salario, float abono) {
        return salario + abono;
    }
}
