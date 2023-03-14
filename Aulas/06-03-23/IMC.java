import java.util.Scanner;

public class IMC {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("digite seu peso: ");
        double peso = sc.nextDouble();

        System.out.print("digite sua altura em metros: ");
        double altura = sc.nextDouble();

        double imc = peso/ Math.pow(altura, 2);

        System.out.println("imc = " + imc);

        sc.close();

    }
}
