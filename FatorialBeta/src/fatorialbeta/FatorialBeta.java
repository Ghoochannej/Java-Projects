/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatorialbeta;

import java.util.Scanner;

/**
 *
 * @author Caio
 */
public class FatorialBeta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int aux, valor;
        Scanner teclado = new Scanner(System.in);
        
        valor = teclado.nextInt();
        
        int cont = valor;
        
        while(valor > 1){
            cont = cont * (valor - 1);
            valor--;
        }
        
        System.out.println(cont);
    }
    
}
