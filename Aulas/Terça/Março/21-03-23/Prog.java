import java.util.Scanner;
public class Prog {
    public static void main (String args[]){
        int idade1, idade2;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite idade um:");
        idade1 = leitor.nextInt();
        System.out.println("Digite idade dois:");
        idade2 = leitor.nextInt();
        
        System.out.println("Você digitou: " + idade1 + " e " + idade2);


        if (idade1 > idade2){
            System.out.println("a maior idade é: " + idade1);
        }if(idade1 < idade2){
            System.out.println("a maior idade é: " + idade2);
        }if ((idade1 == idade2)){
            System.out.println("São iguais");
        }

    }
}
