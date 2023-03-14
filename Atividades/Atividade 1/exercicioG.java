import javax.swing.JOptionPane;

public class exercicioG {
    public static void main(String args[]){
        String pergunta;
        double perimetro;


        pergunta = JOptionPane.showInputDialog("Informa o valor do perímetro do círculo em cm: ");
        perimetro = Double.parseDouble(pergunta);

        double raio = perimetro/ (3.14*2);
        double area = 3.14 * (raio * raio);


        JOptionPane.showMessageDialog(null,"A área do círculo equivale a " + area + " cm²");
    }
}
