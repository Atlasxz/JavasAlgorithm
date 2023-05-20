package matrizaaaa;

import javax.swing.JOptionPane;

public class Matrizaaaa {

    public static void main(String[] args) {
        int A[][] = new int [4][4];
        int B[][] = new int [4][4];
        int C[][] = new int [4][4];
        int coluna, linha;
        
        JOptionPane.showMessageDialog(null,"Preenchendo a Matriz A");
        for (linha = 0; linha <=  3; linha++){
            for (coluna = 0; coluna <= 3; coluna++){
                A[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para inserir na coordenada |"+(linha+1)+"|"+(coluna+1)+"| da Matriz A"));

//                            System.out.println("Matriz - "+ A[linha][coluna]);

            }
        }
        JOptionPane.showMessageDialog(null,"Preenchendo a Matriz B");
        for (linha = 0; linha <= 3; linha++){
            for (coluna = 0; coluna <= 3; coluna++){
                B[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para inserir na coordenada |"+(linha+1)+"|"+(coluna+1)+"| da Matriz B"));
            }
        }
        
        
        // Fazer a soma das matrizes

        for (linha = 0; linha <= 3; linha++){
            for (coluna = 0; coluna <= 3; coluna++){
                C[linha][coluna] = A[linha][coluna] + B[linha][coluna];
            }
        }
        
        //Exibindo Resultado
        
        JOptionPane.showMessageDialog(null,"Conteúdo da matriz A:");
        for (linha = 0; linha <= 3; linha++){
            for (coluna = 0; coluna <= 3; coluna++){
                if (coluna < 3){
                }
                System.out.println("Matriz A |"+(linha+1)+"|"+(coluna+1)+"| - "+ A[linha][coluna]);
            }
        }
        
        JOptionPane.showMessageDialog(null,"Conteúdo da matriz B:");
        for (linha = 0; linha <= 3; linha++){
            for (coluna = 0; coluna <= 3; coluna++){
                if (coluna < 3){
                }
                System.out.println("Matriz B |"+(linha+1)+"|"+(coluna+1)+"| - "+ B[linha][coluna]);
            }
        }
        
        JOptionPane.showMessageDialog(null,"Conteúdo da matriz C:");
        for (linha = 0; linha <= 3; linha++){
            for (coluna = 0; coluna <= 3; coluna++){
                if (coluna < 3){
                }
                System.out.println("Matriz C |"+(linha+1)+"|"+(coluna+1)+"| - "+ C[linha][coluna]);
            }
        }
       
        
    }
    
}
