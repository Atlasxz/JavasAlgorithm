package bombevazao;
import javax.swing.JOptionPane;

public class BombEvazao {

    public static void main(String[] args) {
        
        int capCaixa, bombRecal, tHora, tMin, tSec;
        
            capCaixa = Integer.parseInt(JOptionPane.showInputDialog("Digite a capacidade da caixa d'água: "));        
            bombRecal = Integer.parseInt(JOptionPane.showInputDialog("Digite a vazão da bomba (em litros p/sec): "));
            tSec = capCaixa / bombRecal;
            
            tHora = tSec / 3600;
            tMin = (tSec % 3600) / 60;
            tSec = (tSec % 3600) % 60;
            

            JOptionPane.showMessageDialog(null,"A bomba demorará:\n"
                    + " - "+tHora+" Hora(s)\n"
                    + " - "+tMin+" Minuto(s)\n"
                    + " - "+tSec+" Segundo(s) para encher a caixa");
         
    }
    
}
