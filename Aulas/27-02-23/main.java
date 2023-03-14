import javax.swing.JOptionPane;
public class main {
    public static void main(String args[]){
        //declarar uma var inteira
        int valor;
        valor = 3456;
        //declarar um numero decimal
        double x;
        x =  23.4849559;
        //declarar um unico caracter
        char opcao = 'a';
        //declarar valores logicos (V ou F)
        boolean ePresente = true;
        //declarar um texto
        String nome = "Thaina Lima";

        // para printar mensagem nos logs
        // System.out.println(x);


        // para printar mensagem na tela
        JOptionPane.showMessageDialog(null, "Variavel Inteira da gata: " + valor);
    }
}
