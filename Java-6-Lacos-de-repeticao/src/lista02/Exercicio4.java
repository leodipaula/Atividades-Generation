package lista02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        pesquisaInternaParaConhecerColaboradores();
    }

    private static void pesquisaInternaParaConhecerColaboradores() {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        String mensagemGenero = """
                \n#########################################
                 Como você se identifica?
                    1 - Mulher cis
                    2 - Homem cis
                    3 - Não binário
                    4 - Mulher Trans
                    5 - Homem Trans
                    6 - Outro
                #########################################\n
                """;
        String mensagemCategoria = """
                \n#########################################
                 Qual a sua categoria?
                    1 - Backend
                    2 - Frontend
                    3 - Mobile
                    4 - Fullstack
                #########################################\n
                """;
        List<Colaborador> colaboradores = new ArrayList<>();

        while (continuar) {
            System.out.println("Informe a idade do colaborador:");
            int idade = sc.nextInt();
            sc.nextLine();
            int genero = 0, categoria = 0;
            boolean generoInvalido = false, categoriaInvalida = false;

            do {
                System.out.println(mensagemGenero);
                genero = sc.nextInt();
                sc.nextLine();
                generoInvalido = genero < 1 || genero > 6;
                if (generoInvalido) {
                    System.out.println("\nOpção inválida. Tente novamente.");
                }
            } while (generoInvalido);

            do {
                System.out.println(mensagemCategoria);
                categoria = sc.nextInt();
                sc.nextLine();
                categoriaInvalida = categoria < 1 || categoria > 4;
                if (categoriaInvalida) {
                    System.out.println("\nOpção inválida. Tente novamente.");
                }
            } while (categoriaInvalida);

            Colaborador colaborador = new Colaborador(
                    idade, IdentidadeDeGenero.pegarCodigo(genero),
                    Categoria.pegarCodigo(categoria));

            colaboradores.add(colaborador);

            System.out.println("Colaborador cadastrado com sucesso!");
            System.out.println("Deseja cadastrar outro colaborador? (S/N)");

            continuar = sc.nextLine().equalsIgnoreCase("S");
        }
        contabilizarColaboradores(colaboradores);
        sc.close();
    }

    private static void contabilizarColaboradores(List<Colaborador> colaboradores) {
        int totalColaboradores = colaboradores.size(), totalMulheresCisETransFrontEnd = 0,
                totalNaoBinariosFullstackMenoresDe30Anos = 0, totalHomensCisETransMaioresDe40Anos = 0,
                totalBackend = 0, somaIdades = 0;

        for (var colaborador : colaboradores) {
            somaIdades += colaborador.idade;

            switch (colaborador.genero) {
                case HOMEMCIS, HOMEMTRANS -> {
                    if (colaborador.idade > 40 && colaborador.categoria == Categoria.MOBILE)
                        totalHomensCisETransMaioresDe40Anos++;
                }

                case MULHERTRANS, MULHERCIS -> {
                    if (colaborador.categoria == Categoria.FRONTEND)
                        totalMulheresCisETransFrontEnd++;
                }

                case NAOBINARIO -> {
                    if (colaborador.idade < 30 && colaborador.categoria == Categoria.FULLSTACK)
                        totalNaoBinariosFullstackMenoresDe30Anos++;
                }
                default -> {
                }
            }

            if (colaborador.categoria == Categoria.BACKEND) {
                totalBackend++;
            }
        }

        System.out.println("\nRelatório de colaboradores:");
        System.out.println("Número de pessoas desenvolvedoras backend: " + totalBackend);
        System.out.println(
                "Número de Mulheres Cis e Trans desenvolvedoras Frontend: " + totalMulheresCisETransFrontEnd);
        System.out.println(
                "Número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: "
                        + totalHomensCisETransMaioresDe40Anos);
        System.out.println(
                "Número de Não Binários desenvolvedores fullstack menores de 30 anos: "
                        + totalNaoBinariosFullstackMenoresDe30Anos);
        System.out.println("Total de colaboradores que responderam a pesquisa: " + totalColaboradores);
        System.out.printf("Média de idade dos colaboradores: %.2f\n",
                (totalColaboradores > 0 ? (somaIdades / (float) totalColaboradores) : 0));
    }

    private record Colaborador(int idade, IdentidadeDeGenero genero, Categoria categoria) {
    }

    private enum IdentidadeDeGenero {
        MULHERCIS(1),
        HOMEMCIS(2),
        NAOBINARIO(3),
        MULHERTRANS(4),
        HOMEMTRANS(5),
        OUTRO(6);

        private final int codigo;

        IdentidadeDeGenero(int codigo) {
            this.codigo = codigo;
        }

        public static IdentidadeDeGenero pegarCodigo(int codigo) {
            for (IdentidadeDeGenero genero : values()) {
                if (genero.codigo == codigo) {
                    return genero;
                }
            }
            throw new IllegalArgumentException("Código inválido para IdentidadeDeGenero: " + codigo);
        }
    }

    private enum Categoria {
        BACKEND(1),
        FRONTEND(2),
        MOBILE(3),
        FULLSTACK(4);

        private final int codigo;

        Categoria(int codigo) {
            this.codigo = codigo;
        }

        public static Categoria pegarCodigo(int codigo) {
            for (Categoria categoria : values()) {
                if (categoria.codigo == codigo) {
                    return categoria;
                }
            }
            throw new IllegalArgumentException("Código inválido para Categoria: " + codigo);
        }
    }
}
