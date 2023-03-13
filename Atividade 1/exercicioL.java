import javax.swing.JOptionPane;

public class exercicioL {
        public static void main(String args[]){
            String pergunta;
            int data_nasc;
            int ano_atual;
    
    
            pergunta = JOptionPane.showInputDialog("Informa o ano que você nasceu: ");
            data_nasc = Integer.parseInt(pergunta);
            
            pergunta = JOptionPane.showInputDialog("Informa o ano atual: ");
            ano_atual = Integer.parseInt(pergunta);
    
            int idade = ano_atual - data_nasc;
    
            JOptionPane.showMessageDialog(null,"Você tem " + idade + " anos");
        }
}
