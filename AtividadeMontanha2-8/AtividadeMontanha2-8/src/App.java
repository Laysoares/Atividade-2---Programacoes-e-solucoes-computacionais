import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner scan = new Scanner(System.in);
        double soma = 0;
        int contador = 0;
        char continuar= 's';
        double nota;
        do {
            System.out.print("Digite uma nota entre 0 e 10: ");
            nota = scan.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
                continue;
            }

            soma += nota;
            contador++;

            System.out.print("Deseja inserir outra nota? (s/n): ");
            continuar = scan.next().toLowerCase().charAt(0); 

        } while (continuar == 's'); 

        if (contador > 0) {
            double media = soma / contador;
            System.out.println("Média das notas inseridas: " + media);
        } else {
            System.out.println("Nenhuma nota válida foi inserida.");
        }

        scan.close();
    }
}

