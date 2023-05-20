
package a_b_cTri;
import java.io.DataInputStream;
import java.io.IOException;
    
public class a_b_cTri {

   
        public static void main(String[] args)throws IOException {
        String s =" ";    
        float A = 0, B = 0, C = 0, Maior = 0;
        DataInputStream dado;
        try
        {
        System.out.println("Informe o valor A:");
        dado = new DataInputStream(System.in);
        s = dado.readLine();
        A = Float.parseFloat(s);
        System.out.println("Informe o valor B:");
        dado = new DataInputStream(System.in);
        s = dado.readLine();

        B = Float.parseFloat(s);
        dado = new DataInputStream(System.in);
        s = dado.readLine();
        C = Float.parseFloat(s);

        if ((A < B + C) && (B < A + C) && (C < A + B)){
            if ((A == B) && (B == C)){
                System.out.println("Triângulo Equilátero");
            }
            else if ((A == B) || (A == C) || (C == B)){
                System.out.println("Triângulo Isosceles");
            }
            else {
                System.out.println("Triângulo Escaleno");
            }
        }
        else {
            System.out.println("Não é triângulo");
        }
        }
        catch (IOException erro){
        }
      } 
}      
