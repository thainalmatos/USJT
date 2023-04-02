import javax.swing.JOptionPane;
//mostrar os pares de 0 100
public class Pares0a100 {
    public static void main (String[] args) {
        String msg = "";
        for (int x=0; x <= 100; x = x + 2) {
            msg = msg + x + " ";
        }

        JOptionPane.showMessageDialog(null, msg, 
        "Pares de 0 a 100", JOptionPane.PLAIN_MESSAGE);
    }
}
