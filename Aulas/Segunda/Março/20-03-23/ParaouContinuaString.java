import java.util.Scanner;

public class ParaouContinuaString {
    public static void main (String args[]){
        int contador = 1;
        String continua = "sim";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vou começar a contar: ");


        // while(continua.equals("sim") || continua.equals("Sim"))
        while(continua.toUpperCase().equals("SIM")){
            System.out.println(contador);
            System.out.print("Digite sim para continuar e não para parar: ");
            continua = scanner.next();
            contador = contador +1 ;
        }
        scanner.close();
    }
}
