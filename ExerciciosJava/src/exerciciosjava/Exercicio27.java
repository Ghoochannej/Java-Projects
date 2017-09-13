
package exerciciosjava;

import javax.swing.JOptionPane;

public class Exercicio27 {

    public static void Ex27(){
    
        double valorCarro = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira o valor do carro "));
        String combustivel = JOptionPane.showInputDialog(null, "Insira o tipo de combustível \n (álcool, gasolina ou diesel)" );
        double desconto = 0;
        double valorInicial = valorCarro;
        if(combustivel.equals("álcool")){
            desconto = valorCarro * 0.05;
            valorCarro = valorCarro - desconto;
        }else if(combustivel.equals("gasolina")){
            desconto = valorCarro * 0.21;
            valorCarro = valorCarro - desconto;
        }else if(combustivel.equals("diesel")){
            desconto = valorCarro * 0.14;
            valorCarro = valorCarro - desconto;
        }
        
        JOptionPane.showMessageDialog(null,"O valor inicial do carro era: "+ valorInicial+ "\n" +"O valor do desconto foi: " + desconto + "\n" + "O valor final do carro foi: " + valorCarro);
        
    }
       
}
