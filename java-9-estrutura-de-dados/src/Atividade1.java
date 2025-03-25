import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> fila = new LinkedList<>();
        menu(sc, fila);
        sc.close();
    }

    private static void menu(Scanner sc, Queue<String> fila) {
        String mensagem = """
                \n************************************************
                    1 - Adicionar cliente na fila
                    2 - Listar todos os clientes
                    3 - Retirar cliente da fila
                    0 - Sair
                ************************************************\n
                """;
        int codigo = -1;

        while (codigo != 0) {
            System.out.println(mensagem);
            System.out.print("Entre com a opção desejada: ");
            codigo = sc.nextInt();
            sc.nextLine();

            switch (codigo) {
                case 1:
                    System.out.print("\nDigite o nome: ");
                    adicionarCliente(fila, sc.nextLine());
                    break;
                case 2:
                    listarClientes(fila);
                    break;
                case 3:
                    retirarClienteDaFila(fila);
                    System.out.println("Cliente chamado!");
                    break;
                default:
                    if (codigo > 3 || codigo < 0) {
                        System.out.println("\nOpção inválida!!!");
                        break;
                    }
                    System.out.println("\nPrograma finalizado!");
                    break;
            }
        }
    }

    private static void retirarClienteDaFila(Queue<String> fila) {
        if (fila.isEmpty()) {
            System.out.println("A fila está vazia!");
            return;
        }
        fila.remove();
        System.out.println("\nFila:\n");
        listarClientes(fila);
    }

    private static void listarClientes(Queue<String> fila) {
        if (fila.isEmpty()) {
            System.out.println("\nA fila está vazia!");
            return;
        }
        System.out.println("\nLista de Clientes na Fila:\n");
        fila.forEach(System.out::println);
    }

    private static void adicionarCliente(Queue<String> fila, String nome) {
        fila.add(nome);
        System.out.println("\nFila\n");
        listarClientes(fila);
        System.out.println("\nCliente adicionado!");
    }
}
