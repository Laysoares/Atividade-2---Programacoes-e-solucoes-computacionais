
public class App {
    public static void main(String[] args) throws Exception {
        int termo1 = 0;
        int termo2 = 1;
        int contador = 2;

        System.out.println("Sequência de Fibonacci:");
        System.out.println(termo1);
        System.out.println(termo2);

        while (true) {
            int proximoTermo = termo1 + termo2;
            System.out.println(proximoTermo);
            termo1 = termo2;
            termo2 = proximoTermo;
            contador++;

            if (contador == 10) {
                break;
            }
        }

    }
}
