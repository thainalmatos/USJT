import java.util.*;

public class Aluno {
        double nota1, nota2, media;

        Scanner leitor = new Scanner(System.in);

        void leitura(){
            System.out.println("Digite nota 1:");
            nota1 = leitor.nextDouble();

            System.out.println("Digite nota 2:");
            nota2 = leitor.nextDouble();
        }

        void calculaMedia(){
            media = (nota1 + nota2)/2;
        }

        void imprime(){
            System.out.println("Nota 1: " + nota1);
            System.out.println("Nota 2: " + nota2);
            System.out.println("Media: " + media);
        }
    
}