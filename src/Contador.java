import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Vamos brincar de Controle de Fluxo e Exceções!\nDigite um número inteiro: ");
        int num1 = scan.nextInt();
        System.out.println("Digite outro número inteiro: ");
        int num2 = scan.nextInt();

        try {

            contadorImprimidor(num1, num2);

        }catch (ParametrosInvalidosException exception) {
            System.out.println("\nO segundo parâmetro deve ser maior que o primeiro\n");
        }
    }

    static void contadorImprimidor(int num1, int num2 ) throws ParametrosInvalidosException {
        if (num1 > num2) {
            throw new  ParametrosInvalidosException();
        }
        int contagem = num2 - num1;

        for (int i = 0 ; i < contagem ; i++) {
            System.out.printf("Imprimindo o número %d\n", (i+1));
        }
    }
}

