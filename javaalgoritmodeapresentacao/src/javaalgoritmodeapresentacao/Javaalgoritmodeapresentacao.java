
package javaalgoritmodeapresentacao;
import javax.swing.JOptionPane;

public class Javaalgoritmodeapresentacao {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "A seguir digite seus dados");
        String nome = JOptionPane.showInputDialog("Digite seu nome");
        String sobrenome = JOptionPane.showInputDialog("Digite seu sobrenome");
        JOptionPane.showMessageDialog(null,"O nome e o sobrenome: "+nome+ " " + sobrenome);

    }
    
}
