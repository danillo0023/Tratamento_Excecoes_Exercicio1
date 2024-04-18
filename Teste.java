package excecoes.exercicio1;

public class Teste {

    public static void main(String[] args) {
        System.out.println("Inicio do main");

        try {
            metodo1();
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Erro no acesso ao vetor: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.err.println("Erro de divisão por zero: " + e.getMessage());
        }

        System.out.println("Fim do main");
    }

    public static void metodo1() {
        System.out.println("Inicio do método 1");

        try {
            metodo2();
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Erro no acesso ao vetor no método 1: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.err.println("Erro de divisão por zero no método 1: " + e.getMessage());
        }

        System.out.println("Fim do método 1");
    }

    public static void metodo2() {
        System.out.println("Inicio do método 2");

        int[] vetor = new int[10];

        for (int i = 0; i <= 15; i++) {
            try {
                vetor[i] = i;
                System.out.println(i);
            } catch (IndexOutOfBoundsException e) {
                System.err.println("Erro de índice fora do limite do vetor: " + e.getMessage());
                break; // Sai do loop for ao detectar erro de índice
            }

            if (i == 9) {
                try {
                    int vlr = vetor[i] / vetor[0];
                    System.out.println(vlr);
                } catch (ArithmeticException e) {
                    System.err.println("Erro de divisão por zero: " + e.getMessage());
                }
            }
        }

        System.out.println("Fim do método 2");
    }
}

