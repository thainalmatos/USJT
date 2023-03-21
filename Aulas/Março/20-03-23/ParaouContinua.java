import java.util.Scanner;

public class ParaouContinua {
    public static void main (String args[]){
        int contador = 1;
        int continua = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vou começar a contar: ");

        while(continua == 1){
            System.out.println(contador);
            System.out.print("Digite 1 para continuar, ou 2 para parar: ");
            continua = scanner.nextInt();
            contador = contador +1 ;
        }
        scanner.close();
    }
}
