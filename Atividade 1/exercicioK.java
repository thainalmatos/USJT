import javax.swing.JOptionPane;

public class exercicioK {
    public static void main(String args[]){
        String pergunta;
        double salario_fixo;
        double vendas;

        pergunta = JOptionPane.showInputDialog("Informa seu salário fixo: ");
        salario_fixo = Double.parseDouble(pergunta);

        pergunta = JOptionPane.showInputDialog("Quanto você vendeu no mês atual? ");
        vendas = Double.parseDouble(pergunta);


        double comissao = vendas * 0.04;
        double salario_final = salario_fixo + vendas * 0.04;


        JOptionPane.showMessageDialog(null,"Você conseguiu R$" + comissao + " de comissão durante esse mês e receberá no final do mês um salario final de R$" + salario_final);
    }
}
