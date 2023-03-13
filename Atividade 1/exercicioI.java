import javax.swing.JOptionPane;

public class exercicioI {
        public static void main(String args[]){
            String pergunta;
            int idade;
            int ano_atual;
    
    
            pergunta = JOptionPane.showInputDialog("Informa sua idade: ");
            idade = Integer.parseInt(pergunta);
            
            pergunta = JOptionPane.showInputDialog("Informa o ano atual: ");
            ano_atual = Integer.parseInt(pergunta);
    
            int seculo = (ano_atual/100) +1;
            int inicio_prox_seculo = (seculo*100)+1 ;
            int result = (inicio_prox_seculo - ano_atual) + idade;

    
    
            JOptionPane.showMessageDialog(null,"Na virada do seculo você terá " + result + " anos");
        }
}
