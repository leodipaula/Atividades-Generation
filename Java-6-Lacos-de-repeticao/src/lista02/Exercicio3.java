package lista02;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        lerEntradaDoUsuarioEVerificarIdades();
    }

    private static void lerEntradaDoUsuarioEVerificarIdades() {
        Scanner sc = new Scanner(System.in);
        int pessoasMenoresDe21 = 0, pessoasMaioresDe50 = 0;

        while (true) {
            System.out.println("Digite uma idade:");
            int idade = sc.nextInt();
            sc.nextLine();

            if (idade < 0) {
                break;
            } else if (idade < 21) {
                pessoasMenoresDe21++;
            } else if (idade > 50) {
                pessoasMaioresDe50++;
            }
        }
        System.out.println("\nPessoas com menos de 21 anos: " + pessoasMenoresDe21);
        System.out.println("\nPessoas com mais de 50 anos: " + pessoasMaioresDe50 + "\n");
        sc.close();
    }

}
