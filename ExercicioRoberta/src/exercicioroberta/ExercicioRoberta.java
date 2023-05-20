 package exercicioroberta;
import javax.swing.JOptionPane;

public class ExercicioRoberta {

    public static void main(String[] args) {

        String dados [][] = new String[100000][3];
        int linha, coluna;
        String saída  = "Nome: ";
        JOptionPane.showMessageDialog(null, "Entrada de dados");
        for (linha = 0; linha < 3; linha++) {
             dados[linha] [0] = JOptionPane.showInputDialog("Entre com o Nome:");
             dados[linha] [1] = JOptionPane.showInputDialog("Entre com a cidade:");
             dados[linha] [2] = JOptionPane.showInputDialog("Entre com o Estado:");
        }
        for (linha = 0; linha < 100000; linha++) {
            for (coluna = 0; coluna < 3; coluna++) {
                saída = saída.concat(dados[linha] [coluna]);
                if (coluna == 0) {
                    saída = saída.concat ("\nCidade: ");
                }
                   if (coluna == 1) {
                    saída = saída.concat ("\nEstado: ");
                }
            }
            JOptionPane.showMessageDialog(null, "Dados:\n" + saída);
            saída = "Nome: ";
                
        }
    }
}
