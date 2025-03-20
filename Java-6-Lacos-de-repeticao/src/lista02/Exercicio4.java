package lista02;

import java.util.*;

public class Exercicio4 {
    public static void main(String[] args) {
        pesquisaInternaParaConhecerColaboradores();
    }

    private static void pesquisaInternaParaConhecerColaboradores() {
        Scanner sc = new Scanner(System.in);
        List<Colaborador> colaboradores = new ArrayList<>();

        while (true) {
            System.out.println("Informe a idade do colaborador:");
            int idade = sc.nextInt();
            sc.nextLine();

            int genero = lerOpcaoValida("""
                    \n#########################################
                     Como você se identifica?
                        1 - Mulher cis
                        2 - Homem cis
                        3 - Não binário
                        4 - Mulher Trans
                        5 - Homem Trans
                        6 - Outro
                    #########################################\n
                    """, 1, 6, sc);

            int categoria = lerOpcaoValida("""
                    \n#########################################
                     Qual a sua categoria?
                        1 - Backend
                        2 - Frontend
                        3 - Mobile
                        4 - Fullstack
                    #########################################\n
                    """, 1, 4, sc);

            colaboradores.add(new Colaborador(
                    idade, IdentidadeDeGenero.pegarCodigo(genero), Categoria.pegarCodigo(categoria)));

            System.out.println("Colaborador cadastrado com sucesso!");
            System.out.println("Deseja cadastrar outro colaborador? (S/N)");

            if (!sc.nextLine().equalsIgnoreCase("S"))
                break;
        }

        contabilizarColaboradores(colaboradores);
        sc.close();
    }

    private static int lerOpcaoValida(String mensagem, int min, int max, Scanner sc) {
        int opcao;
        while (true) {
            System.out.println(mensagem);
            opcao = sc.nextInt();
            sc.nextLine();
            if (opcao >= min && opcao <= max)
                return opcao;
            System.out.println("\nOpção inválida. Tente novamente.");
        }
    }

    private static void contabilizarColaboradores(List<Colaborador> colaboradores) {
        int totalBackend = 0, totalMulheresFront = 0, totalHomensMobile40 = 0, totalNaoBinariosFullstack30 = 0;
        int somaIdades = 0, totalColaboradores = colaboradores.size();

        for (var colaborador : colaboradores) {
            somaIdades += colaborador.idade;

            if (colaborador.categoria == Categoria.BACKEND)
                totalBackend++;
            if (colaborador.categoria == Categoria.FRONTEND && (colaborador.genero == IdentidadeDeGenero.MULHERCIS
                    || colaborador.genero == IdentidadeDeGenero.MULHERTRANS))
                totalMulheresFront++;
            if (colaborador.categoria == Categoria.MOBILE && (colaborador.genero == IdentidadeDeGenero.HOMEMCIS
                    || colaborador.genero == IdentidadeDeGenero.HOMEMTRANS) && colaborador.idade > 40)
                totalHomensMobile40++;
            if (colaborador.categoria == Categoria.FULLSTACK && colaborador.genero == IdentidadeDeGenero.NAOBINARIO
                    && colaborador.idade < 30)
                totalNaoBinariosFullstack30++;
        }

        System.out.println("\nRelatório de colaboradores:\n");
        System.out.println("Número de pessoas desenvolvedoras backend: " + totalBackend);
        System.out.println("Número de Mulheres Cis e Trans desenvolvedoras Frontend: " + totalMulheresFront);
        System.out.println(
                "Número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + totalHomensMobile40);
        System.out.println(
                "Número de Não Binários desenvolvedores Fullstack menores de 30 anos: " + totalNaoBinariosFullstack30);
        System.out.println("Total de colaboradores que responderam a pesquisa: " + totalColaboradores);
        System.out.printf("Média de idade dos colaboradores: %.2f\n\n",
                (totalColaboradores > 0 ? somaIdades / (float) totalColaboradores : 0));
    }

    private record Colaborador(int idade, IdentidadeDeGenero genero, Categoria categoria) {
    }

    private enum IdentidadeDeGenero {
        MULHERCIS(1), HOMEMCIS(2), NAOBINARIO(3), MULHERTRANS(4), HOMEMTRANS(5), OUTRO(6);

        private final int codigo;
        private static final Map<Integer, IdentidadeDeGenero> MAP = new HashMap<>();

        static {
            for (var genero : values())
                MAP.put(genero.codigo, genero);
        }

        IdentidadeDeGenero(int codigo) {
            this.codigo = codigo;
        }

        public static IdentidadeDeGenero pegarCodigo(int codigo) {
            return Optional.ofNullable(MAP.get(codigo))
                    .orElseThrow(
                            () -> new IllegalArgumentException("Código inválido para IdentidadeDeGenero: " + codigo));
        }
    }

    private enum Categoria {
        BACKEND(1), FRONTEND(2), MOBILE(3), FULLSTACK(4);

        private final int codigo;
        private static final Map<Integer, Categoria> MAP = new HashMap<>();

        static {
            for (var categoria : values())
                MAP.put(categoria.codigo, categoria);
        }

        Categoria(int codigo) {
            this.codigo = codigo;
        }

        public static Categoria pegarCodigo(int codigo) {
            return Optional.ofNullable(MAP.get(codigo))
                    .orElseThrow(() -> new IllegalArgumentException("Código inválido para Categoria: " + codigo));
        }
    }
}
