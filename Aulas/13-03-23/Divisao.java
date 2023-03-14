import java.util.Scanner;

public class Divisao {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro:");
        int numero = scanner.nextInt();

        System.out.println("Digite outro numero inteiro:");
        int numero2 = scanner.nextInt();
        
        double result = numero/numero2;

        System.out.println("O resultado da divisão é: " + result);
       
        scanner.close();
    }
}
