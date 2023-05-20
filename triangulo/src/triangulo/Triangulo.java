package triangulo;
import java.io.DataInputStream;
import java.io.IOException;
public class Triangulo {

    public static void main(String[] args) throws IOException {

        String s = "";
        float Alfa = 0, Beta = 0, Gama = 0, Maior = 0;
        DataInputStream dado;
        try 
    {        
   
    System.out.println("informe o valor Alfa:");
    dado = new DataInputStream(System.in);
    s = dado.readLine();
    Alfa = Float.parseFloat(s);
    System.out.println("Informe o valor Beta:");
    dado = new DataInputStream(System.in);
    s = dado.readLine();
    Beta = Float.parseFloat(s);
    Gama = (180- Alfa - Beta);
    System.out.println("O Gama é:"+Gama);

        if (Gama <= 0) {
            Maior = 1000;
        } 
        
        else {
            Maior = Alfa;
            System.out.println("O valor é: ");
        }
        
        if (Maior < Beta) {
            Maior = Beta;
            System.out.println("O valor é: ");
        }

        if (Maior < Gama) {
            Maior = Gama;
            System.out.println("O valor é: ");   
        }    
        

        if ((Maior >= 1 && Maior <= 89)){
            System.out.println("Triângulo Acutângulo");

        }    

        if ((Maior==90)){
            System.out.println("Triângulo Retângulo");
        }

        if ((Maior>=91 && Maior<=178)){
            System.out.println("Triângulo Obtusângulo");                
        }      
        }
        catch (IOException erro){
        }
    }
}
