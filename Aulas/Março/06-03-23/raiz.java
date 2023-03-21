import javax.swing.JOptionPane;
public class raiz {
    public static void main(String args[]){
        String auxiliar;
        double numero;

        auxiliar = JOptionPane.showInputDialog("Digite um numero qualquer positivo");
        numero = Double.parseDouble(auxiliar);

        double raiz = Math.sqrt(numero);

        // para printar mensagem na tela
        JOptionPane.showMessageDialog(null, "A raiz de " + numero  + " = " + raiz);
    }
}
