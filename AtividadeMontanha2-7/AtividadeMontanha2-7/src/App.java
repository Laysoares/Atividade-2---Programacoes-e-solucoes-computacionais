import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        
        int numeroAleatorio = random.nextInt(20) + 1;
        int tentativa=0;
        int palpite;

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 20.");

        do {
            System.out.print("Digite seu palpite: ");
            palpite = scan.nextInt();
            tentativa++;    

            if (palpite < numeroAleatorio) {
                System.out.println("O número é maior. Tente novamente!");
            } else if (palpite > numeroAleatorio) {
                System.out.println("O número é menor. Tente novamente!");
            } else {
                System.out.println("Parabéns! Você acertou o número " + numeroAleatorio + " em " + tentativa + " tentativas.");
            }

        } while (palpite != numeroAleatorio); 

        scan.close();
    }
}

