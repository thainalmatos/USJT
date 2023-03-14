import java.util.Scanner;

public class ParImpar {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero inteiro qualquer:");

        int numero = scanner.nextInt();
        
        if (numero % 2 != 0){
            System.out.println(numero + " é impar!");
        } 
        else {
            System.out.println(numero + " é par!");
        }
        scanner.close();
    }
}
