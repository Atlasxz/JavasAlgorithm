package tariSabesp;
import java.io.DataInputStream;
import java.io.IOException;
    
public class tariSabesp {

   
        public static void main(String[] args)throws IOException {
        String s;    
        double cubic, vlBase = 0, vlTotal = 0, x, y, z;
            x = 1.60;
            y = 2.90;
            z = 4.20;
        DataInputStream dado;
        try
        {
            System.out.println("Informe o valor de agua gasto em metros cubicos: ");
            dado = new DataInputStream(System.in);
            s = dado.readLine();
            cubic = Float.parseFloat(s);

// Faixas de Consumo
            
            if (cubic <= 20){
                
                vlBase = (x * cubic);
            }
            else if ((cubic > 20) && (cubic <=50)){
                vlBase = (y * cubic);
            }
            else if (cubic > 50){
                vlBase = (z * cubic);
            }
            
// Calculo de Taxa ou Desconto+
            
            if ((vlBase <= 100)){
                vlTotal = (vlBase * 0.05);  
            }
            else if ((vlBase > 100)){
                vlTotal = (vlBase * 1.10);        
            }
            System.out.println("O valor da conta é de: R$ "+vlTotal);
        }
        catch (IOException erro){
        }
      }
}      
