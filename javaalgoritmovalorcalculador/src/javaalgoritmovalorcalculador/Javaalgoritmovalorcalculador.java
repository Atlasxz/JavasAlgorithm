
package javaalgoritmovalorcalculador;
import javax.swing.JOptionPane;



public class Javaalgoritmovalorcalculador {
    public static void main(String[] args) {
        
        int numero1, numero2,res;
        JOptionPane.showMessageDialog(null,"A seguir, calcula dois valores: ");
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
        res = numero1+numero2;
        JOptionPane.showMessageDialog(null, "O primeiro numero é: "+numero1+" O segundo numero é "+numero2+" - E o resultado é: "+res);
        
        
    }
    
}
