import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int soma = 0;
        int numero = 0;
        Scanner scanner = new Scanner(System.in);
        while (soma >= 0) {
            System.out.println("Digite um número:");
            numero = scanner.nextInt();
            if (numero < 0) {
                System.out.println("Número inserido é negativo, o programa encerrado.");
                break;
            }
            soma = soma + numero;
            System.out.println("Soma:" + soma);

        }
        scanner.close();
    }
}
