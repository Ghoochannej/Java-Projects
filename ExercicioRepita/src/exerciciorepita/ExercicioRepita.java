/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author Caio
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s = 0, cem = 0,par = 0,impar = 0, c = 0;
        float m;
        do{
        n = Integer.parseInt(JOptionPane.showInputDialog
        (null, "<html> Informe um valor <br><em>(valor 0 interrompe)</html>"));
        c++;
        if(n > 100){
            cem++;
        }
        if(n%2 == 0){
            par++;
        }else{
            impar++;
        }
        s += n;
        } while (n != 0);
        m = s/(c-1);
        JOptionPane.showMessageDialog(null, "<html>Resultado Final  "+ "<br><hr>Total de Valores " + (c-1) + "<br><hr> Somatório final " + s + 
                "<br><hr>Números acima de cem "+ cem + "<br><hr>Números pares " + (par-1) + "<br><hr>Números impares " + impar + "<br><hr>Média dos valores "+m +"</html>");
    }
    
}
