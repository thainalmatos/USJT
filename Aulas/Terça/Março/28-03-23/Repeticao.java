import java.util.Scanner;
public class Repeticao {
    public static void main (String[] args) {
        Scanner leitor = new Scanner(System.in);
        int stop = 0;
        while(stop == 0){
            System.out.println("Deseja sair? (0- Não!; 1 - Sim!)");
            stop = leitor.nextInt();
        }
        leitor.close();
    }


}
