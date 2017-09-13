/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosjava;

import javax.swing.JOptionPane;

public class ExerciciosJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op =-1;
        while(op!=0){ 
        op = Integer.parseInt(JOptionPane.showInputDialog(null, "MENU\nInsira qual dos 5 exercicios você gostaria de ver\n\n"
                                                               
                                                                + "1 - Exercício 27\n"
                                                                + "2 - Exercício 36\n"
                                                                + "3 - Exercício 49\n"
                                                                + "4 - Exercício 54\n"
                                                                + "5 - Exercício 69\n"
                                                                + "0 - Sair"));
        
        if(op == 1){
            Exercicio27.Ex27();
        }else if(op == 2){
            Exercicio36.Ex36();
        }else if(op == 3){
            Exercicio49.Ex49();
        }else if(op == 4){
            Exercicio54.Ex54();
        }else if(op == 5){
            Exercicio69.Ex69();
        }else if(op == 0){
            System.exit(0);
        }else{
            JOptionPane.showMessageDialog(null, "Escolha uma opção válida");
        }
    
}
}
}