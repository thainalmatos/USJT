import javax.swing.JOptionPane;

public class exercicioH {
    public static void main(String args[]){
        String pergunta;
        double percurso;
        double gasolina_km;


        pergunta = JOptionPane.showInputDialog("Informa a distância percorrida (em km): ");
        percurso = Double.parseDouble(pergunta);
        pergunta = JOptionPane.showInputDialog("Qual a quantidade de litros gastos por km? ");
        gasolina_km = Double.parseDouble(pergunta);

        double total = percurso * gasolina_km;

        JOptionPane.showMessageDialog(null,"Você gastou " + total + "L de gasolina durante o seu percurso.");
    }
}
