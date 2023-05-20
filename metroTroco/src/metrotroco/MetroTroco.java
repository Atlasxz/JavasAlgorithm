package metrotroco;

import javax.swing.JOptionPane;

public class MetroTroco {

    public static void main(String[] args) {
        float vlEntregue, vlPassagem, vlTroco, TrocoTotal, vlFaltante;
        int moedaUm, moedaCinqC, moedaDezC, moedaUmC;
        
        vlEntregue = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor entregue pelo passageiro: "));
        vlPassagem = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da passagem: "));
        
        vlTroco = vlEntregue - vlPassagem;
        TrocoTotal = vlEntregue - vlPassagem;
        vlFaltante = vlPassagem - vlEntregue;
        vlTroco = vlTroco * 100;
       
        
        if (vlEntregue >= vlPassagem){
            moedaUm = (int) (vlTroco/100);
                vlTroco = vlTroco % 100;
            moedaCinqC = (int) (vlTroco/50);
                vlTroco = (vlTroco % 50);
            moedaDezC = (int) (vlTroco/10);
                vlTroco =(vlTroco % 10);
            moedaUmC = (int) (vlTroco/1);
            
            
            JOptionPane.showMessageDialog(null,"O troco será composto de:\n"
        + moedaUm+" moeda(s) de um real\n"
        + moedaCinqC+" moeda(s) de cinquenta centavos\n"
        + moedaDezC+" moeda(s) de dez centavos\n"
        + moedaUmC+" moeda(s) de um centavo\n"
        + "\nTroco Total - R$"+TrocoTotal);
        }
        else {
            JOptionPane.showMessageDialog(null,"Faltam R$"+vlFaltante+" para completar o valor da passagem");
        }
    }
    
}
