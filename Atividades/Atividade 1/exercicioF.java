import javax.swing.JOptionPane;

public class exercicioF {
    public static void main(String args[]){
        String pergunta;
        double base;
        double altura;


        pergunta = JOptionPane.showInputDialog("Informa o valor da base do triângulo em cm: ");
        base = Double.parseDouble(pergunta);
        pergunta = JOptionPane.showInputDialog("Informa o valor da altura do triângulo em cm: ");
        altura = Double.parseDouble(pergunta);

        double area = (base * altura)/ 2;

        JOptionPane.showMessageDialog(null,"A área do triângulo equivale a " + area + " cm²");
    }
}
