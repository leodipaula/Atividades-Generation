import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        double salarioBruto, adicionarNoturno, horasExtras, descontos, salarioLiquido;

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Digite o salário bruto: ");
            salarioBruto = scanner.nextDouble();

            System.out.println("Digite o valor a ser adicionado por hora noturna: ");
            adicionarNoturno = scanner.nextDouble();

            System.out.println("Digite a quantidade de horas extras: ");
            horasExtras = scanner.nextDouble();

            System.out.println("Digite o valor dos descontos: ");
            descontos = scanner.nextDouble();

            salarioLiquido = calcularSalarioLiquido(salarioBruto, adicionarNoturno, horasExtras, descontos);
            System.out.printf("Salário líquido: %.2f \n", salarioLiquido);

        } catch (Exception e) {
            System.out.println("Erro ao ler os valores: " + e.getMessage());
            System.out.println(
                    "Talvez você tenha digitado um tipo não numérico \nou usado ponto ao invés da vírgula para separar as casas decimais.");
            e.printStackTrace();
        }
    }

    private static double calcularSalarioLiquido(double salarioBruto, double adicionarNoturno, double horasExtras,
            double descontos) {
        return salarioBruto + adicionarNoturno + (horasExtras * 5) - descontos;
    }
}
