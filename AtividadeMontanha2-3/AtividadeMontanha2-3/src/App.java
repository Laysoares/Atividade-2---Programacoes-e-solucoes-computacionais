import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int senha = 12345678;
        int senhaDigitada = 0;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Digite a senha de 8 digitos:");
            senhaDigitada = scanner.nextInt();

            if (senhaDigitada == senha) {
                System.out.println("Acesso concedido.");
                break;
            } else {
                System.out.println("Senha incorreta, tente novamente.");

            }

        }
        scanner.close();
    }
}
