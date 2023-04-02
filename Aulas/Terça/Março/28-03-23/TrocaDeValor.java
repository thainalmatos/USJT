public class TrocaDeValor {
    public static void main (String[] args) {
        int n1 = 13;
        int n2 = 15;
        int n3 = 10;
        int aux;

        if(n1 > n2) {
            aux = n1;
            n1 = n2;
            n2 = aux;
        } 
        if(n2 > n3) {
            aux = n2;
            n2 = n3;
            n3 = aux;
        }
        System.out.println("A ordem é: " + n1 + ", "+ n2 + ", "+ n3 + ".");
    }
}
