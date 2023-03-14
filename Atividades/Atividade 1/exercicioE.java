import javax.swing.JOptionPane;

public class exercicioE {
    public static void main(String args[]){
        String pergunta;
        double base;
        double altura;


        pergunta = JOptionPane.showInputDialog("Informa o valor da base do retângulo em cm: ");
        base = Double.parseDouble(pergunta);
        pergunta = JOptionPane.showInputDialog("Informa o valor da altura do retângulo em cm: ");
        altura = Double.parseDouble(pergunta);

        double area = base * altura;

        JOptionPane.showMessageDialog(null,"A área do retângulo equivale a " + area + " cm²");
    }
}
