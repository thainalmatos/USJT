import java.util.Scanner;

public class Media {
    public static void main(String args[]){
        int valor1, valor2, media;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro:");
        valor1 = scanner.nextInt();

        System.out.println("Digite outro numero inteiro:");
        valor2 = scanner.nextInt();

        media = ((valor1 + valor2) / 2);

        if (media >= 7){
            System.out.println("Parabéns você foi aprovado(a)! :)");

        }
        else{
            System.out.println("Poxa, você foi reprovado! :(");
        }

        scanner.close();
    }

}
