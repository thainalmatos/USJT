import javax.swing.JOptionPane;

public class exercicioJ {
    public static void main(String args[]){
        String pergunta;
        double nota1;
        double nota2;


        pergunta = JOptionPane.showInputDialog("Informa sua nota na primeira prova: ");
        nota1 = Double.parseDouble(pergunta);
        pergunta = JOptionPane.showInputDialog("Informa sua nota na segunda prova:: ");
        nota2 = Double.parseDouble(pergunta);

        double MEDIA = ((nota1*2)+(nota2*3))/(2+3);

        JOptionPane.showMessageDialog(null,"A média desse aluno será: " + MEDIA);
    }

}