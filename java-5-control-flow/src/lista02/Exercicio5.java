package lista02;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        int quantidade;
        Scanner sc = new Scanner(System.in);
        String mensagem = """
                ###################################################

                Escolha dentre as opções abaixo:

                    1 - Cachorro Quente - R$ 10,00
                    2 - X-Salada - R$ 15,00
                    3 - X-Bacon - R$ 18,00
                    4 - Bauru - R$ 12,00
                    5 - Refrigerante - R$ 8,00
                    6 - Suco de laranja - R$ 13,00

                ###################################################
                """;

        System.out.println(mensagem);
        try {
            switch (sc.nextInt()) {
                case 1:
                    System.out.println("Digite a quantidade: ");
                    quantidade = sc.nextInt();
                    System.out.println(
                            "\nProduto: Cachorro Quente \nValor total: R$ " + (quantidade * 10.00));
                    break;
                case 2:
                    System.out.println("Digite a quantidade: ");
                    quantidade = sc.nextInt();
                    System.out.println(
                            "\nProduto: X-Salada \nValor total: R$ " + (quantidade * 15.00));
                    break;
                case 3:
                    System.out.println("Digite a quantidade: ");
                    quantidade = sc.nextInt();
                    System.out.println(
                            "\nProduto: X-Bacon \nValor total: R$ " + (quantidade * 18.00));
                    break;
                case 4:
                    System.out.println("Digite a quantidade: ");
                    quantidade = sc.nextInt();
                    System.out.println(
                            "\nProduto: Bauru \nValor total: R$ " + (quantidade * 12.00));
                    break;
                case 5:
                    System.out.println("Digite a quantidade: ");
                    quantidade = sc.nextInt();
                    System.out.println(
                            "\nProduto: Refrigerante \nValor total: R$ " + (quantidade * 8.00));
                    break;
                case 6:
                    System.out.println("Digite a quantidade: ");
                    quantidade = sc.nextInt();
                    System.out.println(
                            "\nProduto: Suco de laranja \nValor total: R$ " + (quantidade * 13.00));
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
