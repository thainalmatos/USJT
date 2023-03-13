import javax.swing.JOptionPane;

public class exercicioB {
    public static void main(String args[]){
        String pergunta;
        double P1;
        double P2;
        double P3;


        pergunta = JOptionPane.showInputDialog("Informa a nota P1: ");
        P1 = Double.parseDouble(pergunta);
        pergunta = JOptionPane.showInputDialog("Informa a nota P2: ");
        P2 = Double.parseDouble(pergunta);
        pergunta = JOptionPane.showInputDialog("Informa a nota P3: ");
        P3 = Double.parseDouble(pergunta);

        double MEDIA = ((P1*3)+(P2*3)+(P3*4))/(3+3+4);

        JOptionPane.showMessageDialog(null,"A média desse aluno será: " + MEDIA);
    }

}
