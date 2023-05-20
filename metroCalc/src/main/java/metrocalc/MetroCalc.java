package metrocalc;

import javax.swing.JOptionPane;

public class MetroCalc {

    public static void main(String[] args) {
        float vlEntregue, vlPassagem, vlTroco, moedaUm, moedaCinqC, moedaDezC, moedaUmC = 0;
        
        vlEntregue = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor entregue pelo passageiro: "));
        vlPassagem = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da passagem: "));
        vlTroco = vlEntregue - vlPassagem;
        
        
        if (vlEntregue >= vlPassagem){
            moedaUmC = (float) (vlTroco % 0.01);
        }
        System.out.println(moedaUmC);


    }
}
