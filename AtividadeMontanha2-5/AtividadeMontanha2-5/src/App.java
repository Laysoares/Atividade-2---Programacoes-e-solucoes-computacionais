import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
          Scanner scan = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Digite um número entre 1 e 100: ");
            numero = scan.nextInt();

            if (numero < 1 || numero > 100) {
                System.out.println("Número inválido! Por favor, digite um número entre 1 e 100.");
            }
        } while (numero < 1 || numero > 100); 

        System.out.println("Número validado: " + numero);

        scan.close();
    }
}
    
