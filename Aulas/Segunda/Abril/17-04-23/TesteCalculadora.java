import javax.swing.JOptionPane;

public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        int opcao = Integer.parseInt(
            JOptionPane.showInputDialog("Digite\n1 - soma\n2 - subtracao\n3 - multiplicacao\n4 - divisao")
        );
        int  num1 = Integer.parseInt(
            JOptionPane.showInputDialog("Digite o primeiro numero: ")
            
        );
        int  num2 = Integer.parseInt(
            JOptionPane.showInputDialog("Digite o segundo numero: ")
            
        );
        switch (opcao){
            case 1:
                JOptionPane.showMessageDialog(null, "soma = " + c.soma(num1, num2), "Resultado", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Subtracao = " + c.subtracao(num1, num2), "Resultado", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "multiplicacao = " + c.multiplicacao(num1, num2), "Resultado", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "divisao = " + c.divisao(num1, num2), "Resultado", JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(null, "operacao invalida", "resultado", JOptionPane.ERROR_MESSAGE);
        }

        
    }
}
