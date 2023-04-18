import java.util.Scanner;

public class Prog {
    public static void main (String[] args) {
        Scanner leitor = new Scanner(System.in);
        int valor, maior;

        System.out.println("Digite um valor: (ou 0 para sair)");
        valor = leitor.nextInt();
        maior = valor;

        while(valor != 0){
            if (valor > maior){
                maior = valor;
            }
            System.out.println("Digite um valor: (ou 0 para sair)");
            valor = leitor.nextInt();
        }
        System.out.println("O  maior é " + maior);
        leitor.close();
    }

}
