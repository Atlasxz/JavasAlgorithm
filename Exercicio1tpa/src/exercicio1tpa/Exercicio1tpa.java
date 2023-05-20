package exercicio1tpa;
import javax.swing.JOptionPane;

// 4 var = p1, p2,  t1, t2
// pesos das var = 3, 5, 1, 1
// media e frequencia

public class Exercicio1tpa {

    public static void main(String[] args) {
        
            float p1, p2, t1, t2, med, aulasDadas, aulasPresentes, freqPorcentagem, freq;

            JOptionPane.showMessageDialog(null,"A seguir digite as notas e aulas do aluno consultado: ");
            p1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota da primeira prova"));
            p2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota da segunda prova"));
            t1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota do primeiro trabalho"));
            t2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota do segundo trabalho"));
            aulasDadas = Integer.parseInt(JOptionPane.showInputDialog("Digite quantas aulas voce deu"));
            aulasPresentes = Integer.parseInt(JOptionPane.showInputDialog("Quantas presenças o aluno marcou"));

             med = ((p1*3)+(p2*5)+(t1*1)+(t2*1))/(3+5+1+1);
            freq = aulasPresentes/aulasDadas;

            freqPorcentagem = freq*100;    

        JOptionPane.showMessageDialog(null, "A média do aluno é: "+med);
        JOptionPane.showMessageDialog(null, "A frequência do Aluno é de: "+freqPorcentagem+"%");

           if (med >= 7 && freqPorcentagem >= 75) {
                JOptionPane.showMessageDialog(null, "O Aluno está aprovado!!");

            }

            else {
                JOptionPane.showMessageDialog(null, "O Aluno está reprovado");
            }

        }

    }
