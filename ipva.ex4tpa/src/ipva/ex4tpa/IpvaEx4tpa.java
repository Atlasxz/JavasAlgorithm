
package ipva.ex4tpa;
import javax.swing.JOptionPane;

public class IpvaEx4tpa {

    public static void main(String[] args) {
        int IPVA, mesesCompra, valorVeiculo, confSouN, IPVAfinal;
        
            JOptionPane.showMessageDialog(null,"A seguir, insira os valores para o cálculo do IPVA");
            valorVeiculo = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do veículo:"));
            IPVA = valorVeiculo * (100/4);
            confSouN = JOptionPane.showConfirmDialog(null,"Você comprou o carro à menos de um ano?");
            
            if (confSouN == 0) {
                mesesCompra = Integer.parseInt(JOptionPane.showInputDialog("Há quantos meses você comprou este carro?"));
            IPVAfinal = (IPVA/12)*mesesCompra;
            }
            
            JOptionPane.showMessageDialog(null,"O Valor do IPVA é de: R$"+IPVA);

    }
    
}
