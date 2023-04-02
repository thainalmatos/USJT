//iniciar uma contagem e perguntar ao usuário se é para parar ou continuar
import java.util.Scanner;
public class ParaOuContinua {
    public static void main (String[] args) {
        int contador = 1;  //contador
        String continua = "sim";  //sentinela
        Scanner scanner = new Scanner(System.in);
        System.out.println ("vou comecar a contar: ");
        while (continua.toUpperCase().equals("SIM")) {
            System.out.println(contador);
            System.out.print ("digite sim para continuar, ou nao para parar: ");
            continua = scanner.next();
            contador = contador + 1;
        }
        scanner.close();
    }
}
