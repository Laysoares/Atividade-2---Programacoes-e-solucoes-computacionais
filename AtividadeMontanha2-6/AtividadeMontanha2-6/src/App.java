import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int options;

        do {
            System.out.println("Seleione uma opção:\n1 -Adicionar\n2 -Remover\n3 -Sair");
            options = scan.nextInt();
            if (options == 1) {
                System.out.println("Opção 1 Selecionada.");
                System.out.println("1 - Voltar ao menu\n2 - Sair do programa");
                options = scan.nextInt();
                if (options == 1) {
                    System.out.println("Voltando ao menu...");
                } else if (options == 2) {
                    System.out.println("Saindo do programa...");
                    break;
                }
            } else if (options == 2) {
                System.out.println("Opção 2 Selecionada.");
                System.out.println("1 - Voltar ao menu\n2 - Sair do programa");
                options = scan.nextInt();
                if (options == 1) {
                    System.out.println("Voltando ao menu...");
                } else if (options == 2) {
                    System.out.println("Saindo do programa...");
                    break;
                }
            } else if (options == 3) {
                System.out.println("Opção 3 Selecionada.");
                System.out.println("Saindo do programa...");
                break;
            } else {
                System.out.println("Saida do programa por caracter desconhecido.");
            }
        } while (options > 0 || options < 4);
        System.out.println("Sistema encerrado.");
        scan.close();
    }

}
