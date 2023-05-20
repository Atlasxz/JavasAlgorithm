package javaalgoritmoanosdevida;
import javax.swing.JOptionPane;

public class Javaalgoritmoanosdevida {

    public static void main(String[] args) {
        
        int anoNasc, idade, meses, dias;
        
        JOptionPane.showMessageDialog(null,"A seguir, insira seus dados: ");
        anoNasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento: "));
        idade = 2022 - anoNasc;
        meses = idade * 12;
        dias = 0;
        
        for(int ano = anoNasc; ano <= 2022; ano++) {
        
        if(anoNasc % 4 == 0){
            dias += 366;
        }else{
            dias += 365;
            }
        }
      
        JOptionPane.showMessageDialog(null,"Voce tem: "+idade+" anos"+" Voce viveu durante "+meses+" meses"+" Voce viveu durante: "+dias+" dias");
    }
    
}


        
    
