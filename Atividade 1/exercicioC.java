import javax.swing.JOptionPane;

public class exercicioC {
    public static void main(String args[]){
        String pergunta;
        double salario_atual;


        pergunta = JOptionPane.showInputDialog("Informa seu salário atual: ");
        salario_atual = Double.parseDouble(pergunta);

        double salario_novo = salario_atual * 1.25;

        JOptionPane.showMessageDialog(null,"Seu salário passará a ser R$" + salario_novo + " após o aumento");
    }
}
