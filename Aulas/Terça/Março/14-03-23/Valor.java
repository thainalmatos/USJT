import java.util.Scanner;

public class Valor {
    public static void main(String args[]){
        int valor1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro:");
        valor1 = scanner.nextInt();

        System.out.println("O valor digitado foi o: " + valor1);
        scanner.close();
    }
}
