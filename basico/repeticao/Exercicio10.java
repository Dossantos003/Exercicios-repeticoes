package flamingo.aprendendo.basico.repeticao;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Listar usuários");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

          
            switch (opcao) {
                case 1:
                    System.out.println("-> Usuário cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.println("-> Listando usuários cadastrados...");
                    break;
                case 3:
                    System.out.println("Sistema encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 3);

        scanner.close();
    }
}