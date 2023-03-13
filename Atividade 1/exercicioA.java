import javax.swing.JOptionPane;

public class exercicioA {
    public static void main(String args[]){
        String pergunta;
        double primeiro_valor;
        double segundo_valor;
        double terceiro_valor;


        pergunta = JOptionPane.showInputDialog("Digite o 1º valor: ");
        primeiro_valor = Double.parseDouble(pergunta);
        pergunta = JOptionPane.showInputDialog("Digite o 2º valor: ");
        segundo_valor = Double.parseDouble(pergunta);
        pergunta = JOptionPane.showInputDialog("Digite o 3º valor: ");
        terceiro_valor = Double.parseDouble(pergunta);

        double multiplicacao = primeiro_valor * segundo_valor * terceiro_valor;

        JOptionPane.showMessageDialog(null,"O valor da multiplicação dos três valores apresentados será: " + multiplicacao);
    }

}