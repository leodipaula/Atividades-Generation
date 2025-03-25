import java.util.Stack;
import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> livros = new Stack<>();
        menu(sc, livros);
        sc.close();
    }

    private static void menu(Scanner sc, Stack<String> livros) {
        String mensagem = """
                \n************************************************
                    1 - Adicionar livro na pilha
                    2 - Listar todos os livros
                    3 - Retirar livro da pilha
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
                    adicionarLivro(livros, sc.nextLine());
                    break;
                case 2:
                    listarLivros(livros);
                    break;
                case 3:
                    retirarLivroDalivros(livros);
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

    private static void retirarLivroDalivros(Stack<String> livros) {
        if (livros.isEmpty()) {
            System.out.println("A pilha está vazia!");
            return;
        }
        livros.pop();
        listarLivros(livros);
    }

    private static void listarLivros(Stack<String> livros) {
        if (livros.isEmpty()) {
            System.out.println("\nA pilha está vazia!");
            return;
        }
        System.out.println("\n");
        livros.forEach(System.out::println);
    }

    private static void adicionarLivro(Stack<String> livros, String nome) {
        livros.push(nome);
        listarLivros(livros);
        System.out.println("\nLivro adicionado!");
    }
}