import java.util.Scanner;

public class PositivoNegativo {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero qualquer:");

        double numero = scanner.nextDouble();
        
        if (numero >= 0.0){
            System.out.println(numero + " é positivo!");
        } 
        else {
            System.out.println(numero + " é negativo!");
        }
        scanner.close();
    }
}
