import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scan.nextInt();

        if (numero < 0) {
            System.out.println("Número inválido! O fatorial só é definido para números não negativos.");
        } else {
            long fatorial = 1;

            for (int i = 1; i <= numero; i++) {
                fatorial = fatorial * i;
            }

            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }

        scan.close();
    }
}
