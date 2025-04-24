public class App {
    public static void main(String[] args) throws Exception {
        int[] numeros = { 2, 5, 8, 3, 7, 10, 4, 6, 9, 1 };
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        System.out.println("A soma dos elementos do vetor é: " + soma);
    }
}
