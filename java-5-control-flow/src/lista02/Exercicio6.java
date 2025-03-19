package lista02;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        String nomeColaborador = "";
        double salario = 0;
        Scanner sc = new Scanner(System.in);
        String mensagem = """
                \n###################################################

                Qual o cargo do colaborador?

                    1 - Gerente
                    2 - Vendedor
                    3 - Supervisor
                    4 - Motorista
                    5 - Estoquista
                    6 - Técnico de TI

                ###################################################\n
                """;
        try {
            System.out.println("Diginite o nome do colaborador, sem acentos: ");
            nomeColaborador = sc.nextLine();

            System.out.println(mensagem);

            switch (sc.nextInt()) {
                case 1:
                    System.out.println("Digite o salário: ");
                    salario = sc.nextDouble();
                    System.out.printf(
                            "\nNome do colaborador: %s\nCargo: Gerente\nSalário: R$ %.2f\n\n",
                            nomeColaborador, salario * 1.1);
                    break;
                case 2:
                    System.out.println("Digite o salário: ");
                    salario = sc.nextDouble();
                    System.out.printf(
                            "\nNome do colaborador: %s\nCargo: Vendedor\nSalário: R$ %.2f\n\n",
                            nomeColaborador, salario * 1.07);
                    break;
                case 3:
                    System.out.println("Digite o salário: ");
                    salario = sc.nextDouble();
                    System.out.printf(
                            "\nNome do colaborador: %s\nCargo: Supervisor\nSalário: R$ %.2f\n\n",
                            nomeColaborador, salario * 1.09);
                    break;
                case 4:
                    System.out.println("Digite o salário: ");
                    salario = sc.nextDouble();
                    System.out.printf(
                            "\nNome do colaborador: %s\nCargo: Motorista\nSalário: R$ %.2f\n\n",
                            nomeColaborador, salario * 1.06);
                    break;
                case 5:
                    System.out.println("Digite o salário: ");
                    salario = sc.nextDouble();
                    System.out.printf(
                            "\nNome do colaborador: %s\nCargo: Estoquista\nSalário: R$ %.2f\n\n",
                            nomeColaborador, salario * 1.05);
                    break;
                case 6:
                    System.out.println("Digite o salário: ");
                    salario = sc.nextDouble();
                    System.out.printf(
                            "\nNome do colaborador: %s\nCargo: Técnico de TI\nSalário: R$ %.2f\n\n",
                            nomeColaborador, salario * 1.08);
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
