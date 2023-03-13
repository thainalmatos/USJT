import javax.swing.JOptionPane;

public class exercicioD {
    public static void main(String args[]){
        String pergunta;
        double salario_base;


        pergunta = JOptionPane.showInputDialog("Informa seu salário base: ");
        salario_base = Double.parseDouble(pergunta);

        double gratificacao = salario_base * 0.05;
        double imposto = salario_base * 0.07;
        double salario_novo = salario_base + gratificacao - imposto;


        JOptionPane.showMessageDialog(null,"Seu novo salário passará a ser R$" + salario_novo + ", ganhando R$" + gratificacao + " de gratificaçao encima do salário base e tendo de desconto R$" + imposto + " devido aos impostos");
    }
}
